package br.com.estruturais.decorator.coffeeShop.model;

import static java.lang.System.*;

public class Tea implements Drink {

    @Override
    public void serve() {
        out.println("- Adding 100ml of tea");
    }

    @Override
    public Double getPrice() {
        return 1d;
    }

}
