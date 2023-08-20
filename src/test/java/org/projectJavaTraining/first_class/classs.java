package org.projectJavaTraining.first_class;

//import java.math.BigDecimal;

public class classs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* //increment or decrement operators
		int a=10;
		//a++;
		//a++;
		//a=a+1;
		//System.out.println(a);
		int r=a--;
		System.out.println("the value of a :"+a);
		
		System.out.println("the value of r:"+r); */

		
		/*int t=7;
		if (t==7||t<=7) { System.out.println("this is the value of t:"+t); }
		else { System.out.println("condition is not true");}*/
	
	/*declare variable who's value is 100
      add two conditions: variable is greater than 100
      variable equal to 100
      write a program for if statement which shows results with and/or operator */
	
		/*int w=100;
				System.out.println("value of w:" +w);
		if (w>100&&w==100) {System.out.println("condition is true");}
		else {System.out.println("there is a mouchekila");}
	*/
		
		
		/*
		int prg=40;
		if (prg>=90&&prg<=100) { System.out.println("this is grade of student: A");}
		else if (prg>=80&&prg<=89) {System.out.println("this is the grade of student: B");}
		else if ( prg>=70&&prg<=79) {System.out.println("this is the value of student :c");}
		else if (prg>=60&&prg<=69) {System.out.println("this is the grade of student :d ");}
		else { System.out.println("try again buddy");}
		
		
		//find the biggest number
		int t=60;
		int r=800;
		int i=2800;
		if (t>r) {System.out.println("t is greater");}
		else {System.out.println("i is greater");}
		
	    if (r>i) {System.out.println("r is great");}
		else {System.out.println("i is greater");}
	
		
		
		System.out.println("azul fellawen");
		
		
	    int day=4;
	    switch(day) {
	    	case 1: {System.out.println("monday");}
	    	break;
	    	case 2: {System.out.println("xtuesday");}
	    	break;
	    	case 3: {System.out.println("wednesday");}
	    	break;
	    	case 4: {System.out.println("thurstday");}
	    	break;
	    	case 5: {System.out.println("friday");}
	    	break;
	    	case 6: {System.out.println("saturday");}
	    	break;
	    	case 7: {System.out.println("sunday");}
	    	break;
	    	case 8: {System.out.println("dagharda");}
	    	
	    	case 9: {System.out.println("mlihhhh");}
	    	
	   
	    	
	    	
		
		
		int computer=70;
		int linux=60;
		int software=90;
		int totalnumber=computer+linux+software;
		int average=totalnumber/3;
		System.out.println(average);
		
		
		if (average>80 && average<100) {System.out.println("grade of sudent :A");}
		else if (average>70 && average<97) { System.out.println("grade of student:B");}
		else if (average >60 && average<96) {System.out.println("grade of student :C");}
		else if ( average >50 && average <59) {System.out.println("grade of student :D");}
		else if ( average >40 && average <49) {System.out.println("grade ougharda");}
		
		
		
		//while
		int a=1;
		while (a<=10) { System.out.println("print value of A :" +a);
		a++;}
		
		
		
	    //do while
		int a=10;
		do {System.out.println("print value of a with do while loop ="+a); 
		a--;
		}while(a>=1);
		
		
		
		
		//for loop
		for ( int a=10;a>=1;a--) {System.out.println("this is the value of a="+a);}
		 
		*/
 
		
		
		
		
		
        // constructor of the class
		//classs obj=new classs ();
		//obj.profit(100000, 88);
		
		
		
		addition();
	    lyes();
	    
	    
	  
	  int jan=profit(100000, 60000);
	  int feb=profit(160000, 80000);
	  int mar=profit(60000, 28000); 
	  int total=jan+feb+mar;
	  System.out.println("trimestre profit is = " +total);
	  
	  
	  
	  
	  
	  
	   price(10, 3);
	   price(10, 5);
	}



	
	
    public static void addition() { 
	int a=60;
	int t=26;
	int c=a+t;
	System.out.println("value of C = " +c); }
	
    
    
    
    
    
    
	public static void lyes() {
		int a=30;
		int t=70;
		int c=a+t;
		System.out.println("value of the query = " +c);}
	
	
	
	
	
	
	
	
	//this method is accepting arguments
	public static int profit(int income, int expenses) {
		
		int netprofit=income-expenses;
		System.out.println("the total profit of company =" +netprofit);
	     return netprofit;
	}
	
	
	
	
	
	
	
	public static void price(int gross, int exp) {
		int net=gross-exp;
		System.out.println("net of the employee = " +net);	
	}
	
	
	
	//create new class. create no static method. that method will print numbers from 1 to 100
	//in ascending order with for loop
	
	
	public void classe() {
	
	for (int a=100; a>=1; a++) {System.out.println("value of a asc =" +a);}
	
	
	
	
	
	
	

	//for loop
	//for ( int a=10;a>=1;a--) {System.out.println("this is the value of a="+a);}
	
	
	
	
	
}}

