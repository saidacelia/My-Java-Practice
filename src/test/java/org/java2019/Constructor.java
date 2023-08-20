package org.java2019;

public class Constructor {
int classAge;
String className;

public Constructor(int age, String name){
this.classAge=age;
this.className=name;
}

  public static void main(String[] args) {
    Constructor con= new Constructor(1, "bicha");
    System.out.println(con.className+" , "+con.classAge);
  }


}

