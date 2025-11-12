package net.dach.PatternDecorator.Decorator;

import net.dach.PatternDecorator.Composants.Boisson;

public abstract class Decorator extends Boisson {
    protected Boisson boisson;

    public Decorator(Boisson boisson) {
        this.boisson = boisson;
    }
}
