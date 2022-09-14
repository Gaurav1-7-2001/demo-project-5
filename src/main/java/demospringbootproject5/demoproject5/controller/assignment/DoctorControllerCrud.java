package demospringbootproject5.demoproject5.controller.assignment;

import demospringbootproject5.demoproject5.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorControllerCrud {


    ArrayList<Doctor> doctorArrayList =new ArrayList<>();

    @RequestMapping("/add_doctor")
    public String add_doctor(@RequestBody Doctor doctor ){

        doctorArrayList.add(doctor);
        return " DOCTOR DETAILS ADDED SUCCESSFULLY...";

    }



    @RequestMapping("/get_doctor")
    public ArrayList<Doctor> get_doctor(){

        return doctorArrayList;
    }


}
