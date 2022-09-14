package demospringbootproject5.demoproject5.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPathVariable {


    // TODO : for one variable SYNTAX ::=> @RequestMapping("/endpoint_name/{varName}")

    @RequestMapping("/message/{name}")
    public String message(@PathVariable String name) {
        return "hello ,welcome to the spring boot application..."+name;
    }


    // TODO : for two variable SYNTAX ::=> @RequestMapping("/endpoint_name/{varName}/{varName}")

    @RequestMapping("/vote/{name}/{age}")
    public String vote(@PathVariable String name, @PathVariable int age){

        if (age>18){
            return name +"....is Eligible for voting...because age is.."+age;
        }else{
            return name +" ..is not Eligible for voting..because age is.."+age;
        }
    }

}
