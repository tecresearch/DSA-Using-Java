package ds.util.algorithm.collectionframework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

import ds.util.algorithm.collectionframework.QueueExamples.Customer;


//Collection Interface Examples
 class CollectionInterfaceExp {
 public void runExamples() {
     Collection<String> collection1 = new ArrayList<>();
     collection1.add("Element1");
     collection1.add("Element2");
     collection1.add("Element3");
     System.out.println("Collection1: " + collection1);

     Collection<Integer> collection2 = new HashSet<>();
     collection2.add(100);
     collection2.add(200);
     collection2.add(300);
     System.out.println("Collection2: " + collection2);

     collection2.remove(200);
     System.out.println("Collection2 after removing 200: " + collection2);

     System.out.println("Collection1 contains 'Element2': " + collection1.contains("Element2"));

     Collection<String> collection3 = new ArrayList<>(collection1);
     System.out.println("Collection3 (copy of Collection1): " + collection3);

//     collection3.addAll(collection2);
//     System.out.println("Collection3 after adding all elements from Collection2: " + collection3);

     collection3.clear();
     System.out.println("Collection3 after clearing: " + collection3);

     Collection<String> collection4 = new ArrayList<>();
     collection4.add("A");
     collection4.add("B");
     collection4.add("C");
     collection4.removeAll(collection4);
     System.out.println("Collection4 after removing all elements: " + collection4);

     Collection<String> collection5 = new HashSet<>(Arrays.asList("X", "Y", "Z"));
     System.out.println("Collection5: " + collection5);

     Collection<Integer> collection6 = Arrays.asList(1, 2, 3);
     System.out.println("Collection6: " + collection6);

     Collection<String> collection7 = new HashSet<>();
     collection7.add("Red");
     collection7.add("Green");
     collection7.add("Blue");
     System.out.println("Collection7 (HashSet): " + collection7);

     collection7.retainAll(Arrays.asList("Red", "Blue"));
     System.out.println("Collection7 after retaining only 'Red' and 'Blue': " + collection7);
 }
}

//List Interface Examples
class ListExamples {
 public void runExamples() {
     List<String> list1 = new ArrayList<>();
     list1.add("Apple");
     list1.add("Banana");
     list1.add("Cherry");
     System.out.println("List1: " + list1);

     list1.add(1, "Orange");
     System.out.println("List1 after adding 'Orange' at index 1: " + list1);

     list1.remove(2);
     System.out.println("List1 after removing element at index 2: " + list1);

     String elementAt1 = list1.get(1);
     System.out.println("Element at index 1 in List1: " + elementAt1);

     int indexOfCherry = list1.indexOf("Cherry");
     System.out.println("Index of 'Cherry' in List1: " + indexOfCherry);

     list1.set(1, "Mango");
     System.out.println("List1 after setting 'Mango' at index 1: " + list1);

     List<String> list2 = new LinkedList<>();
     list2.add("One");
     list2.add("Two");
     list2.add("Three");
     list1.addAll(list2);
     System.out.println("List1 after adding all elements from List2: " + list1);

     list1.clear();
     System.out.println("List1 after clearing: " + list1);

     List<Integer> list3 = Arrays.asList(1, 2, 3, 4);
     System.out.println("List3: " + list3);

     List<String> list4 = new ArrayList<>(Arrays.asList("A", "B", "C"));
     System.out.println("List4: " + list4);

     List<String> list5 = new Vector<>();
     list5.add("X");
     list5.add("Y");
     list5.add("Z");
     System.out.println("List5 (Vector): " + list5);
 }
}

