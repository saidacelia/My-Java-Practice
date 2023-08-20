package org.projectJavaTraining.fourth;

public class Modifiers {
	static int length=6;
	static int width= 2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers create= new Modifiers();
		create.area();
		create.circle();
		
	}
		
	
		public void area() {
			int length=10;
			int area=this.length*width;
			System.out.println("area = " +  area);
		}
		
		
		

		
		public void circle() {
		int length=5;
		int width = 5;
		int circle=this.length+this.width;
		System.out.println("circle = " + circle);
		
		}
		

	}


