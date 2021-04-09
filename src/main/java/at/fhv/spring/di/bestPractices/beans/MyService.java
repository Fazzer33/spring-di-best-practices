package at.fhv.spring.di.bestPractices.beans;

import org.springframework.stereotype.Component;

/**
 * Example of a Spring Service
 */
@Component
public class MyService implements IService {

    @Override
    public String getMessage() {
        return "Hello";
    }
}
