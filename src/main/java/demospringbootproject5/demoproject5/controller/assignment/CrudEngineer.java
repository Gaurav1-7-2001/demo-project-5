package demospringbootproject5.demoproject5.controller.assignment;


import demospringbootproject5.demoproject5.model.Engineer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

@RestController
public class CrudEngineer {

    HashSet<Engineer> engineerHashSet =new HashSet<>();

    @RequestMapping("/add_eng")
    public String add_eng(@RequestBody Engineer engineer){

        engineerHashSet.add(engineer);

        return "Engineer details added successfully..";
    }


    @RequestMapping("/get_eng")
    public HashSet<Engineer> get_eng(){

        return engineerHashSet;
    }


}
