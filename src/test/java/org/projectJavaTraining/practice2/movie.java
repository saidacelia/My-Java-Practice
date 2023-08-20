package org.projectJavaTraining.practice2;

public class movie {
	private String title;
	private String director;
	private String rating;
	
	public movie(String title, String director, String rating) {
	this.settitle(title);
	this.setdirector(director);
	this.setrating(rating);
}
	
	
	//using getters and setters to set a rating 
	//initially the user could put anything he wanted in the rating
	//but now he can only set g pg pg13 or its an NR
	
	public void setrating(String rating) {
		if (rating.equals("g") || rating.equals("pg") || rating.equals("pg13") ) {
			this.rating=rating;
		}else {this.rating= "NR"; }
	}
	
	public String getrating (){
		return rating;
	}
	
	
	
	
	
	public void settitle(String title) {
		if (title.equals("avengers")) {
			this.title=title;
		}else {this.title="not a valid title a winath";}
		}
	
	public String gettitle() {
		return this.title;
	}
	
	
	
	
	
	
	
	public void setdirector(String director) {
		if (director.contentEquals("adam mckay")) {
			this.director=director;
		}else {this.director="not a valid name";}
	}
	
public String getdirector() {
	return this.director;
}





}