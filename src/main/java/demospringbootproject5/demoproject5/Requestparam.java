package demospringbootproject5.demoproject5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Requestparam {

    //syntax : /end_point?param_name=value
    @RequestMapping("/square")
    public String square(@RequestParam int num){
        int square =num*num;
        return "SQUARE OF.."+num +"... IS.."+square;
    }

    @RequestMapping("/cube")
    public String cube(@RequestParam int num){
        int cube =num*num*num;
        return "CUBE OF.."+num +"... IS.."+cube;
    }

    @RequestMapping("/oddeven")
    public String checkOddEven(@RequestParam int num){

        for(int i =1; i<=num; i++) {
            if (i % 2 == 0) {
                return "NUMBER IS EVEN.." + num;
            } else {
                return "NUMBER IS ODD.." + num;
            }

        }
        return "number is";
    }


}
