package net.dach.StrategyPattern;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
       Scanner                scanner     = new Scanner(System.in);
       Map<String,Strategy> strategyMap = new HashMap<>();
       Strategy strategy;
       while (true){
           System.out.println("Quelle Strategie?");
           String str=scanner.nextLine();
           strategy=strategyMap.get(str);
           if (strategy == null) {
               System.out.println("Creation d'un nouvel objet de StrategyImpl" + str);
               strategy = (Strategy) Class.forName("net.dach.StrategyPattern.StrategyImpl" + str).getConstructor().newInstance();
               strategyMap.put(str, strategy);
           }
           context.setStrategy(strategy);
           context.effectuerOperation();
       }
    }
}
