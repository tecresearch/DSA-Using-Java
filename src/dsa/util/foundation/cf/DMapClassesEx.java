package dsa.util.foundation.cf;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

//HashMap Class examples
class HashMapExamples {
  public void runExamples() {
      // Example 1: Basic put and get operations
      Map<Integer, String> map = new HashMap<>();
      map.put(1, "One");
      map.put(2, "Two");
      System.out.println("Map: " + map);

      // Example 2: Overwriting an existing key
      map.put(2, "Twenty");
      System.out.println("Map after updating key 2: " + map);

      // Example 3: Checking if a key exists
      boolean hasKey1 = map.containsKey(1);
      System.out.println("Map contains key 1: " + hasKey1);

      // Example 4: Checking if a value exists
      boolean hasValueTwo = map.containsValue("Two");
      System.out.println("Map contains value 'Two': " + hasValueTwo);

      // Example 5: Iterating over the map
      for (Map.Entry<Integer, String> entry : map.entrySet()) {
          System.out.println(entry.getKey() + " -> " + entry.getValue());
      }

      // Example 6: Removing an entry by key
      map.remove(2);
      System.out.println("Map after removing key 2: " + map);

      // Example 7: Using putIfAbsent
      map.putIfAbsent(2, "Two");
      System.out.println("Map after putIfAbsent: " + map);

      // Example 8: Getting a default value if key is not found
      String value = map.getOrDefault(3, "Default");
      System.out.println("Value for key 3: " + value);

      // Example 9: Replacing a value for a key
      map.replace(1, "One", "Uno");
      System.out.println("Map after replacing key 1: " + map);

      // Example 10: Clearing the map
      map.clear();
      System.out.println("Map after clearing: " + map);
  }
}

//LinkedHashMapExamples

class LinkedHashMapExamples {
  public void runExamples() {
      // Example 1: Basic put and get operations
      Map<String, String> map = new LinkedHashMap<>();
      map.put("A", "Apple");
      map.put("B", "Banana");
      System.out.println("Map: " + map);

      // Example 2: Maintaining insertion order
      map.put("C", "Cherry");
      map.put("B", "Blueberry");
      System.out.println("Map after updates: " + map);

      // Example 3: Iterating over the map
      for (Map.Entry<String, String> entry : map.entrySet()) {
          System.out.println(entry.getKey() + " -> " + entry.getValue());
      }

      // Example 4: Removing an entry by key
      map.remove("B");
      System.out.println("Map after removing key 'B': " + map);

      // Example 5: Using putIfAbsent
      map.putIfAbsent("B", "Berry");
      System.out.println("Map after putIfAbsent: " + map);

      // Example 6: Access order mode
      LinkedHashMap<String, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
      accessOrderMap.put("X", "X-ray");
      accessOrderMap.put("Y", "Yellow");
      accessOrderMap.put("Z", "Zebra");
      System.out.println("Access Order Map: " + accessOrderMap);
      accessOrderMap.get("X");
      System.out.println("Access Order Map after access: " + accessOrderMap);

      // Example 7: Clearing the map
      map.clear();
      System.out.println("Map after clearing: " + map);

      // Example 8: Checking if map is empty
      boolean isEmpty = map.isEmpty();
      System.out.println("Is map empty? " + isEmpty);

      // Example 9: Checking size of the map
      int size = map.size();
      System.out.println("Size of map: " + size);

      // Example 10: Converting map keys to a set
      map.put("D", "Date");
      map.put("E", "Elderberry");
      System.out.println("Key Set: " + map.keySet());
  }
}

//IdentityHashMapExamples

class IdentityHashMapExamples {
  public void runExamples() {
      // Example 1: Basic put and get operations
      Map<String, String> map = new IdentityHashMap<>();
      String key1 = new String("key");
      String key2 = new String("key");
      map.put(key1, "value1");
      map.put(key2, "value2");
      System.out.println("Map: " + map);

      // Example 2: Checking reference equality
      System.out.println("Map size: " + map.size());

      // Example 3: Checking if a key exists
      boolean hasKey1 = map.containsKey(key1);
      System.out.println("Map contains key1: " + hasKey1);

      // Example 4: Iterating over the map
      for (Map.Entry<String, String> entry : map.entrySet()) {
          System.out.println(entry.getKey() + " -> " + entry.getValue());
      }

      // Example 5: Removing an entry by key
      map.remove(key1);
      System.out.println("Map after removing key1: " + map);

      // Example 6: Using putIfAbsent
      map.putIfAbsent(key1, "value1");
      System.out.println("Map after putIfAbsent: " + map);

      // Example 7: Getting a value or default
      String value = map.getOrDefault("nonexistent", "default");
      System.out.println("Value for nonexistent key: " + value);

      // Example 8: Replacing a value for a key
      map.replace(key2, "value2", "newValue");
      System.out.println("Map after replacing key2: " + map);

      // Example 9: Clearing the map
      map.clear();
      System.out.println("Map after clearing: " + map);

      // Example 10: Checking if map is empty
      boolean isEmpty = map.isEmpty();
      System.out.println("Is map empty? " + isEmpty);
  }
}