//Set Interface Examples
class SetExamples {
 public void runExamples() {
     Set<String> set1 = new HashSet<>();
     set1.add("Dog");
     set1.add("Cat");
     set1.add("Bird");
     System.out.println("Set1: " + set1);

     set1.add("Dog");
     System.out.println("Set1 after adding 'Dog' again: " + set1);

     set1.remove("Cat");
     System.out.println("Set1 after removing 'Cat': " + set1);

     boolean containsDog = set1.contains("Dog");
     System.out.println("Set1 contains 'Dog': " + containsDog);

     Set<String> set2 = new LinkedHashSet<>();
     set2.add("A");
     set2.add("B");
     set2.add("C");
     set2.addAll(set1);
     System.out.println("Set2 after adding all elements from Set1: " + set2);

     set2.clear();
     System.out.println("Set2 after clearing: " + set2);

     Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
     System.out.println("Set3: " + set3);

     Set<String> set4 = new HashSet<>(Arrays.asList("X", "Y", "Z"));
     System.out.println("Set4: " + set4);

     Set<Integer> set5 = new TreeSet<>();
     set5.add(10);
     set5.add(20);
     set5.add(30);
     System.out.println("Set5: " + set5);

     Set<String> set6 = new HashSet<>();
     set6.add("Lion");
     set6.add("Tiger");
     set6.add("Leopard");
     System.out.println("Set6: " + set6);

     Set<String> set7 = new TreeSet<>();
     set7.add("Grape");
     set7.add("Apple");
     set7.add("Banana");
     System.out.println("Set7 (TreeSet): " + set7);
 }
}
//Queue Interface Examples
class QueueExamples {
	class Customer {
	    private String name;
	    private int priority;

	    public Customer(String name, int priority) {
	        this.name = name;
	        this.priority = priority;
	    }

	    public int getPriority() {
	        return priority;
	    }

