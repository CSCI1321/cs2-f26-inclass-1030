package cs2.sandbox;

import java.io.File;
import java.util.Scanner;

public class FileReadExample {
  public static void main(String[] args) {
    try {
      File file = new File("tempest.txt");
      Scanner scan = new Scanner(file);
      System.out.println(scan.nextLine());
      System.out.println(scan.nextLine());
      System.out.println(scan.nextLine());
      scan.close();
    } catch (Exception ex) {
      System.err.println("Something went wrong!");
    }
  }
}
