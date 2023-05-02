package creational.factory_method.creator;

import creational.factory_method.product.FourCheeses;
import creational.factory_method.product.FourSeasons;
import creational.factory_method.product.Margarita;
import creational.factory_method.product.Pizza;

public abstract class Factory {

    public static Pizza createProduct(String pizzaName){
        pizzaName = pizzaName.toLowerCase();
        switch (pizzaName){
            case "margarita": return new Margarita();
            case "fourcheeses": return new FourCheeses();
            case "fourseasons": return new FourSeasons();
            default: throw new RuntimeException("Pizza does not exist");
        }
    }
}
