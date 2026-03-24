import java.util.*;

// Booking Request class
class BookingRequest {
    String customerName;
    String roomType;

    BookingRequest(String customerName, String roomType) {
        this.customerName = customerName;
        this.roomType = roomType;
    }
}

public class UC5 {

    public static void main(String[] args) {

        System.out.println("=== UC5: Booking Queue (FIFO) ===");

        // Queue for booking requests
        Queue<BookingRequest> requestQueue = new LinkedList<>();

        // Adding booking requests (arrival order)
        requestQueue.add(new BookingRequest("Nikhil", "Single Room"));
        requestQueue.add(new BookingRequest("Rahul", "Double Room"));
        requestQueue.add(new BookingRequest("Anita", "Suite"));

        // Processing requests
        while (!requestQueue.isEmpty()) {
            BookingRequest request = requestQueue.poll(); // FIFO

            System.out.println("Processing booking for: " + request.customerName);
            System.out.println("Room Type: " + request.roomType);
            System.out.println("--------------------------");
        }
    }
}