interface Flyable {

    default void move() {
        System.out.println("Robot is flying");
    }
}

interface Swimmable {

    default void move() {
        System.out.println("Robot is swimming");
    }
}

interface Drivable {

    default void drive() {
        System.out.println("Robot is driving");
    }
}

class Robot implements Flyable, Swimmable, Drivable {

    @Override
    public void move() {
        Flyable.super.move();
        Swimmable.super.move();
    }
}

public class MultiroleRobot {

    public static void main(String[] args) {

        Robot r = new Robot();

        r.move();
        r.drive();
    }
}