package at.fhv.spring.di.bestPractices.autowired.components;

import at.fhv.spring.di.bestPractices.beans.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Example of a SetterController which injects the service through a set method
 */
@Controller
public class SetterComponent {
    private IService _myService;

    @Autowired
    public void setMyService(IService myService) {
        _myService = myService;
    }

    public String saySomething() {
        return _myService.getMessage();
    }

}