	    @Override
	    public String toString() {
	        return name + " (Priority: " + priority + ")";
	    }
	}
	class ExQuue {
	    public void runExamples() {
	        Queue<String> queue1 = new LinkedList<>();
	        queue1.add("One");
	        queue1.add("Two");
	        queue1.add("Three");
	        System.out.println("Queue1: " + queue1);

	        queue1.offer("Four");
	        System.out.println("Queue1 after offering 'Four': " + queue1);

	        String head = queue1.poll();
	        System.out.println("Queue1 after polling: " + queue1 + ", Polled element: " + head);

	        head = queue1.peek();
	        System.out.println("Peek at Queue1: " + head);

	        queue1.remove();
	        System.out.println("Queue1 after removing the head: " + queue1);

	        Queue<Integer> queue2 = new PriorityQueue<>();
	        queue2.add(10);
	        queue2.add(20);
	        queue2.add(15);
	        System.out.println("Queue2: " + queue2);

	        queue2.poll();
	        System.out.println("Queue2 after polling: " + queue2);

	        Queue<String> queue3 = new ArrayDeque<>();
	        queue3.add("First");
	        queue3.add("Second");
	        queue3.add("Third");
	        System.out.println("Queue3: " + queue3);

	        queue3.poll();
	        System.out.println("Queue3 after polling: " + queue3);

	        queue3.offer("Fourth");
	        System.out.println("Queue3 after offering 'Fourth': " + queue3);

	        Queue<Double> queue4 = new PriorityQueue<>();
	        queue4.add(1.1);
	        queue4.add(2.2);
	        queue4.add(3.3);
	        System.out.println("Queue4 (PriorityQueue): " + queue4);
	    }
	}
  public void runExamples() {
      // Example 1: Using LinkedList as a Queue
      Queue<String> queue1 = new LinkedList<>();
      queue1.add("A");
      queue1.add("B");
      queue1.add("C");
      System.out.println("Queue1: " + queue1);

      String removedElement = queue1.remove();
      System.out.println("Queue1 after removing the head element: " + queue1 + ", Removed: " + removedElement);

      String headElement = queue1.element();
      System.out.println("Head element in Queue1: " + headElement);

      // Example 2: Using PriorityQueue as a Queue
      Queue<Integer> priorityQueue = new PriorityQueue<>();
      priorityQueue.add(30);
      priorityQueue.add(10);
      priorityQueue.add(20);
      System.out.println("PriorityQueue: " + priorityQueue);

      Integer polledElement = priorityQueue.poll();
      System.out.println("PriorityQueue after polling: " + priorityQueue + ", Polled: " + polledElement);

      Integer peekedElement = priorityQueue.peek();
      System.out.println("Peek at PriorityQueue: " + peekedElement);

      // Example 3: Queue with offer and poll
      Queue<String> queue3 = new LinkedList<>();
      queue3.offer("X");
      queue3.offer("Y");
      queue3.offer("Z");
      System.out.println("Queue3: " + queue3);

      String polledHead = queue3.poll();
      System.out.println("Queue3 after polling head: " + queue3 + ", Polled head: " + polledHead);

      // Example 4: Checking if a Queue is empty
      Queue<Integer> queue4 = new PriorityQueue<>();
      System.out.println("Is Queue4 empty? " + queue4.isEmpty());

      queue4.offer(100);
      queue4.offer(200);
      System.out.println("Queue4: " + queue4);

      // Example 5: Iterating through a Queue
      Queue<String> queue5 = new LinkedList<>();
      queue5.add("Element1");
      queue5.add("Element2");
      queue5.add("Element3");
      System.out.println("Queue5 elements:");
      for (String element : queue5) {
          System.out.println(element);
      }

      // Example 6: Removing all elements from a Queue
      queue5.clear();
      System.out.println("Queue5 after clearing: " + queue5);

      // Example 7: Using Queue with integers
      Queue<Integer> queue6 = new LinkedList<>();
      queue6.add(1);
      queue6.add(2);
      queue6.add(3);
      System.out.println("Queue6: " + queue6);

      // Example 8: Using Deque as a Queue
      Deque<String> deque = new ArrayDeque<>();
      deque.add("First");
      deque.add("Second");
      deque.add("Third");
      System.out.println("Deque used as Queue: " + deque);

      deque.pollFirst();
      System.out.println("Deque after polling first element: " + deque);

      deque.offerLast("Fourth");
      System.out.println("Deque after offering 'Fourth' at last: " + deque);

      // Example 9: Using ArrayDeque as a Queue
      Queue<String> arrayDeque = new ArrayDeque<>();
      arrayDeque.add("Red");
      arrayDeque.add("Green");
      arrayDeque.add("Blue");
      System.out.println("ArrayDeque used as Queue: " + arrayDeque);

      String removedColor = arrayDeque.remove();
      System.out.println("ArrayDeque after removing: " + arrayDeque + ", Removed: " + removedColor);

      // Example 10: PriorityQueue with custom objects
      PriorityQueue<Customer> customerQueue = new PriorityQueue<>((c1, c2) -> c1.getPriority() - c2.getPriority());
      customerQueue.add(new Customer("John", 2));
      customerQueue.add(new Customer("Alice", 1));
      customerQueue.add(new Customer("Bob", 3));
      System.out.println("Customer Queue: " + customerQueue);

      Customer nextCustomer = customerQueue.poll();
      System.out.println("Customer Queue after polling: " + customerQueue + ", Next Customer: " + nextCustomer);
  }
}



//Deque Interface Examples
class DequeExamples {
 public void runExamples() {
     Deque<String> deque1 = new ArrayDeque<>();
     deque1.add("One");
     deque1.add("Two");
     deque1.add("Three");
     System.out.println("Deque1: " + deque1);

     deque1.addFirst("Zero");
     System.out.println("Deque1 after adding 'Zero' at first: " + deque1);

     deque1.addLast("Four");
     System.out.println("Deque1 after adding 'Four' at last: " + deque1);

     deque1.removeFirst();
     System.out.println("Deque1 after removing first element: " + deque1);

     deque1.removeLast();
     System.out.println("Deque1 after removing last element: " + deque1);

     String firstElement = deque1.peekFirst();
     System.out.println("First element in Deque1 (peekFirst): " + firstElement);

     String lastElement = deque1.peekLast();
     System.out.println("Last element in Deque1 (peekLast): " + lastElement);

     Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(10, 20, 30));
     deque2.addFirst(5);
     System.out.println("Deque2: " + deque2);

     Integer removedFirst = deque2.pollFirst();
     System.out.println("Deque2 after polling first: " + deque2 + ", Removed first: " + removedFirst);

     Integer removedLast = deque2.pollLast();
     System.out.println("Deque2 after polling last: " + deque2 + ", Removed last: " + removedLast);

