package at.fhv.spring.di.bestPractices.nonAutowired.controllers;

import at.fhv.spring.di.bestPractices.beans.IService;

public class XMLBasedConstructorController {
    private IService _service;

    public XMLBasedConstructorController(IService service) {
        _service = service;
    }

    public String doSomething() {
        return _service.getMessage();
    }
}
