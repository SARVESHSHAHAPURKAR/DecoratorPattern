package Decorator;

import Pizza.BasePizza;

// DECORATOR ABSTRACT CLASS
// MAINTAINS BOTH HAS-A AND IS-A RELATIONSHIP WITH BASE CLASS (BASE PIZZA)
public abstract class Topping extends BasePizza {

    public abstract int cost();
}
