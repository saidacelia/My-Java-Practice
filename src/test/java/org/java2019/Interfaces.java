package org.java2019;

interface Interface_1 {
  public void mouse();
  public void cat();
}


interface Interface_2 {
  public void dog();
  public void chicken();
}


class Animals implements Interface_1, Interface_2 {

  public void mouse() {
    System.out.println("The Agharda eats cheese");
  }

  public void cat() {
    System.out.println("The cat eats Agharda");
  }

  public void dog() {
    System.out.println("The dog scares the cat");
  }

  public void chicken() {
    System.out.println("The chicken wakes up early");
  }

}



class MainClass {

  public static void main(String[] args) {

    Animals animals = new Animals();
    animals.mouse();
    animals.cat();
    animals.dog();
    animals.chicken();
  }
}