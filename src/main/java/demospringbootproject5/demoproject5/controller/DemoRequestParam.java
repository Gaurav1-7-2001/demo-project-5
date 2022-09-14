package demospringbootproject5.demoproject5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRequestParam {

    //TODO :  SYNTAX : for one variable = > /end_point?param_name=value

    @RequestMapping("/info")
    public String info( @RequestParam String name){

        return " hello, welcome to the spring boot application..with request param.."+name;
    }

    //TODO :  SYNTAX : for one variable = > /end_point?param_name=value&param_name2=value

    @RequestMapping("/skill")
    public String skill(@RequestParam String name,@RequestParam String skill){

        return "This person.."+name +".. has.."+skill;
    }

}
