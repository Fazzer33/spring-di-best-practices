package at.fhv.spring.di.bestPractices.nonAutowired.controllers;

import at.fhv.spring.di.bestPractices.beans.IService;
import at.fhv.spring.di.bestPractices.beans.MyService;

//https://www.baeldung.com/spring-xml-injection

/**
 * Example of a controller that injects the service via a setter (using beans.xml or java config file)
 */

public class ConfigFileSetterComponent {
    private IService _service;

    public void setService(MyService service) {
        _service = service;
    }

    public String saySomething() {
        return _service.getMessage();
    }
}