     Deque<Double> deque3 = new ArrayDeque<>();
     deque3.add(1.1);
     deque3.add(2.2);
     deque3.add(3.3);
     System.out.println("Deque3: " + deque3);
 }
}
//SortedSet Interface Examples
class SortedSetExamples {
 public void runExamples() {
     SortedSet<String> sortedSet1 = new TreeSet<>();
     sortedSet1.add("Apple");
     sortedSet1.add("Banana");
     sortedSet1.add("Cherry");
     System.out.println("SortedSet1: " + sortedSet1);

     sortedSet1.add("Apple");
     System.out.println("SortedSet1 after adding 'Apple' again: " + sortedSet1);

     sortedSet1.remove("Banana");
     System.out.println("SortedSet1 after removing 'Banana': " + sortedSet1);

     String firstElement = sortedSet1.first();
     System.out.println("First element in SortedSet1: " + firstElement);

     String lastElement = sortedSet1.last();
     System.out.println("Last element in SortedSet1: " + lastElement);

     SortedSet<Integer> sortedSet2 = new TreeSet<>(Arrays.asList(10, 20, 30));
     System.out.println("SortedSet2: " + sortedSet2);

     SortedSet<Integer> headSet = sortedSet2.headSet(20);
     System.out.println("HeadSet of SortedSet2 (elements less than 20): " + headSet);

     SortedSet<Integer> tailSet = sortedSet2.tailSet(20);
     System.out.println("TailSet of SortedSet2 (elements greater than or equal to 20): " + tailSet);

     SortedSet<String> sortedSet3 = new TreeSet<>(Arrays.asList("X", "Y", "Z"));
     System.out.println("SortedSet3: " + sortedSet3);

     sortedSet3.subSet("X", "Z").clear();
     System.out.println("SortedSet3 after clearing subSet between 'X' and 'Z': " + sortedSet3);

     SortedSet<String> sortedSet4 = new TreeSet<>();
     sortedSet4.add("Lion");
     sortedSet4.add("Tiger");
     sortedSet4.add("Leopard");
     System.out.println("SortedSet4: " + sortedSet4);
 }
}

//NavigableSet Interface Examples
class NavigableSetExamples {
 public void runExamples() {
     NavigableSet<String> navigableSet1 = new TreeSet<>();
     navigableSet1.add("Apple");
     navigableSet1.add("Banana");
     navigableSet1.add("Cherry");
     System.out.println("NavigableSet1: " + navigableSet1);

     String lower = navigableSet1.lower("Banana");
     System.out.println("Lower than 'Banana' in NavigableSet1: " + lower);

     String higher = navigableSet1.higher("Banana");
     System.out.println("Higher than 'Banana' in NavigableSet1: " + higher);

     String floor = navigableSet1.floor("Banana");
     System.out.println("Floor of 'Banana' in NavigableSet1: " + floor);

     String ceiling = navigableSet1.ceiling("Banana");
     System.out.println("Ceiling of 'Banana' in NavigableSet1: " + ceiling);

     NavigableSet<Integer> navigableSet2 = new TreeSet<>(Arrays.asList(10, 20, 30, 40));
     System.out.println("NavigableSet2: " + navigableSet2);

     NavigableSet<Integer> descendingSet = navigableSet2.descendingSet();
     System.out.println("NavigableSet2 in descending order: " + descendingSet);

     NavigableSet<String> navigableSet3 = new TreeSet<>(Arrays.asList("X", "Y", "Z"));
     System.out.println("NavigableSet3: " + navigableSet3);

     navigableSet3.pollFirst();
     System.out.println("NavigableSet3 after polling first element: " + navigableSet3);

     navigableSet3.pollLast();
     System.out.println("NavigableSet3 after polling last element: " + navigableSet3);

     NavigableSet<Double> navigableSet4 = new TreeSet<>();
     navigableSet4.add(1.1);
     navigableSet4.add(2.2);
     navigableSet4.add(3.3);
     System.out.println("NavigableSet4: " + navigableSet4);
 }
}

 