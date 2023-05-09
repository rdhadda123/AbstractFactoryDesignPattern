package Factories;
import Pizzas.Ingredients.Cheese;
import Pizzas.Ingredients.Clam;
import Pizzas.Ingredients.Pepperoni;
import Pizzas.Ingredients.Veggies;
import doughs.Dough;
import sauces.Sauce;

public interface PizzaIngredientFactory {
   
    
    
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clam createClam();
    
}
