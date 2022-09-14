package demospringbootproject5.demoproject5.model;

import java.util.Objects;

public class Mobile {

    String mobile_name;
    String brand;
    double price;

    public Mobile(String mobile_name, String brand, double price) {
        this.mobile_name = mobile_name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mobile mobile = (Mobile) o;
        return Double.compare(mobile.price, price) == 0 && Objects.equals(mobile_name, mobile.mobile_name) && Objects.equals(brand, mobile.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobile_name, brand, price);
    }

    public String getMobile_name() {
        return mobile_name;
    }

    public void setMobile_name(String mobile_name) {
        this.mobile_name = mobile_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
