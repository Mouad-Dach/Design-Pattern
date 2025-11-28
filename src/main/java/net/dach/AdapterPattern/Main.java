package net.dach.AdapterPattern;

import net.dach.AdapterPattern.computer.*;
import net.dach.AdapterPattern.computer.adapter.HdmiVgaAdapter;
import net.dach.AdapterPattern.computer.adapter.HdmiVgaAdapterH;

public class Main {
    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga(new Monitor());
        uniteCentre.print("Bonjour");
        uniteCentre.setVga(new VideoProjector());
        uniteCentre.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonjour Master BDCC Design Pattern");

        HdmiVgaAdapterH hdmiVgaAdapterH =new HdmiVgaAdapterH();
        uniteCentre.setVga(hdmiVgaAdapterH);
        hdmiVgaAdapter.print("TEST Master BDCC Design Pattern");


        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("Hello Super");

        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("Hello HD");


    }
}
