package pizza.services;

public class Boulettes extends DecorateurIngredient {

    public Boulettes(Pizza pizza) {
        this.pizza = pizza;
        super.description = "Boulettes";
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " " + super.description;
    }

    @Override
    public double cost() {
        return 1.5 + pizza.cost();
    }
}
