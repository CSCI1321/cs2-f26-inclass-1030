package cs2.sandbox;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TextAnalysis {
  
  public static Set<String> getWords(String filename) {
    HashSet<String> hs = new HashSet<>();
    try {
      File file = new File(filename);
      Scanner scan = new Scanner(file);
      while(scan.hasNextLine()) {
        String line = scan.nextLine();
        System.out.println(line);
        String[] parts = line.split(" ");
        for(String word : parts) {
          hs.add(word.toLowerCase().replaceAll("[^A-Za-z]",""));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return hs;
  }

  public static Map<String,Integer> getWordCounts(String filename) {
    HashMap<String,Integer> map = new HashMap<>();
    try {
      File file = new File(filename);
      Scanner scan = new Scanner(file);
      while(scan.hasNextLine()) {
        String line = scan.nextLine();
        System.out.println(line);
        String[] parts = line.split(" ");
        for(String word : parts) {
          String w = word.toLowerCase().replaceAll("[^A-Za-z]","");
          if (!map.containsKey(w)) {
            map.put(w,1);
          } else {
            map.put(w, map.get(w) + 1);
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return map;
  }


  public static void main(String[] args) {
    Set<String> twords = getWords("tempest.txt");
    System.out.println(twords);
    System.out.println(twords.size());

    Map<String,Integer> tmap = getWordCounts("tempest.txt");
    System.out.println(tmap);

    for(String key : tmap.keySet()) {
      if(tmap.get(key) > 100)
        System.out.println(key + "\t" + tmap.get(key));
    }
    String maxKey = "";
    for(String key : tmap.keySet()) {
      if(tmap.get(key) > tmap.get(maxKey)) {
        maxKey = key;
      }
    }
    System.out.println(maxKey + "\t" + tmap.get(maxKey));

  }


}
