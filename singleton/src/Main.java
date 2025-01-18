package singleton.src;

import singleton.src.util.*;

/*
 * Simulating the connection in here - controller
 * */
public class Main {
  public static void main(String[] args) {
    System.out.println("- - - - - - - - - -");
    String url = new String("mongodb:localhost");
    Database myDB = Database.connect(url);

    /*
     * myDB can now be used in other actions - service
     */
  }
}
