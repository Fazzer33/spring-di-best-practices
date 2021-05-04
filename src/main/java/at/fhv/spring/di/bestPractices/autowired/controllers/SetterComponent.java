package at.fhv.spring.di.bestPractices.autowired.controllers;

import at.fhv.spring.di.bestPractices.beans.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Example of a SetterController which injects the service through a set method
 */
@Controller
public class SetterComponent {
    private MyService _myService;

    @Autowired
    public void setMyService(MyService myService) {
        _myService = myService;
    }

    public String saySomething() {
        return _myService.getMessage();
    }

}