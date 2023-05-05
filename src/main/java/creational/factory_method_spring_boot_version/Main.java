package creational.factory_method_spring_boot_version;

import creational.factory_method_spring_boot_version.factories.Factory;
import creational.factory_method_spring_boot_version.product.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Map;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    private Map<String, Factory> factoryMap;

    @EventListener(ApplicationReadyEvent.class)
    public void test(){
        Book book1 = factoryMap.get("scienceFictionFactory").createBook();
        System.out.println(book1);
        Book book2 = factoryMap.get("youngAdultFactory").createBook();
        System.out.println(book2);
        Book book3 = factoryMap.get("darkFantasyFactory").createBook();
        System.out.println(book3);
    }
}
