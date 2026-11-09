package cs2.sandbox;

import java.util.HashMap;

public class MapTester {
  public static void main(String[] args) {
    HashMap<String,Integer> map = new HashMap<>();
    System.out.println(map);
    map.put("One", 1);
    map.put("Two",2);
    System.out.println(map);
    System.out.println(map.get("One"));
    System.out.println(map.get("WHAT"));
    System.out.println(map.containsKey("Two"));
    System.out.println(map.containsValue(4));
    System.out.println(map.size());

    map.put("One",999);
    System.out.println(map);
    System.out.println(map.remove("Two"));
    
  }
  
}
