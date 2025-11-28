package net.dach.DecoratorPattern.Decorator;

import net.dach.DecoratorPattern.Composants.Boisson;

public abstract class Decorator extends Boisson {
    protected Boisson boisson;

    public Decorator(Boisson boisson) {
        this.boisson = boisson;
    }
}
