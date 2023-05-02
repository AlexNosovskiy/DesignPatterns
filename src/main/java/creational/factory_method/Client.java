package creational.factory_method;


import creational.factory_method.creator.Factory;

public class Client {
    public static void main(String[] args) {

        System.out.println(Factory.createProduct("Margarita"));
    }
}