//WeakHashMapExamples

class WeakHashMapExamples {
  public void runExamples() {
      // Example 1: Basic put and get operations
      Map<Integer, String> map = new WeakHashMap<>();
      Integer key1 = new Integer(1);
      Integer key2 = new Integer(2);
      map.put(key1, "One");
      map.put(key2, "Two");
      System.out.println("Map before GC: " + map);

      // Example 2: Allowing GC to collect keys
      key1 = null;
      System.gc();
      System.out.println("Map after GC: " + map);

      // Example 3: Checking if a key exists
      boolean hasKey2 = map.containsKey(2);
      System.out.println("Map contains key 2: " + hasKey2);

      // Example 4: Iterating over the map
      for (Map.Entry<Integer, String> entry : map.entrySet()) {
          System.out.println(entry.getKey() + " -> " + entry.getValue());
      }

      // Example 5: Removing an entry by key
      map.remove(2);
      System.out.println("Map after removing key2: " + map);

      // Example 6: Using putIfAbsent
      Integer key3 = new Integer(3);
      map.putIfAbsent(key3, "Three");
      System.out.println("Map after putIfAbsent: " + map);

      // Example 7: Getting a value or default
      String value = map.getOrDefault(4, "Default");
      System.out.println("Value for key 4: " + value);

      // Example 8: Replacing a value for a key
      map.replace(3, "Three", "NewThree");
      System.out.println("Map after replacing key3: " + map);

      // Example 9: Clearing the map
      map.clear();
      System.out.println("Map after clearing: " + map);

      // Example 10: Checking if map is empty
      boolean isEmpty = map.isEmpty();
      System.out.println("Is map empty? " + isEmpty);
  }
}


//TreeMapExamples

class TreeMapExamples {
  public void runExamples() {
      // Example 1: Basic put and get operations
      TreeMap<Integer, String> map = new TreeMap<>();
      map.put(3, "Three");
      map.put(1, "One");
      map.put(2, "Two");
      System.out.println("Map: " + map);

      // Example 2: Iterating over the TreeMap
      for (Map.Entry<Integer, String> entry : map.entrySet()) {
          System.out.println(entry.getKey() + " -> " + entry.getValue());
      }

      // Example 3: Getting the first and last entries
      Map.Entry<Integer, String> firstEntry = map.firstEntry();
      Map.Entry<Integer, String> lastEntry = map.lastEntry();
      System.out.println("First Entry: " + firstEntry + ", Last Entry: " + lastEntry);

      // Example 4: Getting the first and last keys
      Integer firstKey = map.firstKey();
      Integer lastKey = map.lastKey();
      System.out.println("First Key: " + firstKey + ", Last Key: " + lastKey);

      // Example 5: SubMap from first key (inclusive) to third key (exclusive)
      SortedMap<Integer, String> subMap = map.subMap(1, 3);
      System.out.println("SubMap: " + subMap);

      // Example 6: HeadMap up to key 2 (exclusive)
      SortedMap<Integer, String> headMap = map.headMap(2);
      System.out.println("HeadMap: " + headMap);

      // Example 7: TailMap starting from key 2 (inclusive)
      SortedMap<Integer, String> tailMap = map.tailMap(2);
      System.out.println("TailMap: " + tailMap);

      // Example 8: Removing the first entry
      map.pollFirstEntry();
      System.out.println("Map after removing first entry: " + map);

      // Example 9: Removing the last entry
      map.pollLastEntry();
      System.out.println("Map after removing last entry: " + map);

      // Example 10: Clearing the map
      map.clear();
      System.out.println("Map after clearing: " + map);
  }
}

