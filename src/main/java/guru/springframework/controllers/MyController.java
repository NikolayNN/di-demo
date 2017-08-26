package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Nikolay Horushko
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("hello");
        return "foo";
    }
}
