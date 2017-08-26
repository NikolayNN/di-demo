package guru.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import guru.springframework.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author Nikolay Horushko
 */
public class PropertyControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
