package org.java2019;

import java.util.HashMap;

public class HashMap_Example {

  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    capitalCities.put("USA","Washington DC");     // add items to the hashmap
    capitalCities.put("Algeria", "Algiers");
    capitalCities.put("France","Paris");
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");

    System.out.println(capitalCities);       // print all the key, value pairs in the hash map
    System.out.println(capitalCities.get("Algeria"));   // access a specific item

    capitalCities.remove("Germany");     // to remove an item
    System.out.println(capitalCities);
    System.out.println(capitalCities.size());

    // loop through a hashmap
    System.out.println("---------loop through a hashmap--------");    // print the key only
    for (String i : capitalCities.keySet()){
      System.out.println(i);
    }
    // print the key and value
    for (String i: capitalCities.keySet()){
      System.out.println(i+" - "+capitalCities.get(i));
    }



  }


}
