/**
 * File: Else if
 * Author: Mikah Ho
 * Date Created: Mar 25, 2026
 * Date Last Modified: Mar 25, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	//q1
	public static String evenOrOdd(int num) {
	    
	    if (num == 0) {
	        return "Zero";
	    }
	    else if (num % 2 == 0) {
	        return "Even";
	    }
	    else {
	        return "Odd";
	    }
	}
	
	
	//q2
	public static String positiveOrNegative(int num) {
	    
	    if (num == 0) {
	        return "Zero";
	    }
	    else if (num > 0) {
	        return "Positive";
	    }
	    else {
	        return "Negative";
	    }
	}
	
	//q3
	public static String pluralize(String word) {
	    
	    word = word.toLowerCase();
	    
	    if (word.endsWith("ife")) {
	        return "ives";
	    }
	    else if (word.endsWith("ey")) {
	        return "eys";
	    }
	    else if (word.endsWith("y")) {
	        return "ies";
	    }
	    else {
	        return "s";
		}
	}
}
