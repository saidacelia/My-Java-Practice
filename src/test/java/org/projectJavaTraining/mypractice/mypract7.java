package org.projectJavaTraining.mypractice;

public class mypract7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(dayname(5));
	}

	
	
	public static String dayname (int daynum) {
		String dayname=""; 
		switch (daynum) { case 0: dayname= "monday";
		break; 
		 case 1: dayname= "tuesday";
		break; 
		case 2: dayname= "wednesday";
		break; 
		case 3: dayname= "thursday";
		break; 
		case 4: dayname= "friday";
		break; 
		case 5: dayname= "saturday";
		break; 
		case 6: dayname= "sunday";
		break; 
		default: dayname= "invalid day number";
        break;
		}
		return dayname;
		
	}
		}
