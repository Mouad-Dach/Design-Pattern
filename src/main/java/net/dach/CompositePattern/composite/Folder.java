package net.dach.CompositePattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
  private List<Component> component=new ArrayList<>();
    public Folder(String name) {
        super(name);
    }


    @Override
public void print() {

        System.out.println(getTab()+"Folder: "+ name);
        for (Component c : component) {
            c.print();
        }
    }

     public Component addChild(Component component){
            component.level=this.level+1;
            this.component.add(component);
            return component;
        }

    }


