package Pizzas;
import doughs.Dough;
import sauces.Sauce;
import Factories.PizzaIngredientFactory;
import Pizzas.Ingredients.Cheese;
import Pizzas.Ingredients.Pepperoni;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
