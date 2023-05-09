package Factories;

import Pizzas.Ingredients.Cheese;
import Pizzas.Ingredients.Clam;
import Pizzas.Ingredients.Pepperoni;
import Pizzas.Ingredients.Veggies;
import Pizzas.Ingredients.cheeseTypes.ReggianoCheese;
import Pizzas.Ingredients.veggieTypes.Garlic;
import Pizzas.Ingredients.veggieTypes.Mushroom;
import Pizzas.Ingredients.veggieTypes.Onion;
import Pizzas.Ingredients.veggieTypes.RedPepper;
import doughs.Dough;
import doughs.ThinCrustDough;
import sauces.MarinaraSauce;
import sauces.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        System.out.println("Rolling out some ThinCrust Dough");

        return new ThinCrustDough();
    }

    public Cheese createCheese() {
        System.out.println("sprinkling some good ol Parmeggiano Reggiano.");

        return new ReggianoCheese();
    }

    public Sauce createSauce() {
        System.out.println("Marinara it up!");

        return new MarinaraSauce();
    }

    public Veggies[] createVeggies() {
        System.out.println("Yum, Veggies.");

        Veggies veggies[] = {
                new Garlic(), new Onion(), new Mushroom(), new RedPepper()
        };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        System.out.println("Gonna throw on a few pepperoners on here!");

        return new Pepperoni();

    }

    public Clam createClam() {
        System.out.println("Yum, Clams");

        return new Clam();
    }
}
