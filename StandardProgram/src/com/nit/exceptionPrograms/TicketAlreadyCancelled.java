
package com.nit.exceptionPrograms;

import java.util.Scanner;

public class TicketAlreadyCancelled {
    int ticketId;
    boolean cancelled;

    public TicketAlreadyCancelled(int ticketId) {
        this.ticketId = ticketId;
        this.cancelled = (ticketId == 101);
    }

    public void cancel() throws TicketAlreadyCancelledException {
        if (cancelled) {
            throw new TicketAlreadyCancelledException(
                "Ticket " + ticketId + " already cancelled"
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticketId = sc.nextInt();

        TicketAlreadyCancelled tc = new TicketAlreadyCancelled(ticketId);

        try {
            tc.cancel();
            System.out.println("Ticket cancelled successfully");
        } catch (TicketAlreadyCancelledException e) {
            System.out.println("TicketAlreadyCancelledException: " + e.getMessage());
        }

        sc.close();
    }
}

class TicketAlreadyCancelledException extends Exception {
    public TicketAlreadyCancelledException(String message) {
        super(message);
    }
}
