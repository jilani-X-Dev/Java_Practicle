import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TextProcessor {

    public static void main(String[] args) {

        // String
        String s = "Hello";
        s = s + " Java";

        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");

        // StringBuffer
        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" Java");

        System.out.println("String: " + s);
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sf);

        // Performance comparison
        long start, end;

        start = System.nanoTime();

        String str = "";
        for (int i = 0; i < 1000; i++) {
            str += "A";
        }

        end = System.nanoTime();
        System.out.println("String Time: " + (end - start));

        start = System.nanoTime();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            builder.append("A");
        }

        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start));

        // Java 8 Date API
        LocalDate date = LocalDate.of(2026, 11, 16);

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Date: " + date.format(formatter));

        System.out.println("Tomorrow: " + date.plusDays(1));
    }
}