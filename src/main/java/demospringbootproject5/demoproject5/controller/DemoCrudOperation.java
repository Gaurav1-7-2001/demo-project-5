package demospringbootproject5.demoproject5.controller;

import demospringbootproject5.demoproject5.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DemoCrudOperation {

   /* todo :    CRUD OPERATION
   *             C = CREATE OR ADD
   *             R = READ OR GET
   *             U = UPDATE
   *             D = DELETE   */

   ArrayList<Student> studentArrayList =new ArrayList<>();

   // C = Create or Add

    @RequestMapping("/add_std")
    public String add_std(@RequestBody Student student){

        studentArrayList.add(student);

        return "STUDENT DATA IS ADDED SUCCESSFULLY IN POSTMAN...";

    }


   @RequestMapping("/add_student/{name}/{age}/{section}")
   public String add_student(@PathVariable String name,@PathVariable int age,@PathVariable String section){

       Student std =new Student(name,age,section);
       studentArrayList.add(std);

       return "Student added Successfully...";
   }

    //  R =Read or get

    @RequestMapping("/get_student")
    public ArrayList<Student> get_student(){

       return studentArrayList;
    }

    // U = update

    @RequestMapping("/update_student")
    public String update(@RequestParam String name ,@RequestParam String section, @RequestParam int index ){

      Student student =studentArrayList.get(index);
     student.setName(name);
     student.setSection(section);
       return" UPDATED success fully...";
    }

    @RequestMapping("/delete_student")
    public String delete(@RequestParam int index){
       studentArrayList.remove(index);
       return "delete successfully...";
    }

}
