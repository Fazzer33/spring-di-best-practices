package at.fhv.spring.di.bestPractices;

import at.fhv.spring.di.bestPractices.autowired.controllers.ConstructorController;
import at.fhv.spring.di.bestPractices.autowired.controllers.FieldController;
import at.fhv.spring.di.bestPractices.autowired.controllers.SetterController;
import at.fhv.spring.di.bestPractices.nonAutowired.controllers.XMLBasedConstructorController;
import at.fhv.spring.di.bestPractices.nonAutowired.controllers.XMLBasedSetterController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class ApplicationTests {

    @Autowired
    FieldController fieldController;

    @Autowired
    ConstructorController constructorController;

    @Autowired
    SetterController setterController;

    @Test
    void testAutoWiredControllers() {
        System.out.println("Field Controller says: " + fieldController.saySomething());

        System.out.println("Constructor Controller says: " + constructorController.saySomething());

        System.out.println("Setter Controller says: " + setterController.saySomething());
    }

    @Test
    void testWithNonAutoWiredController() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        XMLBasedConstructorController ctrl = ctx.getBean("XMLBasedConstructorController", XMLBasedConstructorController.class);
        XMLBasedSetterController setterController = ctx.getBean("XMLBasedSetterController", XMLBasedSetterController.class);
        System.out.println("Constructor Controller says: " + ctrl.doSomething());
        System.out.println("Setter Controller says: " + setterController.doSomething());

    }

}
