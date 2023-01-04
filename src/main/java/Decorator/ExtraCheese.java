package Decorator;

import Pizza.BasePizza;

public class ExtraCheese extends Topping{

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost()+10;
    }
}
