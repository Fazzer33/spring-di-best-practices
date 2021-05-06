package at.fhv.spring.di.bestPractices.autowired.components;

import at.fhv.spring.di.bestPractices.beans.IService;
import org.springframework.stereotype.Component;

/**
 * Example of a ConstructorController which injects the service through the constructor parameters.
 */
@Component
public class ConstructorComponent {
    private IService _myService;

    // no AutoWired is needed in this case (optional) -> Spring automatically does this
    public ConstructorComponent(IService myService) {
        _myService = myService;
    }

    public String saySomething() {
        return _myService.getMessage();
    }
}
