import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapExample {
    // findKey accepts two parameters map and value and prints if the value is found or not
    public void findKey(HashMap<String, Integer> map, int value) {
        // set String foundKey to null
        String foundKey = null;

        // for entry in myHashMap.entrySet()
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            // if entry.getValue.equals target
            if (entry.getValue().equals(value)) {
                // set foundKey to entry.getKey
                foundKey = entry.getKey();
                // break out of loop
                break;
            }
        }

        // if foundKey is not null
        if (foundKey != null) {
            // print out key found with foundKey value
            System.out.println("Key found: " + foundKey);
        } 
        // else value not found
        else {
            // print out key not found
            System.out.println("Key not found");
        }
    }

    // delete method accepts map and value arguments and deletes entry in HashMap
    public void delete(HashMap<String, Integer> map, String value) {
      // if map contains value
      if (map.containsKey(value)) {
        // delete vlaue
        map.remove(value);
        // print deletion confirmation
        System.out.println("Deletion Successful. " + "\n" + "New Map: ");
        // call print keys to print out current HashMap
        printKeys(map);
      } 
      // else key not found
      else {
        // print message that key was not found
        System.out.println("Key not found");
      }
    }

    // add takes hashMap, value and num and enters new vlaue into map
    public void add(HashMap<String, Integer> map, String value, Integer num) {
        // if map does not contain key
        if (!map.containsKey(value)) {
            // put new key and vlaue into map
            map.put(value, num);
            // print out map
            printKeys(map);
        } 
        // else key already exist
        else {
            // print that key already exist
            System.out.println("Error Key already exists");
        }  
    }

    // method prints key and value in HashMap
    public void printKeys(HashMap<String, Integer> map) {
        // get set of all keys
        Set<String> keys = map.keySet();
        // for key in keys
        for (String key: keys) {
            // print out key, value and space
            System.out.print(key + ": " + map.get(key) + "\n");
        }
    }

    // findValue method accepts two arguments map and value and prints the value of the key
    public void findValue(HashMap<String, Integer> map, String value) {
        // set value to the value of key "Hello World!"
        Integer keyValue = map.get(value);
        // if keyValue is not null
        if (keyValue != null) {
            // print out value
            System.out.println("Value: " + keyValue);
        }
        // else value is null
        else {
            // print out vlaue not found
            System.out.println("Value not found");
        }
        
    }

    public static void main(String[] args) {
        // Create new HashMap that stores a String key and Integer value
        HashMap<String, Integer> myHashMap = new HashMap<>();
        // myHashMap put key and integer values
        myHashMap.put("Hello World!", 1);
        // myHashMap put key and integer values
        myHashMap.put("Test", 2);
        // myHashMap put key and integer values
        myHashMap.put("Found me", 3);

        // new instance of HashMapExample
        HashMapExample example = new HashMapExample();
        // findKey
        example.findKey(myHashMap, 3);
        // printKeys
        example.printKeys(myHashMap);
        // findValue
        example.findValue(myHashMap, "Hello World!");
        // add new key
        example.add(myHashMap, "Hello Word", 4);
        // delete key
        example.delete(myHashMap, "Test");
        
        
    }
}
