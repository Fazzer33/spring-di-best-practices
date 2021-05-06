package at.fhv.spring.di.bestPractices;

import at.fhv.spring.di.bestPractices.beans.MyService;
import at.fhv.spring.di.bestPractices.nonAutowired.components.ConfigFileConstructorComponent;
import at.fhv.spring.di.bestPractices.nonAutowired.components.ConfigFileSetterComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("MyService")
    public MyService getService() {
        return new MyService();
    }

    @Bean("ConfigFileConstructorComponent")
    public ConfigFileConstructorComponent getComponent() {
        return new ConfigFileConstructorComponent(new MyService());
    }

    @Bean("ConfigFileSetterComponent")
    public ConfigFileSetterComponent getSetterComponent() {
        ConfigFileSetterComponent configFileSetterComponent = new ConfigFileSetterComponent();
        configFileSetterComponent.setService(new MyService());
        return configFileSetterComponent;
    }

}
