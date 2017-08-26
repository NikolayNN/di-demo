package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author Nikolay Horushko
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello I injected via the constructor";
    }
}
