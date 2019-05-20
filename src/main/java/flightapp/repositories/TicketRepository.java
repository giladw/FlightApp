package flightapp.repositories;

import java.util.List;
import java.util.Map;

public class TicketRepository {
    private List<Integer> tickets;

    public TicketRepository(List<Integer> tickets) {
        this.tickets = tickets;
    }

    public boolean isTicketExist(int ticketId){
        return tickets.contains(ticketId);
    }
}

