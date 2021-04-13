package at.fhv.spring.di.bestPractices.nonAutowired.controllers;

import at.fhv.spring.di.bestPractices.beans.IService;
import at.fhv.spring.di.bestPractices.beans.MyService;

public class XMLBasedSetterController {
    private IService _service;

    public void setService(MyService service) {
        _service = service;
    }

    public String doSomething() {
        return _service.getMessage();
    }
}
