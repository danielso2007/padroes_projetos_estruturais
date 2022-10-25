package br.com.estruturais.decorator.coffeeShop;

import static java.lang.System.*;
import br.com.estruturais.decorator.coffeeShop.model.Drink;
import br.com.estruturais.decorator.coffeeShop.model.Expresso;
import br.com.estruturais.decorator.coffeeShop.model.Tea;
import br.com.estruturais.decorator.coffeeShop.model.decorators.DoubleDrink;
import br.com.estruturais.decorator.coffeeShop.model.decorators.Milk;

public class Client {

    public static void order(String name, Drink drink) {
        out.println("Ordering a " + name);
        drink.serve();
        out.println(drink.getPrice());
        out.println("---------------");
    }

    public static void main(String[] args) {
        order("Expresso", new Expresso());
        order("Tea", new Tea());
        order("Lungo", new DoubleDrink(new Expresso()));
        order("Cafe Au Lait", new Milk(new Expresso()));
        order("English Tea", new Milk(new Tea()));
    }
}
