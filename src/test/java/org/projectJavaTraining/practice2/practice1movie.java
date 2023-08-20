package org.projectJavaTraining.practice2;

public class practice1movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		movie movie1 =new movie ("avengers", "joss whedon", "pg13");
		movie movie2= new movie ("stepbrothers", "adam mckay", "r");
		
		movie1.setrating("fxxfnfg");
		//so here we tried to set the rating for movie1 to kkkkkkkjhhh , it is 
		//not a valid rating, so the system will return NR
		movie2.setdirector("adam mckday");
		movie1.settitle("avenzdbsfgers");
		//here the same thing if the director name does not match the this.director
		//it will return not a valid name
		//this is because we used the setters and getters
		System.out.println("movie1 : " + movie1.getrating());
		System.out.println("movie2 : " + movie2.getdirector());
		System.out.println("movie1 title : " + movie1.gettitle());
	}

}



//getters and setters 
//tutorial 31 giraffe academy