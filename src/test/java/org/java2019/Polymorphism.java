package org.java2019;

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}



class Bird extends Animal {
  public void animalSound() {
    System.out.println("The Bird says: Tchiw Tchiw");
  }
}


class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: Haw Haw");
  }
}


class Cat extends Animal{
public void animalSound(){
  System.out.println("The bird says : miaou miaou");
}
}



class MyMainClass {
  public static void main(String[] args) {

    Animal myAnimal = new Animal();// Create a Animal object

    Animal myBird= new Bird();  // Create a bied object
    Animal myDog = new Dog();  // Create a Dog object
    Animal mycat = new Cat();  // Create a cat object

    myAnimal.animalSound();
    myBird.animalSound();
    myDog.animalSound();
    mycat.animalSound();

  }
}



