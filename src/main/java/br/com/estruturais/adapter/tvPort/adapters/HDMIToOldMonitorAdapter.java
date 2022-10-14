package br.com.estruturais.adapter.tvPort.adapters;

import static java.lang.System.*;
import br.com.estruturais.adapter.tvPort.devices.OldMonitor;
import br.com.estruturais.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        out.println("Wrapping the VGA's OldMonitor's Interface with a HDMI adapter...");
    }

    @Override
    public void setImage(String image) {
        out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        out.println("Sorry, We don`t work with sound");
    }
}
