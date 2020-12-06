package proj1;
import javax.swing.JOptionPane;
// Title : Parsing a name
// @ Kevin Williams
// This program finds how many letters there are in your name. (Both in the first and last name). It tells you your first and last name initial. It also calculates the average of your final and midterm grades.
public class Project1 {
	public static void main(String[] args)
	{
		String fullName;
		int posOfSpace;
		String firstName;
		String lastName;
		int firstNameLength;
		int lastNameLength;
		int fullNameLength;
		char firstInitial;
		char lastInitial;
		double midterm;
		double finalExam;
		double average;
		
		fullName = JOptionPane.showInputDialog("Please enter your first name, followed by a space, followed by your last name");
		posOfSpace = fullName.indexOf(" ");
		// Changed the substring of fullName within the variable firstName from (1, posOfSpace-1) to substring (0,posOfSpace) so that the firstName would include the first letter of the first name and include the last letter of the first name
		firstName = fullName.substring(0, posOfSpace);
		//Changed the substring of fullName within the variable lastName so that it would include everything after the space regardless of how long the name is the output will still be the last name
		lastName = fullName.substring(posOfSpace+1);
		//Changed output statements so that the lastName would be seen before the firstName
		System.out.println("Name: " + lastName + ", " + firstName + "\n");
		
		firstNameLength = firstName.length();
		lastNameLength = lastName.length();
		//changed the full name length so that it calculates not how many characters were in the entire string but how many letters were in each name and then added them.
		fullNameLength = firstName.length() + lastName.length();
		
		//changed the output statement so that it would not only say 4 as the number of letters in the firstName but actually use the length which was already counted and stored in a variable
		System.out.println("There are " + firstNameLength + " letters in my first name " );
		System.out.println("There are " + lastNameLength + " letters in my last name");
		//changed the output statement below so it would display the fullNamelength based on the data that is stored in fullNameLength
		System.out.println("There are " + fullNameLength + " letters in my full name\n");
		
		firstInitial = fullName.charAt(0);
		//changed  last initial so that the computer would chose the letter at index 0 in the last name instead of using the incorrect length method
		lastInitial = lastName.charAt(0);
		
		//Created an output statement for firstInitial as there wasn't one before 
		System.out.println("First initial: " + firstInitial );
		System.out.println("Last initial: " + lastInitial );
		
		midterm = Double.parseDouble(JOptionPane.showInputDialog("Please enter your midterm score."));
		finalExam = Double.parseDouble(JOptionPane.showInputDialog("Please enter your final exam score."));		
		//Changed average so that it would add the midTerm and final before dividing by 2
		average = (midterm + finalExam )/ 2;
		
		System.out.println();
		System.out.println("\nMidterm: " + midterm);
		//Changed output statement so that it outputs the final instead of the midterm
		System.out.println("Final Exam: " + finalExam);
		System.out.println("\nAverage: " + average);
	}

	private static int indexOf(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}