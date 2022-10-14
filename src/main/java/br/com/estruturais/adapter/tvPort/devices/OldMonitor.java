package br.com.estruturais.adapter.tvPort.devices;

import static java.lang.System.*;
import br.com.estruturais.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {

    @Override
    public void setImage(String image) {
        out.println(">>> This is your video: " + image);
    }

}
