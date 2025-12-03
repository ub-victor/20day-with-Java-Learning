package id27269;

import java.util.ArrayList;
import java.util.List;

public class TicketTable {
    private List<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket t) { tickets.add(t); }

    public List<Ticket> getAll() { return tickets; }
}
