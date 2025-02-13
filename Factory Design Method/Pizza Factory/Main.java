interface Pizza{
     void prepare();
}

class VegPizza implements Pizza{
    public void prepare(){
        System.out.println("Veg Pizza is Prepared.....");
    }
}

class CheesePizza implements Pizza{
    public void prepare(){
        System.out.println("Cheese Pizza is prepared...");
    }
}

abstract class PizzaFactory{
   abstract Pizza createPizza();
}

class CheesePizzaFactory extends PizzaFactory{

    Pizza createPizza(){
        return new CheesePizza();
    }
}

class VegPizzaFactory extends PizzaFactory{

    Pizza createPizza(){
        return new VegPizza();
    }
}

class PizzaStore{

    private Pizza orderedPizza;

    public PizzaStore(PizzaFactory pizza){
        orderedPizza = pizza.createPizza();
    }


    public Pizza getPizza(){
        return orderedPizza;
    }
}

public class Main{
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new VegPizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        Pizza orderedPizza = pizzaStore.getPizza();
        orderedPizza.prepare();
    }



}
