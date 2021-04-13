package at.fhv.spring.di.bestPractices.nonAutowired.controllers;

import at.fhv.spring.di.bestPractices.beans.IService;
import at.fhv.spring.di.bestPractices.beans.MyService;

//https://www.baeldung.com/spring-xml-injection

/**
 * Example of a controller that gets injected (setter injection) via beans.xml or java config file
 */

public class XMLBasedSetterController {
    private IService _service;

    public void setService(MyService service) {
        _service = service;
    }

    public String doSomething() {
        return _service.getMessage();
    }
}
