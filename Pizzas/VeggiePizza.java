package Pizzas;
import doughs.Dough;
import sauces.Sauce;
import Factories.PizzaIngredientFactory;
import Pizzas.Ingredients.Cheese;
import Pizzas.Ingredients.Veggies;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    

    public void prepare() {
        dough = ingredientFactory.createDough();

        sauce = ingredientFactory.createSauce();

        cheese = ingredientFactory.createCheese();

        veggies = ingredientFactory.createVeggies();

    }
}