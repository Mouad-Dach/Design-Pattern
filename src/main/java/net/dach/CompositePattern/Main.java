package net.dach.CompositePattern;


import net.dach.CompositePattern.composite.File;
import net.dach.CompositePattern.composite.Folder;

public class Main {
    public static void main(String[] args) {
        Folder root=new Folder("/");
        root.addChild(new File("Test.java"));
        root.addChild(new File("Config.xml"));
        Folder entities = (Folder) root.addChild(new Folder("entities"));
        Folder repo = (Folder) root.addChild(new Folder("repositories"));
        entities.addChild(new File("Products.java"));
        entities.addChild(new File("Category.java"));
        repo.addChild(new File("ProductRepository.java"));
        repo.addChild(new File("CategoryRepository.java"));
        repo.addChild(new Folder("SubRepo"));
        root.print();


    }

}
