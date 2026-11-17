interface Payable {
    void pay(double amount);
}

abstract class Payment implements Payable {

    String user;

    Payment(String user) {
        this.user = user;
    }

    void display() {
        System.out.println("User: " + user);
    }
}

class CreditCard extends Payment {

    CreditCard(String user) {
        super(user);
    }

    public void pay(double amount) {
        display();
        System.out.println("Paid using Credit Card: Rs." + amount);
    }
}

class UPI extends Payment {

    UPI(String user) {
        super(user);
    }

    public void pay(double amount) {
        display();
        System.out.println("Paid using UPI: Rs." + amount);
    }
}

class NetBanking extends Payment {

    NetBanking(String user) {
        super(user);
    }

    public void pay(double amount) {
        display();
        System.out.println("Paid using Net Banking: Rs." + amount);
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Payment p1 = new CreditCard("Jilani");
        Payment p2 = new UPI("Rahul");
        Payment p3 = new NetBanking("Aman");

        p1.pay(2000);
        System.out.println();

        p2.pay(1500);
        System.out.println();

        p3.pay(3000);
    }
}