package net.dach.AdapterPattern.computer.adapter;

import net.dach.AdapterPattern.computer.Hdmi;
import net.dach.AdapterPattern.computer.TV;
import net.dach.AdapterPattern.computer.Vga;

public class HdmiVgaAdapterH extends TV implements Vga {

    @Override
    public void print(String message) {
        System.out.println("§§§§ Adapter §§§");
        byte[] data=message.getBytes();
        super.view(data);
        System.out.println("§§§§ / Adapter §§§");


    }



}
