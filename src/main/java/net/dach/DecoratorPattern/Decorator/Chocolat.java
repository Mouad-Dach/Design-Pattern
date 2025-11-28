package net.dach.DecoratorPattern.Decorator;

import net.dach.DecoratorPattern.Composants.Boisson;

public class Chocolat extends Decorator {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

@Override
public String getDescription(){
        return boisson.getDescription()+", Au Chocolat";
}

   @Override
    public double cout(){
       return 1.2+boisson.cout();
   }
}
