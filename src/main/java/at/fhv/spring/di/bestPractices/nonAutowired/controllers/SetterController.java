//package at.fhv.spring.di.bestPractices.nonAutowired.controllers;
//
//import at.fhv.spring.di.bestPractices.beans.MyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
///**
// * Example of a SetterController which injects the service through a set method
// */
//@Controller
//public class SetterController {
//    private MyService _myService;
//
//    public void setMyService(MyService myService) {
//        _myService = myService;
//    }
//
//    public String saySomething() {
//        return _myService.getMessage();
//    }
//
//}
