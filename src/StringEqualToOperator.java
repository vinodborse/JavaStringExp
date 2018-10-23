package learn.javarevisited.practice.springexamples;

public class StringEqualToOperator {
	
	/**
	 * Example for equals to operator "==" in java
	 * 
	 * @author Gaurav Kukade
	 */
	public static void main(String[] args) {
		
		String str1 = "gaurav";
		String str2 = "gaurav";
		
		if(str1==str2) {
			System.out.println("str1 and str2 are pointing to the same string object.");
		}else {
			System.out.println("str1 and str2 are pointing to the different string object.");
		}
	}

}
