package pizza.services;

public class Classique implements Pizza{

    @Override
    public String getDescription() {
        return "Classic Pizza";
    }

    @Override
    public double cost() {
        return 8;
    }
}
