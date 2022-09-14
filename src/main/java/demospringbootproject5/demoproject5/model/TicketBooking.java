package demospringbootproject5.demoproject5.model;

import java.util.Objects;

public class TicketBooking {

    String name;
    int seat_no;
    String train_name;
    String city;

    public TicketBooking(String name, int sr_no, String train_name, String city) {
        this.name = name;
        this.seat_no = sr_no;
        this.train_name = train_name;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketBooking that = (TicketBooking) o;
        return seat_no == that.seat_no && Objects.equals(name, that.name) && Objects.equals(train_name, that.train_name) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seat_no, train_name, city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
