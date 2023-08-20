package org.java2019;

public class Encapsulation {
// sensitive data is hidden
  // to achieve that we use private key word

private String name="Agharda mlih";
// to access it or modify iy we use getters and setters


  public String getName() {
    return name;
  }

  public String setName(String name) {
    this.name = name;
    return name;
  }

  public static void main(String[] args) {
    Encapsulation enc= new Encapsulation();

    System.out.println(enc.getName());

    String a= enc.setName("amchich");
    System.out.println(a);

  }
}
