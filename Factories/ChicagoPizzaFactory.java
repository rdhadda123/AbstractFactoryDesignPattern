package Factories;

import Pizzas.Ingredients.Cheese;
import Pizzas.Ingredients.Clam;
import Pizzas.Ingredients.Pepperoni;
import Pizzas.Ingredients.Veggies;
import Pizzas.Ingredients.cheeseTypes.MozzarellaCheese;
import Pizzas.Ingredients.clamTypes.FrozenClams;
import Pizzas.Ingredients.veggieTypes.Garlic;
import Pizzas.Ingredients.veggieTypes.Mushroom;
import Pizzas.Ingredients.veggieTypes.Onion;
import Pizzas.Ingredients.veggieTypes.RedPepper;
import doughs.Dough;
import doughs.ThickCrustDough;
import sauces.PlumTomatoeSauce;
import sauces.Sauce;

public class ChicagoPizzaFactory implements PizzaIngredientFactory {
    
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Sauce createSauce() {
        return new PlumTomatoeSauce();
    }

    public Clam createClam() {
        return new FrozenClams();
    }

    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Garlic(), new Onion(), new Mushroom(), new RedPepper()
        };
        return veggies;
    }
}
