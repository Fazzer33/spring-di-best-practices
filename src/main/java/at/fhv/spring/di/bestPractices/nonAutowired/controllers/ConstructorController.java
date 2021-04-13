//package at.fhv.spring.di.bestPractices.nonAutowired.controllers;
//
//import at.fhv.spring.di.bestPractices.beans.MyService;
//import org.springframework.stereotype.Controller;
//
//// https://www.youtube.com/watch?v=uO2_ZzIIV70
//
///**
// * Example of a ConstructorController which injects the service through the constructer parameters.
// */
//@Controller
//public class ConstructorController {
//    private MyService _myService;
//
//    // no AutoWired is needed in this case (optional) -> Spring automatically does this
//    public ConstructorController(MyService myService) {
//        _myService = myService;
//    }
//
//    public String saySomething() {
//        return _myService.getMessage();
//    }
//}
