package br.com.estruturais.adapter.tvPort.devices;

import static java.lang.System.*;
import br.com.estruturais.adapter.tvPort.intefaces.HDMI;

public class TV implements HDMI {

    @Override
    public void setImage(String image) {
        out.println(">>> This is your video: " + image);
    }

    @Override
    public void setSound(String sound) {
        out.println(">>> This is your sound: " + sound);
    }

}
