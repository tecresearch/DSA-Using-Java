package ds.util.algorithm.collectionframework;

import java.util.*;

// Arrays Class Examples
class ArraysExamples {
    public void runExamples() {
        int[] intArray = {3, 1, 4, 1, 5};
        System.out.println("intArray: " + Arrays.toString(intArray));

        Arrays.sort(intArray);
        System.out.println("Sorted intArray: " + Arrays.toString(intArray));

        int[] copiedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Copied intArray: " + Arrays.toString(copiedArray));

        int[] newArray = Arrays.copyOfRange(intArray, 1, 4);
        System.out.println("New array (from index 1 to 4): " + Arrays.toString(newArray));

        boolean equals = Arrays.equals(intArray, copiedArray);
        System.out.println("intArray equals copiedArray: " + equals);

        Arrays.fill(intArray, 9);
        System.out.println("intArray after fill with 9: " + Arrays.toString(intArray));

        int index = Arrays.binarySearch(copiedArray, 4);
        System.out.println("Index of 4 in copiedArray: " + index);

        Arrays.parallelSort(copiedArray);
        System.out.println("Copied array after parallelSort: " + Arrays.toString(copiedArray));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("List created from array: " + list);

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
    }
}

// ArrayList Class Examples
class ArrayListExamples {
    public void runExamples() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        System.out.println("ArrayList1: " + arrayList1);

        arrayList1.add(1, "D");
        System.out.println("ArrayList1 after adding 'D' at index 1: " + arrayList1);

        arrayList1.remove("B");
        System.out.println("ArrayList1 after removing 'B': " + arrayList1);

        arrayList1.remove(2);
        System.out.println("ArrayList1 after removing element at index 2: " + arrayList1);

        arrayList1.set(0, "Z");
        System.out.println("ArrayList1 after setting 'Z' at index 0: " + arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        arrayList1.addAll(arrayList2);
        System.out.println("ArrayList1 after adding all elements from ArrayList2: " + arrayList1);

        arrayList1.clear();
        System.out.println("ArrayList1 after clearing: " + arrayList1);

        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.trimToSize();
        System.out.println("ArrayList1 after trimToSize: " + arrayList1);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(10);
        arrayList3.add(20);
        arrayList3.add(30);
        System.out.println("ArrayList3: " + arrayList3);

        arrayList3.ensureCapacity(100);
        System.out.println("ArrayList3 after ensureCapacity(100): " + arrayList3);
    }
}

// LinkedList Class Examples
class LinkedListExamples {
    public void runExamples() {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("One");
        linkedList1.add("Two");
        linkedList1.add("Three");
        System.out.println("LinkedList1: " + linkedList1);

        linkedList1.addFirst("Zero");
        System.out.println("LinkedList1 after adding 'Zero' at first position: " + linkedList1);

        linkedList1.addLast("Four");
        System.out.println("LinkedList1 after adding 'Four' at last position: " + linkedList1);

        linkedList1.removeFirst();
        System.out.println("LinkedList1 after removing first element: " + linkedList1);

        linkedList1.removeLast();
        System.out.println("LinkedList1 after removing last element: " + linkedList1);

        linkedList1.push("Negative One");
        System.out.println("LinkedList1 after pushing 'Negative One': " + linkedList1);

        linkedList1.pop();
        System.out.println("LinkedList1 after popping: " + linkedList1);

        LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(1, 2, 3));
        linkedList2.add(4);
        System.out.println("LinkedList2: " + linkedList2);

        Integer firstElement = linkedList2.peek();
        System.out.println("First element in LinkedList2 (peek): " + firstElement);

        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("A");
        linkedList3.add("B");
        linkedList3.add("C");
        linkedList1.addAll(linkedList3);
        System.out.println("LinkedList1 after adding all elements from LinkedList3: " + linkedList1);
    }
}

// Vector Class Examples
class VectorExamples {
    public void runExamples() {
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        System.out.println("Vector1: " + vector1);

        vector1.add(1, 15);
        System.out.println("Vector1 after adding 15 at index 1: " + vector1);

        vector1.remove(2);
        System.out.println("Vector1 after removing element at index 2: " + vector1);

        vector1.set(0, 5);
        System.out.println("Vector1 after setting 5 at index 0: " + vector1);

        vector1.addAll(Arrays.asList(40, 50, 60));
        System.out.println("Vector1 after adding a list of elements: " + vector1);

        vector1.clear();
        System.out.println("Vector1 after clearing: " + vector1);

        vector1.add(100);
        vector1.add(200);
        vector1.add(300);
        System.out.println("Vector1 after adding elements again: " + vector1);

        int firstElement = vector1.firstElement();
        System.out.println("First element in Vector1: " + firstElement);

        int lastElement = vector1.lastElement();
        System.out.println("Last element in Vector1: " + lastElement);

        vector1.trimToSize();
        System.out.println("Vector1 after trimToSize: " + vector1);
    }
}

