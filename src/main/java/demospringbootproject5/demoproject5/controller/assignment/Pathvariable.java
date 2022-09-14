package demospringbootproject5.demoproject5.controller.assignment;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pathvariable {

    //syntax : /end_point/{value}
    @RequestMapping("/square/{num}")
    public String square(@PathVariable int num){
        int square =num*num;
        return "SQUARE OF.."+num +"... IS.."+square;
    }

    @RequestMapping("/cube/{num}")
    public String cube(@PathVariable int num){
        int cube =num*num*num;
        return "CUBE OF.."+num +"... IS.."+cube;
    }

    @RequestMapping("/oddeven/{num}")
    public String checkOddEven(@PathVariable int num){

        if (num%2==0){
            return"NUMBER IS EVEN.."+num;
        }else{
            return "NUMBER IS ODD.."+num;
        }
    }


}
