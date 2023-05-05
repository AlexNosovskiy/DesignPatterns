package creational.factory_method_spring_boot_version.config;

import creational.factory_method_spring_boot_version.factories.Factory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Map<String, Factory> factoryMap(List<Factory> factories){
        HashMap<String, Factory> factoryMap = new HashMap<>();
        for (Factory factory : factories) {
            factoryMap.put(factory.getClass().getName(), factory);
        }
        return factoryMap;
    }
}
