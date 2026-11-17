public class WrapperClassLab {
    public static void main(String[] args) {

        // Autoboxing
        int a = 10;
        Integer obj = a;

        // Unboxing
        Integer num = 20;
        int b = num;

        // Parsing strings
        int x = Integer.parseInt("100");
        double y = Double.parseDouble("25.5");
        boolean flag = Boolean.parseBoolean("true");

        // Integer cache
        Integer n1 = 127;
        Integer n2 = 127;

        Integer n3 = 128;
        Integer n4 = 128;

        System.out.println("Autoboxing: " + obj);
        System.out.println("Unboxing: " + b);
        System.out.println("Parsed Integer: " + x);
        System.out.println("Parsed Double: " + y);
        System.out.println("Parsed Boolean: " + flag);

        System.out.println("127 Comparison: " + (n1 == n2));
        System.out.println("128 Comparison: " + (n3 == n4));
    }
}