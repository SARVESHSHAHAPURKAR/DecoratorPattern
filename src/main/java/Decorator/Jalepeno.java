package Decorator;

import Pizza.BasePizza;

public class Jalepeno extends Topping{

    BasePizza pizza;

    public Jalepeno(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost()+30;
    }
}
