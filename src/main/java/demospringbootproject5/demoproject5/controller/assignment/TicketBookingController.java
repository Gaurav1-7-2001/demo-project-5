package demospringbootproject5.demoproject5.controller.assignment;

import demospringbootproject5.demoproject5.model.TicketBooking;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TicketBookingController {

    HashMap<Integer, TicketBooking> ticketBookingHashMap =new HashMap<>();

    @RequestMapping("/add_ticket")
    public String add(@RequestBody TicketBooking ticketbooking){

        ticketBookingHashMap.put(1,ticketbooking);

        return " ticket booking successfully..";
    }

    @RequestMapping("/get_ticket")
    public HashMap<Integer,TicketBooking> get(){

        return ticketBookingHashMap;
    }


}
