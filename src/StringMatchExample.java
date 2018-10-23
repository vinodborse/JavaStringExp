package learn.javarevisited.practice.springexamples;

/**
 * This program is about 'String.matches(String regex)' example
 * 
 * In regex . -> Matches any char
 * 			* -> Occurs zero or more times
 * 
 * Created on 23-Oct-2018 at 10:45:49 PM
 * @author Gaurav Kukade
 */
public class StringMatchExample {

	public static void main(String[] args) {
		String [] alphabets = {" ", "1245A", "455872BBHH45", "4554jjll", "ggjh455255", "abcde"};
		
		for(String alphabet:alphabets) {
			System.out.println("does " + alphabet + " contains aplhabetic words: "+ alphabet.matches(".*[A-Za-z].*"));
		}
		
		String [] numbers = {" ", "+1234", "gg567", "454l"};
			for(String number:numbers) {
				System.out.println("number "+ number+" contains only 1-9 digits: "+ number.matches(".*[1-9].*"));
			}
	}

}
