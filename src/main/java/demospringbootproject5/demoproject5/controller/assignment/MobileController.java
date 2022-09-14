package demospringbootproject5.demoproject5.controller.assignment;

import demospringbootproject5.demoproject5.model.Mobile;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
public class MobileController {

    HashSet<Mobile> mobileHashSet =new HashSet<>();

    @RequestMapping("/add_mobile")
    public String add_mobile(@RequestBody Mobile mob){

        mobileHashSet.add(mob);
        return "MOBILE DETAILS ADDED SUCCESSFULLY...";
    }

    @RequestMapping("/get_mobile")
    public HashSet<Mobile> get_mobile(){

        return mobileHashSet;
    }

    @RequestMapping("/update_mobile")
    public String update(@PathVariable int index, @PathVariable String name){

//        mobileHashSet.iterator(index).setName(name);

        return " success fully updated";

    }


}
