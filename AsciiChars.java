import java.util.*;
public class AsciiChars {
	public static void printNumbers(String userInput)
	{
	// TODO: print valid numeric input
	System.out.println("Numbers located in the string:");
	for (int i = 0; i < userInput.length(); i++) 
	    { 
	    if (userInput.charAt(i) >= '0' && userInput.charAt(i)<= '9') {
	            System.out.println("• " + userInput.charAt(i));
	          } 
	    }	
	}
	public static void printLowerCaseLetters(String userInput) {
	System.out.println("Lowercase letters located in the string:");
	// TODO: print valid lowercase alphabetic input
	for (int i = 0; i < userInput.length(); i++) 
	    { 
	    if (userInput.charAt(i) >= 'a' && userInput.charAt(i) <= 'z') {
	        System.out.println("• " + userInput.charAt(i));
	        }
	    } 
	}
	public static void printUpperCaseLetters(String userInput)
	{
	System.out.println("Uppercase letters located in the string:");
	// TODO: print valid uppercase alphabetic input
	for (int i = 0; i < userInput.length(); i++) 
	    { 
	        if (userInput.charAt(i) >= 'A' && userInput.charAt(i) <= 'Z') {
	            System.out.println("• " + userInput.charAt(i));
	        }
	    } 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: "); // enter a name and hit enter
		String someString = scanner.next();

		AsciiChars.printNumbers(someString);
		AsciiChars.printUpperCaseLetters(someString);
		AsciiChars.printLowerCaseLetters(someString);
		
		System.out.print("Enter your name: "); // enter a name and hit enter
		String nameInput = scanner.next();
		System.out.println("Hello "+nameInput+"!");
		System.out.println("If you wish to continue to the interactive \n"
				+ "portion of the program, Enter ‘yes’ or ‘y’"
				+ ", enter any other phrase to exit the program");
		String programInput = scanner.next();
		boolean check = !programInput.equals("yes");
		boolean check2 = !programInput.equals("y");
		if(check && check2) {
			System.out.println("Exiting the program. Have a great day!");
		}
		while (programInput.equals("y") || programInput.equals("yes")) {
			Scanner scan = new Scanner(System.in);
				System.out.println("Do you have a red car? (yes, no):");
				String carInput = scan.next();
				while(!carInput.equals("yes") && !carInput.equals("no")) {
					System.out.println("Please enter a value input (yes,no) "
							+ "and answer the question again");
					System.out.println("Do you have a red car? (yes, no):");
					String newcarInput = scan.next();
					if(newcarInput.equals("yes") || newcarInput.equals("no")) {
						carInput = newcarInput;
						break;
					}	
				}
				System.out.println("You responded, "+carInput+" to having a red car");	
			
			System.out.println("What is the name of your favorite pet?");
				String petNameInput = scan.next();
				while(petNameInput.length() < 3) {
					System.out.println("Please enter a valid pet name"
							+ " that is at least 3 letters long");
					String newPetNameInput = scan.next();
					if(newPetNameInput.length() >= 3) {
						petNameInput = newPetNameInput;
						break;
					}
				}
				System.out.println(petNameInput+" is your favorite pet name");
			
			System.out.println("What is the age of your favorite pet?");
			int petAgeInput = scan.nextInt();
			while(petAgeInput > 50) {
				System.out.println("Please enter a valid pet age less than 50 years old");
				int newpetAgeInput = scan.nextInt();
				petAgeInput = newpetAgeInput;
			}
			System.out.println(petNameInput+" is " + petAgeInput + " years old");
			
			System.out.println("What is your lucky number?");
				int luckyNumInput = scan.nextInt();
				System.out.println("Your lucky number is "+luckyNumInput);
			
			System.out.println("Do you have a favorite quarterback? (yes, no)");
			String quarterbackInput = scan.next();
				if(quarterbackInput.equals("yes")) {
					System.out.println("What is their jersey number?");
					int jerseyNumber = scan.nextInt();
				}
			System.out.println("What is the two-digit model year of your car?");
			int modelYear = scanner.nextInt();
				while(modelYear > 99) {
					System.out.println("Please enter a valid two-digit model year"
							+ " of your car");
					int newModelYear = scan.nextInt();
					if(newModelYear <= 99) {
						modelYear = newModelYear;
						break;
					}
				}
				if(modelYear <= 9) {
					System.out.println("The two-digit model year of your car is 0"+modelYear);
			    } else {
			    	System.out.println("The two-digit model year of your car is "+modelYear);	
			    }
		
			System.out.println("What is the first name of the their favorite actor or actress?");
				String actorName = scanner.next();
				System.out.println("Your favorite actor or actresses' name is "+actorName);
				
			System.out.println("Enter a random number between 1 and 50.");
				int randomNumInput = scanner.nextInt();
				while(randomNumInput < 1 || randomNumInput > 50) {
					System.out.println("Please enter a valid random number"
							+ " between 1 and 50");
					int newRandomNumInput = scan.nextInt();
					if(newRandomNumInput >= 1 || newRandomNumInput <= 50) {
						randomNumInput = newRandomNumInput;
						break;
					}
				}
				System.out.println("Your random number between 1 and 50 is "+randomNumInput);
			
			//Lottery Ticket Generator Starts Here
				ArrayList<Integer> magicNumberList = new ArrayList<Integer>();
				for(int i = 0; i < 3; i++) {
					int x = 1 + (int)(Math.random() * ((75 - 1) + 1));
					magicNumberList.add(x);
					//System.out.println(magicNumberList.get(i));
				}
				int randomMagicNumber = magicNumberList.get((int)Math.random() * 3);
				//Magic Ball Number Created Here
				int magicBall;
				if(quarterbackInput == "yes") {
					int q = Integer.parseInt(quarterbackInput);
					magicBall = q * randomMagicNumber;
				}else {
					magicBall = luckyNumInput * randomMagicNumber;
				}
				while(magicBall > 75) {
					magicBall = magicBall - 75;
				}
//First Lottery Number	
			// Find the 3rd letter of their favorite pet. Convert that
			//character value to an integer value
	int firstLotteryNumber;
	char petChar = petNameInput.charAt(2);
	firstLotteryNumber = (int)petChar;
	while(firstLotteryNumber > 65) {
		firstLotteryNumber = firstLotteryNumber - 65;
	}
	if(firstLotteryNumber == 0) {
		firstLotteryNumber = 1 + (int)(Math.random() * ((65 - 1) + 1));
	}
//Second Lottery Number
			//Use the two digit model year of their car
			//and add their lucky number to it.
	int secondLotteryNumber;
	secondLotteryNumber = modelYear + luckyNumInput;
	while(secondLotteryNumber > 65) {
		secondLotteryNumber = secondLotteryNumber - 65;
	}
	if(secondLotteryNumber == 0) {
		secondLotteryNumber = 1 + (int)(Math.random() * ((65 - 1) + 1));
	}
//Third Lottery Number
			//Use the random number between 1 and 50,
			//subtracting one of the generated random numbers
	int thirdLotteryNumber;
	int anotherRandomNumber = magicNumberList.get((int)Math.random() * 3);
	thirdLotteryNumber = anotherRandomNumber - randomNumInput;
	while(thirdLotteryNumber > 65) {
		thirdLotteryNumber = thirdLotteryNumber - 65;
	}
	if(thirdLotteryNumber == 0) {
		thirdLotteryNumber = 1 + (int)(Math.random() * ((65 - 1) + 1));
	}
//Fourth Lottery Number
			//Convert the first letter of
			//their favorite actor/actress to an integer and use that value.
	int fourthLotteryNumber;
	char actorChar = actorName.charAt(0);
	fourthLotteryNumber = (int)actorChar;
	while(fourthLotteryNumber > 65) {
		fourthLotteryNumber = fourthLotteryNumber - 65;
	}
	if(fourthLotteryNumber == 0) {
		fourthLotteryNumber = 1 + (int)(Math.random() * ((65 - 1) + 1));
	}
//Fifth Lottery Number
			//Use the age of their favorite pet + their car model year.	
	int fifthLotteryNumber = petAgeInput + modelYear;
	while(fifthLotteryNumber > 65) {
		fifthLotteryNumber = fifthLotteryNumber - 65;
	}
	if(fifthLotteryNumber == 0) {
		fifthLotteryNumber = 1 + (int)(Math.random() * ((65 - 1) + 1));
	}
//Reorder Numbers in Ascending Order and Gets Rid of Duplicates
	int numbersArray[] = {firstLotteryNumber,secondLotteryNumber,thirdLotteryNumber,
			fourthLotteryNumber,fifthLotteryNumber};
	int temp;
	for (int i = 0; i < 5; i++) 
    {
        for (int j = i + 1; j < 5; j++) {
        	if (numbersArray[i] == numbersArray[j]) {
        		
        		numbersArray[i]++;
        	}
            if (numbersArray[i] > numbersArray[j]) 
            {
                temp = numbersArray[i];
                numbersArray[i] = numbersArray[j];
                numbersArray[j] = temp;
                temp = Math.abs(temp);
            }
        }
    }
//Lottery Numbers Print out Here
    System.out.println("Lottery numbers: ");
    for (int i = 0; i < 5 - 1; i++) 
    {
        System.out.print(Math.abs(numbersArray[i]) + ", ");
    }
    System.out.print(numbersArray[5 - 1] + " Magic Ball:" +Math.abs(magicBall));
	System.out.println("");
	
//After the numbers have been printed, ask the user if they would
//like to answer questions to generate another set of numbers. If so, repeat the
//entire process. If not, print a thank you message and exit.
		System.out.println("Would you like to generate another set of lottery tickets? (yes,no)");
		String anotherSet = scan.next();
		if(anotherSet.equals("yes")) {
			continue;
		}
		else {
			System.out.println("Thank you for using this lottery ticket generator. Bye!");
			break;
		}		
	}	
			
	}
	
}
