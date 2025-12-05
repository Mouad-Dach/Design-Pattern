package net.dach.TemplateMethodPattern;

import net.dach.TemplateMethodPattern.templates.CityTemplate;
import net.dach.TemplateMethodPattern.templates.Template;
import net.dach.TemplateMethodPattern.templates.TemplateImpl1;

public class Main {
    public static void main(String[] args) {
        Template template = new TemplateImpl1();
        System.out.println(template.perform(2,5));

        template = new CityTemplate();
        System.out.println(template.perform(2,5));
    }

}
