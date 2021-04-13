//package at.fhv.spring.di.bestPractices.nonAutowired.controllers;
//
//import at.fhv.spring.di.bestPractices.beans.MyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
///**
// * Example of a FieldController which injects service directly into the field.
// * (this is not a good practice)
// */
//
//@Controller
//public class FieldController {
//
//    // field injection is not recommended
//    MyService myService;
//
//    public String saySomething() {
//        return myService.getMessage();
//    }
//}
