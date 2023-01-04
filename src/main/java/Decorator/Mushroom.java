package Decorator;

import Pizza.BasePizza;

public class Mushroom extends Topping{

    BasePizza pizza;

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost()+20;
    }
}
