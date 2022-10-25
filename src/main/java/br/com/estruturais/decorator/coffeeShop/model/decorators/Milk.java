package br.com.estruturais.decorator.coffeeShop.model.decorators;

import static java.lang.System.*;
import br.com.estruturais.decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        out.println("- Adding 30ml of Milk");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.5d;
    }

}