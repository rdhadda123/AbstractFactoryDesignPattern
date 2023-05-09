package Pizzas;
import sauces.Sauce;
import Factories.PizzaIngredientFactory;
import Pizzas.Ingredients.Cheese;
import doughs.Dough;


public class CheesePizza extends Pizza {
    // To make a pizza now, we need a factory to provide the ingredients.
    PizzaIngredientFactory ingredientFactory;
    Dough dough;
    Sauce sauce;
    Cheese cheese;


    // class gets a factory
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing ");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}