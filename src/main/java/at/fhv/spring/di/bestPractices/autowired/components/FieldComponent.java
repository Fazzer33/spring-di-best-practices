package at.fhv.spring.di.bestPractices.autowired.components;

import at.fhv.spring.di.bestPractices.beans.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Example of a FieldController which injects service directly into the field.
 * (this is not a good practice)
 */
@Component
public class FieldComponent {

    // field injection is not recommended
    @Autowired
    private IService myService;

    public String saySomething() {
        return myService.getMessage();
    }
}
