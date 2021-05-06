package at.fhv.spring.di.bestPractices;

import at.fhv.spring.di.bestPractices.autowired.components.ConstructorComponent;
import at.fhv.spring.di.bestPractices.autowired.components.FieldComponent;
import at.fhv.spring.di.bestPractices.autowired.components.SetterComponent;
import at.fhv.spring.di.bestPractices.carExample.*;
import at.fhv.spring.di.bestPractices.nonAutowired.components.ConfigFileConstructorComponent;
import at.fhv.spring.di.bestPractices.nonAutowired.components.ConfigFileSetterComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class ApplicationTests {

    @Autowired
    FieldComponent fieldComponent;

    @Autowired
    ConstructorComponent constructorComponent;

    @Autowired
    SetterComponent setterComponent;

    @Test
    void testAutoWiredComponents() {
        System.out.println("Test with AutoWired Components:\n");

        System.out.println("Field Component says: " + fieldComponent.saySomething());
        System.out.println("Constructor Component says: " + constructorComponent.saySomething());
        System.out.println("Setter Component says: " + setterComponent.saySomething());
    }

    @Test
    void testWithJavaConfigClass() {
        System.out.println("Test with java config file:\n");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigFileConstructorComponent component = (ConfigFileConstructorComponent) ctx.getBean("ConfigFileConstructorComponent");
        ConfigFileSetterComponent setterComponent = (ConfigFileSetterComponent) ctx.getBean("ConfigFileSetterComponent");
        System.out.println("Constructor Component says: " + component.saySomething());
        System.out.println("Setter Component says: " + setterComponent.saySomething());
    }

    @Test
    void testWithXMLConfigFile() {
        System.out.println("Test with XML config file: \n");

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        ConfigFileConstructorComponent component = ctx.getBean("ConfigFileConstructorComponent", ConfigFileConstructorComponent.class);
        ConfigFileSetterComponent setterComponent = ctx.getBean("ConfigFileSetterComponent", ConfigFileSetterComponent.class);
        System.out.println("Constructor Component says: " + component.saySomething());
        System.out.println("Setter Component says: " + setterComponent.saySomething());
    }

    @Test
    void testCar() {
        System.out.println("Test for the car example: \n");

        // Initialize with XML Config which injects engine to car.
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Car car = ctx.getBean("Car", Car.class);

        car.startCar();
        car.stopCar();

        IEngine engine2 = new DieselEngine();
        IBrakes brakes2 = new DiscBrakes();

        System.out.println("\nChange Engine and Brakes. \n");
        car.setEngine(engine2);
        car.setBrakes(brakes2);
        car.startCar();
        car.stopCar();
    }
}
