package net.dach.DecoratorPattern;

import net.dach.DecoratorPattern.Composants.Boisson;
import net.dach.DecoratorPattern.Composants.Sumatra;
import net.dach.DecoratorPattern.Decorator.Caramel;
import net.dach.DecoratorPattern.Decorator.Chocolat;
import net.dach.DecoratorPattern.Decorator.Noisette;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;

        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("----------------");

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("----------------");

        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        Boisson b;
        b= new Chocolat(new Caramel(new Chocolat(new Caramel(new Noisette(new Sumatra())))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());


    }

}
