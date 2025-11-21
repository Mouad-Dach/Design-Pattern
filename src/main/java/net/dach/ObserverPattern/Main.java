package net.dach.ObserverPattern;

import net.dach.ObserverPattern.obs.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer       o1         = new ObserverImpl1();
        Observer       o2         = new ObserverImpl2();
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable o) {
                if(o instanceof ObservableImpl observable){
                    System.out.println("+++++++++ OBS Impl 3 +++++++++");
                    System.out.println("Res ="+ ((ObservableImpl) o).getState() * Math.cos(((ObservableImpl) o).getState()));

                }
            }

        });

        observable.setState(60);
        observable.setState(80);
        observable.unsubscribe(o2);
        observable.setState(100);

        Button button = new Button("OK");
        button.addActionListener(e ->{
            System.out.println(e.getSource());
        });
    }
}