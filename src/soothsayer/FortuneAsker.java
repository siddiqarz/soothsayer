package soothsayer;

import java.text.NumberFormat;
import java.util.Scanner;

public class FortuneAsker {
	Scanner input = new Scanner(System.in);
	
public void tellFortune( ) {
	// asks for firstname
	System.out.println("Please enter your first name: ");
	String firstName = input.nextLine();

	// quit program if input is quit
	if (firstName.equalsIgnoreCase("quit")) {
		System.out.println("Nobody Likes a Quitter...");
		System.exit(0);
	}
	System.out.println("Hello " + firstName + " let's take a stab at your fortune.");

	// asks for lastname
	System.out.println("Please enter your last name: ");
	String lastName = input.nextLine();

	// quit program if input is quit
	if (lastName.equalsIgnoreCase("quit")) {
		System.out.println("Nobody Likes a Quitter...");
		System.exit(0);
	}

	int age = 0;
	String newAge = "";
	//loop to check for quit in the String checkAge
	while (true) {
		System.out.println("How old are you?");
		String checkAge = input.nextLine();
		
// convert the age into an integer and check if it meets any conditions
		try {
			age = Integer.parseInt(checkAge);
			if (age < 16) {
				System.out
						.println("Your future is too far away to see, try again when you add an inch or two.");
				System.exit(0);
			} else if (age >= 16 && age % 2 == 0) {
				newAge = "two decades";
			} else {
				newAge = "five years";
			}
			break;
		}
// catches errors that come up after the input parameter is assigned to age
		catch (Exception e) {

			if (checkAge.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else {
				System.out.println("Please use numbers only.");
			}
		}

	}
//Asks user for birth month, checks for the word quit, else asks user to use numbers only
	int month = 0;
	while (true) {
		System.out.println("What month were you born in?");
		String checkMonth = input.nextLine();

		try {
			month = Integer.parseInt(checkMonth);
			if (month < 1 || month > 12) {
				System.out.println("Sure, and I was born on Mars in a spacesuit.");
				System.out.println("What month were you born in?");
				month = input.nextInt();
				break;
			} else {
				break;
			}

		} catch (Exception e) {

			if (checkMonth.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else {
				System.out.println("Please use numbers only.");
			}
		}

	}
//conditions for various birth month numbers
	double bankBalance = 0.00;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	if (month >= 1 && month < 4) {
		bankBalance = 3556457.01;
	} else if (month >= 4 && month < 7) {
		bankBalance = 10003.45;
	} else if (month >= 7 && month < 10) {
		bankBalance = 50.8;
	} else {
		bankBalance = 0.00;
	}

	boolean helpColor = false;
	String color = "";
	while (helpColor == false) {
		//asks user for color and to request 'help' for options. 
		System.out.println(
				"Please enter your favorite ROYGBIV color, request 'help', if you're unsure of the options: ");
		color = input.nextLine();
		//condition if user types in help
		if (color.equalsIgnoreCase("help")) {	
			System.out.println("The colors are: Red, Orange, Yellow, Green, Blue, Indigo or Violet");
		} 
		//condition if user types in quit
		else if(color.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		else //assumes user inputs correct color and ends loop
		{
			helpColor = true;
		}
	}
//conditions for various color inputs
	switch (color.toLowerCase()) {
	case "red":
		color = "Horse and carriage";
		break;
	case "orange":
		color = "Motorbike";
		break;
	case "yellow":
		color = "Mazda";
		break;
	case "green":
		color = "Helicopter";
	case "blue":
		color = "Rikshaw";
		break;
	case "indigo":
		color = "Bat Mobile";
		break;
	case "violet":
		color = "Bugatti";
		break;
	default:
		color = "Donkey";
	}

	
	int numberOfSiblings = 0;
	String vacationHome = "";
	//Loop requesting user to input number of siblings
	while (true) {
		System.out.println("How many siblings do you have?");
		String checkNumberOfSiblings = input.nextLine();
		
		try {
			numberOfSiblings = Integer.parseInt(checkNumberOfSiblings);	//converts the string to an integer
			//conditions for various possible user inputs
						if (numberOfSiblings > 3) {
							vacationHome = "Dubai";
						} else
							switch (numberOfSiblings) {
							case 0:
								vacationHome = "Kenya";
								break;
							case 1:
								vacationHome = "Brazil";
								break;
							case 2:
								vacationHome = "California";
								break;
							default:
								vacationHome = "the Bermuda Triangle";
							}
						break;	
		}
	
		catch (Exception e) {
			if (checkNumberOfSiblings.equalsIgnoreCase("quit")) {
				//prints this out if user had typed word quit
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else 
				//prints this out if the string that was converted to an integer is not an actual number
			{
				System.out.println("Please use numbers only.");
				
			}
		}
	}
	//Final result, prints out the fortune. 
	System.out.println(
			firstName + " " + lastName + " will retire in " + newAge + " with " + formatter.format(bankBalance)
					+ " in the bank, a vacation home in " + vacationHome + " and travel by " + color);
	

}
}






