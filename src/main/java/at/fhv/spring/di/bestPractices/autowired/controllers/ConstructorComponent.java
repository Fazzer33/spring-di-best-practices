package at.fhv.spring.di.bestPractices.autowired.controllers;

import at.fhv.spring.di.bestPractices.beans.MyService;
import org.springframework.stereotype.Component;

/**
 * Example of a ConstructorController which injects the service through the constructor parameters.
 */
@Component
public class ConstructorComponent {
    private MyService _myService;

    // no AutoWired is needed in this case (optional) -> Spring automatically does this
    public ConstructorComponent(MyService myService) {
        _myService = myService;
    }

    public String saySomething() {
        return _myService.getMessage();
    }
}