// Stack Class Examples
class StackExamples {
    public void runExamples() {
        Stack<String> stack1 = new Stack<>();
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");
        System.out.println("Stack1: " + stack1);

        String topElement = stack1.pop();
        System.out.println("Stack1 after popping: " + stack1 + ", Popped element: " + topElement);

        topElement = stack1.peek();
        System.out.println("Peek at Stack1: " + topElement);

        boolean isEmpty = stack1.isEmpty();
        System.out.println("Is Stack1 empty: " + isEmpty);

        int position = stack1.search("A");
        System.out.println("Position of 'A' in Stack1: " + position);

        stack1.push("D");
        System.out.println("Stack1 after pushing 'D': " + stack1);

        stack1.clear();
        System.out.println("Stack1 after clearing: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println("Stack2: " + stack2);

        int intElement = stack2.pop();
        System.out.println("Stack2 after popping: " + stack2 + ", Popped element: " + intElement);

        stack2.push(4);
        stack2.push(5);
        System.out.println("Stack2 after pushing 4 and 5: " + stack2);

        stack2.removeAllElements();
        System.out.println("Stack2 after removing all elements: " + stack2);
    }
}

// HashSet Class Examples
class HashSetExamples {
    public void runExamples() {
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Blue");
        System.out.println("HashSet1: " + hashSet1);

        hashSet1.add("Red");
        System.out.println("HashSet1 after adding 'Red' again: " + hashSet1);

        hashSet1.remove("Green");
        System.out.println("HashSet1 after removing 'Green': " + hashSet1);

        boolean containsBlue = hashSet1.contains("Blue");
        System.out.println("HashSet1 contains 'Blue': " + containsBlue);

        HashSet<String> hashSet2 = new HashSet<>(Arrays.asList("X", "Y", "Z"));
        System.out.println("HashSet2: " + hashSet2);

        hashSet1.addAll(hashSet2);
        System.out.println("HashSet1 after adding all elements from HashSet2: " + hashSet1);

        hashSet1.clear();
        System.out.println("HashSet1 after clearing: " + hashSet1);

        HashSet<Integer> hashSet3 = new HashSet<>();
        hashSet3.add(1);
        hashSet3.add(2);
        hashSet3.add(3);
        System.out.println("HashSet3: " + hashSet3);

        HashSet<String> hashSet4 = new HashSet<>(Arrays.asList("A", "B", "C"));
        System.out.println("HashSet4: " + hashSet4);

        hashSet4.removeAll(Arrays.asList("A", "B"));
        System.out.println("HashSet4 after removing 'A' and 'B': " + hashSet4);
    }
}

// LinkedHashSet Class Examples
class LinkedHashSetExamples {
    public void runExamples() {
        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("Red");
        linkedHashSet1.add("Green");
        linkedHashSet1.add("Blue");
        System.out.println("LinkedHashSet1: " + linkedHashSet1);

        linkedHashSet1.add("Red");
        System.out.println("LinkedHashSet1 after adding 'Red' again: " + linkedHashSet1);

        linkedHashSet1.remove("Green");
        System.out.println("LinkedHashSet1 after removing 'Green': " + linkedHashSet1);

        boolean containsBlue = linkedHashSet1.contains("Blue");
        System.out.println("LinkedHashSet1 contains 'Blue': " + containsBlue);

        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>(Arrays.asList("X", "Y", "Z"));
        System.out.println("LinkedHashSet2: " + linkedHashSet2);

        linkedHashSet1.addAll(linkedHashSet2);
        System.out.println("LinkedHashSet1 after adding all elements from LinkedHashSet2: " + linkedHashSet1);

        linkedHashSet1.clear();
        System.out.println("LinkedHashSet1 after clearing: " + linkedHashSet1);

        LinkedHashSet<Integer> linkedHashSet3 = new LinkedHashSet<>();
        linkedHashSet3.add(1);
        linkedHashSet3.add(2);
        linkedHashSet3.add(3);
        System.out.println("LinkedHashSet3: " + linkedHashSet3);

        LinkedHashSet<String> linkedHashSet4 = new LinkedHashSet<>(Arrays.asList("A", "B", "C"));
        System.out.println("LinkedHashSet4: " + linkedHashSet4);

        linkedHashSet4.removeAll(Arrays.asList("A", "B"));
        System.out.println("LinkedHashSet4 after removing 'A' and 'B': " + linkedHashSet4);
    }
}


// TreeSet Class Examples
class TreeSetExamples {
    public void runExamples() {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Green");
        treeSet1.add("Blue");
        System.out.println("TreeSet1: " + treeSet1);

        treeSet1.add("Red");
        System.out.println("TreeSet1 after adding 'Red' again: " + treeSet1);

        treeSet1.remove("Green");
        System.out.println("TreeSet1 after removing 'Green': " + treeSet1);

        String firstElement = treeSet1.first();
        System.out.println("First element in TreeSet1: " + firstElement);

        String lastElement = treeSet1.last();
        System.out.println("Last element in TreeSet1: " + lastElement);

        TreeSet<Integer> treeSet2 = new TreeSet<>(Arrays.asList(10, 20, 30));
        System.out.println("TreeSet2: " + treeSet2);

        TreeSet<Integer> headSet = (TreeSet<Integer>) treeSet2.headSet(20);
        System.out.println("HeadSet of TreeSet2 (elements less than 20): " + headSet);

        TreeSet<Integer> tailSet = (TreeSet<Integer>) treeSet2.tailSet(20);
        System.out.println("TailSet of TreeSet2 (elements greater than or equal to 20): " + tailSet);

        TreeSet<String> treeSet3 = new TreeSet<>(Arrays.asList("X", "Y", "Z"));
        System.out.println("TreeSet3: " + treeSet3);

        treeSet3.subSet("X", "Z").clear();
        System.out.println("TreeSet3 after clearing subSet between 'X' and 'Z': " + treeSet3);

        TreeSet<String> treeSet4 = new TreeSet<>();
        treeSet4.add("Lion");
        treeSet4.add("Tiger");
        treeSet4.add("Leopard");
        System.out.println("TreeSet4: " + treeSet4);
    }
}


// PriorityQueue Class Examples
class PriorityQueueExamples {
    public void runExamples() {
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add(20);
        priorityQueue1.add(10);
        priorityQueue1.add(30);
        System.out.println("PriorityQueue1: " + priorityQueue1);

        priorityQueue1.poll();
        System.out.println("PriorityQueue1 after polling: " + priorityQueue1);

        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add("Banana");
        priorityQueue2.add("Apple");
        priorityQueue2.add("Cherry");
        System.out.println("PriorityQueue2: " + priorityQueue2);

        priorityQueue2.offer("Date");
        System.out.println("PriorityQueue2 after offering 'Date': " + priorityQueue2);

        PriorityQueue<Double> priorityQueue3 = new PriorityQueue<>(Arrays.asList(3.3, 1.1, 2.2));
        System.out.println("PriorityQueue3: " + priorityQueue3);

        Double firstElement = priorityQueue3.peek();
        System.out.println("First element in PriorityQueue3 (peek): " + firstElement);

        PriorityQueue<String> priorityQueue4 = new PriorityQueue<>();
        priorityQueue4.add("X");
        priorityQueue4.add("Y");
        priorityQueue4.add("Z");
        System.out.println("PriorityQueue4: " + priorityQueue4);

        priorityQueue4.poll();
        System.out.println("PriorityQueue4 after polling: " + priorityQueue4);

        priorityQueue4.clear();
        System.out.println("PriorityQueue4 after clearing: " + priorityQueue4);
    }
}


// ArrayDeque Class Examples
class ArrayDequeExamples {
    public void runExamples() {
        ArrayDeque<String> arrayDeque1 = new ArrayDeque<>();
        arrayDeque1.add("Apple");
        arrayDeque1.add("Banana");
        arrayDeque1.add("Cherry");
        System.out.println("ArrayDeque1: " + arrayDeque1);

        arrayDeque1.addFirst("Apricot");
        System.out.println("ArrayDeque1 after adding 'Apricot' at first: " + arrayDeque1);

        arrayDeque1.addLast("Date");
        System.out.println("ArrayDeque1 after adding 'Date' at last: " + arrayDeque1);

        arrayDeque1.pollFirst();
        System.out.println("ArrayDeque1 after polling first: " + arrayDeque1);

        arrayDeque1.pollLast();
        System.out.println("ArrayDeque1 after polling last: " + arrayDeque1);

        String firstElement = arrayDeque1.peekFirst();
        System.out.println("First element in ArrayDeque1 (peekFirst): " + firstElement);

        String lastElement = arrayDeque1.peekLast();
        System.out.println("Last element in ArrayDeque1 (peekLast): " + lastElement);

        ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        arrayDeque2.addFirst(0);
        System.out.println("ArrayDeque2: " + arrayDeque2);

        Integer removedFirst = arrayDeque2.pollFirst();
        System.out.println("ArrayDeque2 after polling first: " + arrayDeque2 + ", Removed first: " + removedFirst);

        Integer removedLast = arrayDeque2.pollLast();
        System.out.println("ArrayDeque2 after polling last: " + arrayDeque2 + ", Removed last: " + removedLast);

        ArrayDeque<Double> arrayDeque3 = new ArrayDeque<>();
        arrayDeque3.add(1.1);
        arrayDeque3.add(2.2);
        arrayDeque3.add(3.3);
        System.out.println("ArrayDeque3: " + arrayDeque3);
    }
}

