import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		//variables
		
				Scanner scan = new Scanner(System.in);
				
				int userChoice = 0;
		
		
		System.out.println("Welcome to the Student Information App! "
				+ "Here you can look up students enrolled in Grand Circus Java Class and "
				+ "learn more information about them! ");
			
		
		//student names
		String[] student = new String[8];
		student[0] = "Monika";
		student[1] = "Edward";
		student[2] = "Arif";
		student[3] = "David";
		student[4] = "Natasha";
		student[5] = "Leo";
		student[6] = "Mike";
		student[7] = "Arnold";
		
		//student email address
		String[] email = new String[8];
		email[0] = "monika@gc.com";
		email[1] = "edward@gc.com";
		email[2] = "arif@gc.com";
		email[3] = "david@gc.com";
		email[4] = "natasha@gc.com";
		email[5] = "leo@gc.com";
		email[6] = "mike@gc.com";
		email[7] = "arnold@gc.com";
		
		//student hometown
		String[] hometown = new String[8];
		hometown[0] = "Houston, TX";
		hometown[1] = "Detroit, MI";
		hometown[2] = "Sterling Heights, MI";
		hometown[3] = "Hamtramck, MI";
		hometown[4] = "Center Line, MI";
		hometown[5] = "Austin, TX";
		hometown[6] = "Troy, MI";
		hometown[7] = "Los Angeles, CA";
		
		//previous career
		String[] previousCareer = new String[8];
		previousCareer[0] = "Web Designer";
		previousCareer[1] = "Insurance Agent";
		previousCareer[2] = "Mortgage Banker";
		previousCareer[3] = "Teacher";
		previousCareer[4] = "Eyeware Sales";
		previousCareer[5] = "Home Design Consultant";
		previousCareer[6] = "Real Estate Agent";
		previousCareer[7] = "Actor";
	
	
		System.out.println("Here is a list of our students: ");
		
		//listing students
		for(int i = 0; i < student.length; i++) {
		System.out.println(i+1 + "." + " " + student[i]);
		}
		
		//prompt 1
		System.out.println("Pick a student you want to learn about (1-8)");
		userChoice = scan.nextInt();
		
		
		//validate entry
		if(userChoice<1 || userChoice >8) {
			System.out.println("Please enter a number from 1-8");
		}
		
		
		//let user know which student they selected by name
		System.out.println("You selected student: " + student[userChoice-1]);		
		
		//give users more info on the selected student
		System.out.println(student[userChoice-1] + " is from " + hometown[userChoice-1] + ".");
		System.out.println("This student used to be a " + previousCareer[userChoice - 1] + " before enrolling in "
				+"Grand Circus Java Bootcamp!");
		System.out.println(student[userChoice-1] + " is scheduled to graduate on December 31st of 2018! ");
		System.out.println("You can contact " + student[userChoice-1] + " on " + email[userChoice-1]);
		
		scan.close();
		
	}

}
