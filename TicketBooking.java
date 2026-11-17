class TicketCounter {

    int seats = 2;

    // Unsafe booking: race condition possible
    void bookUnsafe(String name) {

        if (seats > 0) {
            System.out.println(name + " checking seats...");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            seats--;
            System.out.println(name + " booked a ticket");
        } else {
            System.out.println(name + " - No seats available");
        }
    }

    // Safe booking using synchronized and wait()
    synchronized void bookSafe(String name)
            throws InterruptedException {

        while (seats == 0) {
            System.out.println(name + " waiting for seats...");
            wait();
        }

        seats--;
        System.out.println(name + " booked a ticket safely");

        notifyAll();
    }
}

public class TicketBooking {

    public static void main(String[] args)
            throws InterruptedException {

        TicketCounter counter = new TicketCounter();

        System.out.println("SAFE BOOKING:");

        Thread t1 = new Thread(() -> {
            try {
                counter.bookSafe("Customer 1");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                counter.bookSafe("Customer 2");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                counter.bookSafe("Customer 3");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Remaining Seats: " + counter.seats);
    }
}