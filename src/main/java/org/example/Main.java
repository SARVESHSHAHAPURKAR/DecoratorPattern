package org.example;

import Decorator.ExtraCheese;
import Decorator.Jalepeno;
import Decorator.Mushroom;
import Pizza.Barbeque;
import Pizza.BasePizza;

public class Main {
    public static void main(String[] args){

        BasePizza pizza = new Jalepeno(new Mushroom(new ExtraCheese(new ExtraCheese(new Barbeque()))));

        System.out.println("Total cost is "+ pizza.cost());

    }
}