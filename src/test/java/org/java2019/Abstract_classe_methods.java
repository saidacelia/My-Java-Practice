package org.java2019;

abstract class Abstract_classe_methods {

  public String name = "Agharda";
  public int age = 34;
  public abstract void study();
  public void school() {
    System.out.println("Agharda goes to school");
  }
}


// subclass (inherits from  Abstract_classe_methods)
class sudents extends Abstract_classe_methods {
  public int graduation_year = 2018;
  public void study() {
    System.out.println("Studying all day long");
  }
}


class MyClass {
  public static void main(String[] args) {
    sudents stu = new sudents();
    stu.study();
    System.out.println(stu.name);
    System.out.println(stu.age);
    System.out.println(stu.graduation_year);
    stu.school();
  }
}