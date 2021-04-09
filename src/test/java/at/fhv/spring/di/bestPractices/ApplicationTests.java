package at.fhv.spring.di.bestPractices;

import at.fhv.spring.di.bestPractices.autowired.controllers.ConstructorController;
import at.fhv.spring.di.bestPractices.autowired.controllers.FieldController;
import at.fhv.spring.di.bestPractices.autowired.controllers.SetterController;
import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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




//    @Test
//    public void testWithConfiguration() {
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
//        at.fhv.spring.di.bestPractices.nonAutowired.controllers.SetterController _setterController2 =
//                (at.fhv.spring.di.bestPractices.nonAutowired.controllers.SetterController) ctx.getBean("SetterController");
//        System.out.println("Setter Controller says: " + setterController.saySomething());
//
//    }
}
