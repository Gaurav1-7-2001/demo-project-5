package demospringbootproject5.demoproject5.controller.assignment;

import demospringbootproject5.demoproject5.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CrudEmployee {

    ArrayList<Employee>  employeeArrayList =new ArrayList<>();

    @RequestMapping("/add_employee")
    public  String add(@RequestBody Employee employee){



        employeeArrayList.add(employee);

        return "EMPLOYEE ADDED SUCCESSFULLY......";
    }


    @RequestMapping("/get_employee")
    public ArrayList<Employee> get(){

        return employeeArrayList;
    }


    @RequestMapping("/update_employee")
    public String update(@RequestParam String name ,@RequestParam int id ,@RequestParam int index){

        Employee employee=employeeArrayList.get(index);
        employee.setName(name);
        employee.setId(id);
        return " EMPLOYEE UPDATED SUCCESSFULLY...";

    }

    @RequestMapping("/delete_employee")
    public String delete(@RequestParam int index){

        employeeArrayList.remove(index);
        return "EMPLOYEE DELETED SUCCESSFULLY..";
    }

}
