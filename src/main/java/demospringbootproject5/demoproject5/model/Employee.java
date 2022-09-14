package demospringbootproject5.demoproject5.model;


import java.util.Objects;

public class Employee {

    String name;
    int id;
    String dept;
    double salary;

    public Employee(String name, int id, String dept, double salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
