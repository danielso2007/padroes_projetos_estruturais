package br.com.estruturais.decorator.coffeeShop.model;

import static java.lang.System.*;

public class Expresso implements Drink {

    @Override
    public void serve() {
        out.println("- Adding 50ml of expresso");
    }

    @Override
    public Double getPrice() {
        return 1.5d;
    }

}
