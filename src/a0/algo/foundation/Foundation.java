package a0.algo.foundation;
import java.util.*;

public class Foundation {
    public static void main(String[] args) {
        // Basic Data Types
        int number = 10;
        double decimal = 5.5;
        char letter = 'A';
        boolean isJavaFun = true;
        String greeting = "Hello, World!";
        
        // Print statements
        System.out.println("Number: " + number);
        System.out.println("Decimal: " + decimal);
        System.out.println("Letter: " + letter);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Greeting: " + greeting);
        
        // Conditional Statements
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is not greater than 5");
        }

        // Switch Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Collections
        // List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);

        // Set
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Bird");
        System.out.println("Set: " + set);

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("Map: " + map);

        // Iterating over a List
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        // Iterating over a Set
        for (String animal : set) {
            System.out.println("Animal: " + animal);
        }

        // Iterating over a Map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using a nested class for value pairs
        ValuePair<Integer, String> pair = new ValuePair<>(1, "One");
        System.out.println("Value Pair: " + pair.getKey() + ", " + pair.getValue());

        // Using a method from another class
        HelperClass helper = new HelperClass();
        helper.displayMessage("This is a message from the HelperClass.");
    }

    // Nested class for Value Pair
    static class ValuePair<K, V> {
        private K key;
        private V value;

        public ValuePair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}

// Another class with methods
class HelperClass {
    public void displayMessage(String message) {
        System.out.println("HelperClass: " + message);
    }
}
