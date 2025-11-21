package net.dach.DecoratorPattern.Decorator;

import net.dach.DecoratorPattern.Composants.Boisson;

public class Noisette extends Decorator {
    public Noisette(Boisson boisson) {
        super(boisson);
    }

@Override
public String getDescription(){
        return boisson.getDescription()+", Au Noisette";
}

   @Override
    public double cout(){
       return 1.2+boisson.cout();
   }
}
