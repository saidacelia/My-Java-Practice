package org.java2019;

public class inheritence {
  protected String brand = "Chevrolet";
  protected String carName = "Malibu";    // inheritence or Vehicle attribute
  public void honk() {                    // inheritence or Vehicle method
    System.out.println("Tuut, tuut!");
  }
}



class Car extends inheritence {

  protected int modelYear = 2009;    // Car attribute

  public void color() {                    // inheritence or Vehicle method
    System.out.println("color is grey");
  }

  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.carName + " " + myCar.modelYear);
  }
}




// java supports multiple inheritences
class Body extends Car {

  protected String carBody = "sedan";

  public static void main(String[] args) {

    Body body = new Body();
    System.out.println(body.carBody + " " + body.brand + " " + body.carName + " " + body.modelYear);
    body.color();
    body.honk();


  }
}

class Agharda extends Body{

  protected String aghardaSize= "small agharda";
  public void agharda_job() {
    System.out.println("Agharda eats the car wires in the engine");
  }


  public static void main(String[] args) {

    Agharda agha = new Agharda();
    agha.color();
    agha.honk();
    agha.agharda_job();

    System.out.println(
        agha.aghardaSize + " eats " + agha.carBody + " " + agha.brand + " " + agha.carName + " "
            + agha.modelYear + " engine wires and enjoys it");

  }}
