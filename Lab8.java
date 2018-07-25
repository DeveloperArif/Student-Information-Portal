import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] student = new String[8];
		
		int userChoice;
		String userChoice2;
		
		//student names
		student[0] = "Monika";
		student[1] = "Edward";
		student[2] = "Arif";
		student[3] = "David";
		student[4] = "Natasha";
		student[5] = "Leo";
		student[6] = "Mike";
		student[7] = "Arnold";
		
		//prompt 1
		System.out.println("Pick a student you want to learn about (1-8)");
		userChoice = scan.nextInt();
		System.out.println("You selected student: " + student[userChoice-1]);
		
		//in case of invalid entry
		if (userChoice <1 || userChoice >8) {
			System.out.println("Please enter a valid number from 1-8");
		}
		
		else {
		//prompt 2
		System.out.println("Do you want to know his favorite color or favorite food?  Pick one");
		userChoice2 = scan.nextLine();
		}
		
		
		

	}

}
