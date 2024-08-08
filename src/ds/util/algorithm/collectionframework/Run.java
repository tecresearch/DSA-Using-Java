package ds.util.algorithm.collectionframework;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect the examples you want to run:");
            System.out.println("1. Collection Interface Examples");
            System.out.println("2. List Interface Examples");
            System.out.println("3. Set Interface Examples");
            System.out.println("4. Queue Interface Examples");
            System.out.println("5. Map Interface Examples");
            System.out.println("6. Arrays Class Examples");
            System.out.println("7. ArrayList Class Examples");
            System.out.println("8. LinkedList Class Examples");
            System.out.println("9. Vector Class Examples");
            System.out.println("10. Stack Class Examples");
            System.out.println("11. HashSet Class Examples");
            System.out.println("12. LinkedHashSet Class Examples");
            System.out.println("13. SortedSet Interface Examples");
            System.out.println("14. NavigableSet Interface Examples");
            System.out.println("15. TreeSet Class Examples");
            System.out.println("16. PriorityQueue Class Examples");
            System.out.println("17. Deque Interface Examples");
            System.out.println("18. ArrayDeque Class Examples");
            System.out.println("19. HashMap Examples");
            System.out.println("20. LinkedHashMap Examples");
            System.out.println("21. IdentityHashMap Examples");
            System.out.println("22. WeakHashMap Examples");
            System.out.println("23. SortedMap Examples");
            System.out.println("24. NavigableMap Examples");
            System.out.println("25. TreeMap Examples");
            System.out.println("26. Dictionary Examples");
            System.out.println("27. Hashtable Examples");
            System.out.println("28. Properties Examples");
            System.out.println("29. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CollectionInterfaceExp collectionExamples = new CollectionInterfaceExp();
                    collectionExamples.runExamples();
                    break;
                case 2:
                    ListExamples listExamples = new ListExamples();
                    listExamples.runExamples();
                    break;
                case 3:
                    SetExamples setExamples = new SetExamples();
                    setExamples.runExamples();
                    break;
                case 4:
                    QueueExamples queueExamples = new QueueExamples();
                    queueExamples.runExamples();
                    break;
                case 5:
                    MapExamples mapExamples = new MapExamples();
                    mapExamples.runExamples();
                    break;
                case 6:
                    ArraysExamples arraysExamples = new ArraysExamples();
                    arraysExamples.runExamples();
                    break;
                case 7:
                    ArrayListExamples arrayListExamples = new ArrayListExamples();
                    arrayListExamples.runExamples();
                    break;
                case 8:
                    LinkedListExamples linkedListExamples = new LinkedListExamples();
                    linkedListExamples.runExamples();
                    break;
                case 9:
                    VectorExamples vectorExamples = new VectorExamples();
                    vectorExamples.runExamples();
                    break;
                case 10:
                    StackExamples stackExamples = new StackExamples();
                    stackExamples.runExamples();
                    break;
                case 11:
                    HashSetExamples hashSetExamples = new HashSetExamples();
                    hashSetExamples.runExamples();
                    break;
                case 12:
                    LinkedHashSetExamples linkedHashSetExamples = new LinkedHashSetExamples();
                    linkedHashSetExamples.runExamples();
                    break;
                case 13:
                    SortedSetExamples sortedSetExamples = new SortedSetExamples();
                    sortedSetExamples.runExamples();
                    break;
                case 14:
                    NavigableSetExamples navigableSetExamples = new NavigableSetExamples();
                    navigableSetExamples.runExamples();
                    break;
                case 15:
                    TreeSetExamples treeSetExamples = new TreeSetExamples();
                    treeSetExamples.runExamples();
                    break;
                case 16:
                    PriorityQueueExamples priorityQueueExamples = new PriorityQueueExamples();
                    priorityQueueExamples.runExamples();
                    break;
                case 17:
                    DequeExamples dequeExamples = new DequeExamples();
                    dequeExamples.runExamples();
                    break;
                case 18:
                    ArrayDequeExamples arrayDequeExamples = new ArrayDequeExamples();
                    arrayDequeExamples.runExamples();
                    break;
                case 19:
                    HashMapExamples hashMapExamples = new HashMapExamples();
                    hashMapExamples.runExamples();
                    break;
                case 20:
                    LinkedHashMapExamples linkedHashMapExamples = new LinkedHashMapExamples();
                    linkedHashMapExamples.runExamples();
                    break;
                case 21:
                    IdentityHashMapExamples identityHashMapExamples = new IdentityHashMapExamples();
                    identityHashMapExamples.runExamples();
                    break;
                case 22:
                    WeakHashMapExamples weakHashMapExamples = new WeakHashMapExamples();
                    weakHashMapExamples.runExamples();
                    break;
                case 23:
                    SortedMapExamples sortedMapExamples = new SortedMapExamples();
                    sortedMapExamples.runExamples();
                    break;
                case 24:
                    NavigableMapExamples navigableMapExamples = new NavigableMapExamples();
                    navigableMapExamples.runExamples();
                    break;
                case 25:
                    TreeMapExamples treeMapExamples = new TreeMapExamples();
                    treeMapExamples.runExamples();
                    break;
                case 26:
                    DictionaryExamples dictionaryExamples = new DictionaryExamples();
                    dictionaryExamples.runExamples();
                    break;
                case 27:
                    HashtableExamples hashtableExamples = new HashtableExamples();
                    hashtableExamples.runExamples();
                    break;
                case 28:
                    PropertiesExamples propertiesExamples = new PropertiesExamples();
                    propertiesExamples.runExamples();
                    break;
                case 29:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
