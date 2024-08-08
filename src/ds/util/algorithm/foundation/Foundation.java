package ds.util.algorithm.foundation;

import java.util.Scanner;

 class Foundation {
    

    // Class for Basic Data Types
    static class BasicDataTypes {
        public void runExamples() {
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
        }
    }

    // Class for Conditional Statements
    static class ConditionalStatements {
        public void runExamples() {
            int number = 10;

            if (number > 5) {
                System.out.println("Number is greater than 5");
            } else {
                System.out.println("Number is not greater than 5");
            }
        }
    }

    // Class for Switch Statement
    static class SwitchStatement {
        public void runExamples() {
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
        }
    }

    // Class for Loop Examples
    static class LoopExamples {
        public void runExamples() {
            // For loop
            System.out.println("For loop:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("i = " + i);
            }

            // While loop
            System.out.println("While loop:");
            int i = 1;
            while (i <= 5) {
                System.out.println("i = " + i);
                i++;
            }

            // Do-while loop
            System.out.println("Do-while loop:");
            i = 1;
            do {
                System.out.println("i = " + i);
                i++;
            } while (i <= 5);
        }
    }

    // Class for Array Examples
    static class ArrayExamples {
        public void runExamples() {
            Integer[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Array elements:");
            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }

    // Class for String Examples
    static class StringExamples {
        public void runExamples() {
            String str = "Hello, Java!";
            System.out.println("String: " + str);
            System.out.println("Length: " + str.length());
            System.out.println("Substring (0-5): " + str.substring(0, 5));
            System.out.println("Uppercase: " + str.toUpperCase());
            System.out.println("Lowercase: " + str.toLowerCase());
            System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));
        }
    }

    // Class for Wrapper Class Examples
    static class WrapperClassExamples {
        public void runExamples() {
            Integer intObj = Integer.valueOf(10);
            Double doubleObj = Double.valueOf(5.5);
            Boolean boolObj = Boolean.valueOf(true);

            System.out.println("Integer Object: " + intObj);
            System.out.println("Double Object: " + doubleObj);
            System.out.println("Boolean Object: " + boolObj);

            // Unboxing
            int intVal = intObj.intValue();
            double doubleVal = doubleObj.doubleValue();
            boolean boolVal = boolObj.booleanValue();

            System.out.println("Unboxed Integer: " + intVal);
            System.out.println("Unboxed Double: " + doubleVal);
            System.out.println("Unboxed Boolean: " + boolVal);
        }
    }

    // Nested class for Value Pair with Generics
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

    // Another class with methods using Generics
    static class HelperClass<T> {
        public void displayMessage(T message) {
            System.out.println("HelperClass: " + message);
        }
    }
}
