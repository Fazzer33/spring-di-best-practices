package at.fhv.spring.di.bestPractices.nonAutowired.controllers;

import at.fhv.spring.di.bestPractices.beans.IService;

//https://www.baeldung.com/spring-xml-injection

/**
 * Example of a controller that gets injected (constructor injection) via beans.xml or java config file
 */

public class XMLBasedConstructorController {
    private IService _service;

    public XMLBasedConstructorController(IService service) {
        _service = service;
    }

    public String doSomething() {
        return _service.getMessage();
    }
}
