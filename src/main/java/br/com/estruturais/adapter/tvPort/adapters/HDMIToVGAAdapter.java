package br.com.estruturais.adapter.tvPort.adapters;

import static java.lang.System.*;
import br.com.estruturais.adapter.tvPort.intefaces.HDMI;
import br.com.estruturais.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        out.println("Conecting the HDMI/VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        out.println("Converting the image from HDMI to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        out.println("Sorry, We don`t work with sound");
    }
}
