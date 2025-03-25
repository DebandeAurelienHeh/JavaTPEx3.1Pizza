package pizza.services;

public class Fine implements Pizza {

    @Override
    public String getDescription() {
        return "Fine Pizza";
    }

    @Override
    public double cost() {
        return 10;
    }
}
