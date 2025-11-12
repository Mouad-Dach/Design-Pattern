package net.dach.PatternDecorator.Decorator;

import net.dach.PatternDecorator.Composants.Boisson;

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
