# DecoratorPattern

Used when the decorator (wrapper class) needs to maintain a has-a as well as is-a relationship with the base class, and we are not sure how many wrappings will be there.

eg: A pizza can have multiple toppings, it is not feasible to create a class for each permutation of the toppings. Thus topping is a decorator, and pizza is the base class.
Topping exhibits has-a and is-a relationship with pizza --> Topping itself is a pizza, and also has a pizza object.

Use cases : Pizza, Coffee vending machine, car design etc
