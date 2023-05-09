package Pizzas;
import sauces.Sauce;
import Pizzas.Ingredients.Cheese;
import Pizzas.Ingredients.Clam;
import doughs.Dough;

public abstract class Pizza {
    // each pizza has a name and ingredients
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;

    public abstract void prepare();

    public void bake() {
    System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
        System.out.println("========================================");
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public String toString() {
        String lineOne = "name: " + name;

        return lineOne;
    }
}


