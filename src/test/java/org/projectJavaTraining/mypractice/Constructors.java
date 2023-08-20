package org.projectJavaTraining.mypractice;

public class Constructors {

	public static void main(String[] args) {


		ConstructorBook book1= new ConstructorBook ("air", "mouloud", 300, "english");
		ConstructorBook book2= new ConstructorBook ("hello world", "leghidha", 260, "english");
		ConstructorBook book3= new ConstructorBook ("assa nezha", "massa bouchafa", 400, "kabyle");
		ConstructorBook book4= new ConstructorBook ("le jardin", "affelah", 680, "francais");
		ConstructorBook book5= new ConstructorBook ("ballon", "zidane", 406, "francais");
		ConstructorBook book6= new ConstructorBook ("attval", "acharchar", 890, "english");
		
		System.out.println(book1.title);
	}

}


// next would be in tutorial 29