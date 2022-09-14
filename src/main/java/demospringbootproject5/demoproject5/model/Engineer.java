package demospringbootproject5.demoproject5.model;

import java.util.Objects;

public class Engineer {

    String name;
    int id;
    String branch;
    String City;

    public Engineer(String name, int id, String branch, String city) {
        this.name = name;
        this.id = id;
        this.branch = branch;
        City = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return Objects.equals(branch, engineer.branch) && Objects.equals(City, engineer.City);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, City);
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
