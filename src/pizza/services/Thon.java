package pizza.services;

public class Thon extends DecorateurIngredient {

    public Thon(Pizza pizza) {
        this.pizza = pizza;
        super.description = "Thon";
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " " + super.description;
    }

    @Override
    public double cost() {
        return 2.0 + pizza.cost();
    }
}
