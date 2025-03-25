package pizza.services;

public abstract class DecorateurIngredient implements Pizza{

    public String description = "";
    protected Pizza pizza;


    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return 0;
    }
}
