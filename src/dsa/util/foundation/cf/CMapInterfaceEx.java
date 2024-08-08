package dsa.util.foundation.cf;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;


class MapExamples {
   public void runExamples() {
       // HashMap Example
       System.out.println("HashMap Example:");
       HashMap<Integer, String> hashMap = new HashMap<>();
       hashMap.put(1, "One");
       hashMap.put(2, "Two");
       hashMap.put(3, "Three");
       System.out.println("HashMap: " + hashMap);

       // LinkedHashMap Example
       System.out.println("\nLinkedHashMap Example:");
       LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
       linkedHashMap.put(1, "One");
       linkedHashMap.put(2, "Two");
       linkedHashMap.put(3, "Three");
       System.out.println("LinkedHashMap: " + linkedHashMap);

       // IdentityHashMap Example
       System.out.println("\nIdentityHashMap Example:");
       IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
       identityHashMap.put(new Integer(1), "One");
       identityHashMap.put(new Integer(2), "Two");
       identityHashMap.put(new Integer(1), "Duplicate One");
       System.out.println("IdentityHashMap: " + identityHashMap);

       // WeakHashMap Example
       System.out.println("\nWeakHashMap Example:");
       WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();
       Integer key1 = new Integer(1);
       Integer key2 = new Integer(2);
       weakHashMap.put(key1, "One");
       weakHashMap.put(key2, "Two");
       System.out.println("WeakHashMap before GC: " + weakHashMap);
       key1 = null;
       System.gc(); // Request garbage collection
       System.out.println("WeakHashMap after GC: " + weakHashMap);

       // SortedMap Example
       System.out.println("\nSortedMap Example:");
       SortedMap<Integer, String> sortedMap = new TreeMap<>();
       sortedMap.put(3, "Three");
       sortedMap.put(1, "One");
       sortedMap.put(2, "Two");
       System.out.println("SortedMap (TreeMap): " + sortedMap);

       // NavigableMap Example
       System.out.println("\nNavigableMap Example:");
       NavigableMap<Integer, String> navigableMap = new TreeMap<>();
       navigableMap.put(3, "Three");
       navigableMap.put(1, "One");
       navigableMap.put(2, "Two");
       System.out.println("NavigableMap (TreeMap): " + navigableMap);
       System.out.println("NavigableMap descending: " + navigableMap.descendingMap());

       // TreeMap Example
       System.out.println("\nTreeMap Example:");
       TreeMap<Integer, String> treeMap = new TreeMap<>();
       treeMap.put(3, "Three");
       treeMap.put(1, "One");
       treeMap.put(2, "Two");
       System.out.println("TreeMap: " + treeMap);

       // Dictionary Example
       System.out.println("\nDictionary Example:");
       Dictionary<Integer, String> dictionary = new Hashtable<>();
       dictionary.put(1, "One");
       dictionary.put(2, "Two");
       dictionary.put(3, "Three");
       System.out.println("Dictionary: " + dictionary);

       // Hashtable Example
       System.out.println("\nHashtable Example:");
       Hashtable<Integer, String> hashtable = new Hashtable<>();
       hashtable.put(1, "One");
       hashtable.put(2, "Two");
       hashtable.put(3, "Three");
       System.out.println("Hashtable: " + hashtable);

       // Properties Example
       System.out.println("\nProperties Example:");
       Properties properties = new Properties();
       properties.setProperty("prop1", "Value1");
       properties.setProperty("prop2", "Value2");
       properties.setProperty("prop3", "Value3");
       System.out.println("Properties: " + properties);
       System.out.println("Property prop1: " + properties.getProperty("prop1"));
   }
}


//SortedMapExamples interface

class SortedMapExamples {
public void runExamples() {
    // Example 1: Basic put and get operations
    SortedMap<Integer, String> map = new TreeMap<>();
    map.put(3, "Three");
    map.put(1, "One");
    map.put(2, "Two");
    System.out.println("Map: " + map);

    // Example 2: Getting the first and last keys
    Integer firstKey = map.firstKey();
    Integer lastKey = map.lastKey();
    System.out.println("First key: " + firstKey + ", Last key: " + lastKey);

    // Example 3: SubMap from first key (inclusive) to third key (exclusive)
    SortedMap<Integer, String> subMap = map.subMap(1, 3);
    System.out.println("SubMap: " + subMap);

    // Example 4: HeadMap up to key 2 (exclusive)
    SortedMap<Integer, String> headMap = map.headMap(2);
    System.out.println("HeadMap: " + headMap);

    // Example 5: TailMap starting from key 2 (inclusive)
    SortedMap<Integer, String> tailMap = map.tailMap(2);
    System.out.println("TailMap: " + tailMap);

    // Example 6: Iterating over the SortedMap
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    // Example 7: Removing the first entry
    map.remove(firstKey);
    System.out.println("Map after removing first key: " + map);

    // Example 8: Replacing the value for a key
    map.replace(2, "Two", "Deux");
    System.out.println("Map after replacing value for key 2: " + map);

    // Example 9: Clearing the map
    map.clear();
    System.out.println("Map after clearing: " + map);

    // Example 10: Checking if map is empty
    boolean isEmpty = map.isEmpty();
    System.out.println("Is map empty? " + isEmpty);
}
}

//NavigableMapExamples 
class NavigableMapExamples {
public void runExamples() {
    // Example 1: Basic put and get operations
    NavigableMap<Integer, String> map = new TreeMap<>();
    map.put(3, "Three");
    map.put(1, "One");
    map.put(2, "Two");
    System.out.println("Map: " + map);

    // Example 2: lowerKey() and higherKey() methods
    Integer lowerKey = map.lowerKey(2);
    Integer higherKey = map.higherKey(2);
    System.out.println("Lower key than 2: " + lowerKey + ", Higher key than 2: " + higherKey);

    // Example 3: floorKey() and ceilingKey() methods
    Integer floorKey = map.floorKey(2);
    Integer ceilingKey = map.ceilingKey(2);
    System.out.println("Floor key of 2: " + floorKey + ", Ceiling key of 2: " + ceilingKey);

    // Example 4: pollFirstEntry() and pollLastEntry() methods
    Map.Entry<Integer, String> firstEntry = map.pollFirstEntry();
    Map.Entry<Integer, String> lastEntry = map.pollLastEntry();
    System.out.println("First Entry: " + firstEntry + ", Last Entry: " + lastEntry);

    // Example 5: descendingMap() method
    NavigableMap<Integer, String> descendingMap = map.descendingMap();
    System.out.println("Descending Map: " + descendingMap);

    // Example 6: subMap() with inclusive/exclusive bounds
    NavigableMap<Integer, String> subMap = map.subMap(1, true, 3, false);
    System.out.println("SubMap: " + subMap);

    // Example 7: headMap() with inclusive bound
    NavigableMap<Integer, String> headMap = map.headMap(2, true);
    System.out.println("HeadMap: " + headMap);

    // Example 8: tailMap() with inclusive bound
    NavigableMap<Integer, String> tailMap = map.tailMap(2, true);
    System.out.println("TailMap: " + tailMap);

    // Example 9: Iterating over the NavigableMap
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    // Example 10: Clearing the map
    map.clear();
    System.out.println("Map after clearing: " + map);
}
}
