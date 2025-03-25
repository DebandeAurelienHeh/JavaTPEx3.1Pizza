package pizza.services;

public class Main {
    public static void main(String[] args) {

        Pizza pizzaFine = new Fine();
        System.out.println(pizzaFine.getDescription());
        System.out.println(pizzaFine.cost());

        Pizza boulettes = new Boulettes(pizzaFine);
        System.out.println(boulettes.getDescription());
        System.out.println("prix final: " + boulettes.cost());


    }
}
