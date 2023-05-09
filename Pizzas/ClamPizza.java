package Pizzas;
import sauces.Sauce;
import Factories.PizzaIngredientFactory;
import Pizzas.Ingredients.Cheese;
import Pizzas.Ingredients.Clam;
import doughs.Dough;


public class ClamPizza extends Pizza {
    // To make a pizza now, we need a factory to provide the ingredients.
    PizzaIngredientFactory ingredientFactory;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;

    // class gets a factory
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
