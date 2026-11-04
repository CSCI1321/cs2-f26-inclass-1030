package cs2.sandbox;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {
  public static void main(String[] args) {
    Set<String> s = new HashSet<String>();
    System.out.println(s);
    s.add("Hello");
    s.add("Z");
    s.add("work");
    s.add("Goodbye");
    System.out.println(s);
    s.add("please");
    System.out.println(s);
    System.out.println(s.contains("Z"));
    System.out.println(s.size());
    s.remove("Z");
    System.out.println(s);
    System.out.println(s.add("Hello"));
    System.out.println(s);
    System.out.println(s.remove("Bob"));

    HashSet<String> t = new HashSet<>();
    t.add("Hello");
    t.add("please");
    t.add("AAAA");

    HashSet<String> tcopy = (HashSet<String>)t.clone();
    
    System.out.println(t);
    t.addAll(s);
    System.out.println(t);
    t.removeAll(s);
    System.out.println(t);

    System.out.println(tcopy);
    tcopy.retainAll(s);
    System.out.println(tcopy);
    
    System.out.println(s);
    s.add("WHAT");
    Iterator<String> it = s.iterator();
    while(it.hasNext()) {
      String str = it.next();
      System.out.println(str);
      System.out.println(str);
    }

  }
}
