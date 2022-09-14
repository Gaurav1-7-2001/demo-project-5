package demospringbootproject5.demoproject5.model;

public class Doctor {

    String name;
    int id;
    String city;
    String department;

    public Doctor(String name, int id, String city, String department) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.department = department;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
