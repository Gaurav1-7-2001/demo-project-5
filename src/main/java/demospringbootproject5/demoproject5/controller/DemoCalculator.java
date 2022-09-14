package demospringbootproject5.demoproject5.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCalculator {

    public String  add(int a ,int b){

        return "add is ."+(a+b);
    }
}
