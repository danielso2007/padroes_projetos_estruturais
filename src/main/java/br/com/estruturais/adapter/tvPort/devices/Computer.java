package br.com.estruturais.adapter.tvPort.devices;

import static java.lang.System.*;
import br.com.estruturais.adapter.tvPort.intefaces.HDMI;

public class Computer {
    private HDMI port;

    public void connectPort(HDMI screen) {
        out.println("Connecting on HDMI port...");
        this.port = screen;
    }

    public void sendImageAndSound(String image, String sound) {
        if (port == null) {
            out.println("Connect a HDMI cable first");
        } else {
            port.setImage(image);
            port.setSound(sound);
        }
    }
}