//DictionaryExamples
class DictionaryExamples {
  public void runExamples() {
      // Example 1: Basic put and get operations
      Dictionary<String, String> dictionary = new Hashtable<>();
      dictionary.put("A", "Apple");
      dictionary.put("B", "Banana");
      System.out.println("Dictionary: " + dictionary);

      // Example 2: Checking if a key exists
      boolean hasKeyA = dictionary.get("A") != null;
      System.out.println("Dictionary contains key 'A': " + hasKeyA);

      // Example 3: Iterating over the dictionary
      Enumeration<String> keys = dictionary.keys();
      while (keys.hasMoreElements()) {
          String key = keys.nextElement();
          System.out.println(key + " -> " + dictionary.get(key));
      }

      // Example 4: Checking if a value exists
      boolean hasValueBanana = dictionary.elements().hasMoreElements();
      System.out.println("Dictionary contains value 'Banana': " + hasValueBanana);

      // Example 5: Removing an entry
      dictionary.remove("B");
      System.out.println("Dictionary after removing key 'B': " + dictionary);

      // Example 6: Getting a default value if key is not found
      String value = dictionary.get("C");
      if (value == null) value = "Default";
      System.out.println("Value for key 'C': " + value);

      // Example 7: Checking if dictionary is empty
      boolean isEmpty = dictionary.isEmpty();
      System.out.println("Is dictionary empty? " + isEmpty);

      // Example 8: Getting the size of the dictionary
      int size = dictionary.size();
      System.out.println("Size of dictionary: " + size);

      // Example 9: Clearing the dictionary
//      dictionary.clear();
//      System.out.println("Dictionary after clearing: " + dictionary);

      // Example 10: Adding new entries
      dictionary.put("X", "X-ray");
      dictionary.put("Y", "Yellow");
      System.out.println("Dictionary after adding new entries: " + dictionary);
  }
}


//HashtableExamples

class HashtableExamples {
  public void runExamples() {
      // Example 1: Basic put and get operations
      Map<Integer, String> map = new Hashtable<>();
      map.put(1, "One");
      map.put(2, "Two");
      System.out.println("Map: " + map);

      // Example 2: Checking if a key exists
      boolean hasKey1 = map.containsKey(1);
      System.out.println("Map contains key 1: " + hasKey1);

      // Example 3: Checking if a value exists
      boolean hasValueTwo = map.containsValue("Two");
      System.out.println("Map contains value 'Two': " + hasValueTwo);

      // Example 4: Iterating over the map
      for (Map.Entry<Integer, String> entry : map.entrySet()) {
          System.out.println(entry.getKey() + " -> " + entry.getValue());
      }

      // Example 5: Removing an entry by key
      map.remove(2);
      System.out.println("Map after removing key 2: " + map);

      // Example 6: Using putIfAbsent
      map.putIfAbsent(2, "Two");
      System.out.println("Map after putIfAbsent: " + map);

      // Example 7: Getting a default value if key is not found
      String value = map.getOrDefault(3, "Default");
      System.out.println("Value for key 3: " + value);

      // Example 8: Replacing a value for a key
      map.replace(1, "One", "Uno");
      System.out.println("Map after replacing key 1: " + map);

      // Example 9: Clearing the map
      map.clear();
      System.out.println("Map after clearing: " + map);

      // Example 10: Checking if map is empty
      boolean isEmpty = map.isEmpty();
      System.out.println("Is map empty? " + isEmpty);
  }
}

//PropertiesExamples

class PropertiesExamples {
  public void runExamples() {
      // Example 1: Basic setProperty and getProperty
      Properties props = new Properties();
      props.setProperty("username", "admin");
      props.setProperty("password", "1234");
      System.out.println("Properties: " + props);

      // Example 2: Getting a property
      String username = props.getProperty("username");
      System.out.println("Username: " + username);

      // Example 3: Getting a default value if the key is not found
      String url = props.getProperty("url", "http://default.com");
      System.out.println("URL: " + url);

      // Example 4: Listing all properties
      props.list(System.out);

      // Example 5: Checking if a property exists
      boolean hasUsername = props.containsKey("username");
      System.out.println("Properties contains 'username': " + hasUsername);

      // Example 6: Removing a property
      props.remove("password");
      System.out.println("Properties after removing 'password': " + props);

      // Example 7: Checking if properties are empty
      boolean isEmpty = props.isEmpty();
      System.out.println("Are properties empty? " + isEmpty);

      // Example 8: Setting default properties
      Properties defaultProps = new Properties();
      defaultProps.setProperty("url", "http://default.com");
      Properties appProps = new Properties(defaultProps);
      System.out.println("App Properties with defaults: " + appProps.getProperty("url"));

      // Example 9: Clearing properties
      props.clear();
      System.out.println("Properties after clearing: " + props);

      // Example 10: Adding new properties
      props.setProperty("theme", "dark");
      props.setProperty("language", "en");
      System.out.println("Properties after adding new entries: " + props);
  }
}

