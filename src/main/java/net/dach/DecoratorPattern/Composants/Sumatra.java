package net.dach.DecoratorPattern.Composants;

public class Sumatra extends Boisson {
    public Sumatra() {
        description = "Sumatra";
    }

    @Override
    public double cout() {
        return 6;
    }

}
