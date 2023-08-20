package org.projectJavaTraining.FifthClasse;

public class modifiers {
public String user="saleem";

private String ui="55889966";
protected String age= "80";
String account = "656565656461";
private String atmid;


public void atm(String atmid) {
	this.atmid=atmid;
	System.out.println(this.atmid);
	
	
	String atmidno= getUi();
	System.out.println("this is setter method value ; " + atmidno);
}



public String getUi() {
	return ui;
}


public void setUi(String ui) {
	this.ui = ui;
	System.out.println(this.ui);
}


public String getAtmid() {
	return atmid;
}


public void setAtmid(String atmid) {
	this.atmid = atmid;
}








}	


