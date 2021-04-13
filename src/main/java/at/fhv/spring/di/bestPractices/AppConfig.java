package at.fhv.spring.di.bestPractices;

import at.fhv.spring.di.bestPractices.beans.MyService;
import at.fhv.spring.di.bestPractices.nonAutowired.controllers.XMLBasedConstructorController;
import at.fhv.spring.di.bestPractices.nonAutowired.controllers.XMLBasedSetterController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("MyService")
    public MyService getService() {
        return new MyService();
    }

    @Bean("XMLBasedConstructorController")
    public XMLBasedConstructorController getController() {
        return new XMLBasedConstructorController(new MyService());
    }

    @Bean("XMLBasedSetterController")
    public XMLBasedSetterController getSetterController() {
        XMLBasedSetterController xmlBasedSetterController = new XMLBasedSetterController();
        xmlBasedSetterController.setService(new MyService());
        return xmlBasedSetterController;
    }

}
