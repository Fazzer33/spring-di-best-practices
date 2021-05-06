package at.fhv.spring.di.bestPractices.nonAutowired.components;

import at.fhv.spring.di.bestPractices.beans.IService;

//https://www.baeldung.com/spring-xml-injection

/**
 * Example of a controller that injects the service via the constructor (using beans.xml or java config file)
 */

public class ConfigFileConstructorComponent {
    private IService _service;

    public ConfigFileConstructorComponent(IService service) {
        _service = service;
    }

    public String saySomething() {
        return _service.getMessage();
    }
}
