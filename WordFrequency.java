import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        String paragraph =
            "java is easy java is powerful java is popular";

        String[] words = paragraph.toLowerCase().split("\\s+");

        HashMap<String, Integer> hashMap = new HashMap<>();

        LinkedHashMap<String, Integer> linkedMap =
            new LinkedHashMap<>();

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (String word : words) {

            hashMap.put(word,
                hashMap.getOrDefault(word, 0) + 1);

            linkedMap.put(word,
                linkedMap.getOrDefault(word, 0) + 1);

            treeMap.put(word,
                treeMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("HashMap:");
        System.out.println(hashMap);

        System.out.println("\nLinkedHashMap:");
        System.out.println(linkedMap);

        System.out.println("\nTreeMap:");
        System.out.println(treeMap);
    }
}