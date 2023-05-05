package creational.factory_method_spring_boot_version.factories;

import creational.factory_method_spring_boot_version.product.Book;
import creational.factory_method_spring_boot_version.product.YoungAdult;
import org.springframework.stereotype.Service;

@Service
public class YoungAdultFactory extends Factory{

    @Override
    public Book createBook() {
        return new YoungAdult();
    }
}
