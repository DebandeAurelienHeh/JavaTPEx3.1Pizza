package pizza.services;

public class Fourre implements Pizza{

    @Override
    public String getDescription() {
        return "Fourre Pizza";
    }

    @Override
    public double cost() {
        return 12;
    }
}
