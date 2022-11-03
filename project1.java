package project1;
import java.util.*;
public class project1 {
	public static void main(String[] args) {
		//Data types Strings
		String userInput;
		String calculator = null;
		String operation = null;
		String startOver;
		// Data type Numbers
		double numsToAdd = 0;
		double numsToMult = 1;
		double numsToSub = 0;
		double numsToDiv = 0;
		int loopEnder = 0;
		double Radi = 0;
		
		 Scanner keyboard = new Scanner(System.in);
		//Print statements
		 for(int i = 0; i >= loopEnder; loopEnder++) {
		 System.out.println("Enter the calculator mode: Standard/Scientific?");
		// getting information from the user
		// asking the user to enter the calculator type
			userInput = keyboard.next();
		//Start of the loop
			
			//if statements for calculator types
			
			
				
		if(userInput.equalsIgnoreCase("scientific")){
			
			System.out.println("The calculator will operate in " + userInput.toLowerCase() + " mode.");
		}
		
		// statements saying if it doesnt work repeat the proccess
		
			if(userInput.equalsIgnoreCase("Standard")) {
				System.out.println("The calculator will operate in " + userInput.toLowerCase() + " mode.");
			}
			//using another name for userInput so it doesn't get complicated, now its easier to understand for a non coder
			calculator = userInput;

			
				//now telling the user what they can or can't do
			if(calculator.equalsIgnoreCase("Scientific")) {
			
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
				operation = keyboard.next();
			}
			else if(calculator.equalsIgnoreCase( "Standard")) {
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
				operation = keyboard.next();
			}
			
		
			
			
			//now we will start worrying about operations, after this we will worry about calculations
				
			
		
		
			// addition mode
				 if(operation.equals("+")) {
				System.out.println("How many numbers do you want to add?");
				
			int nums = keyboard.nextInt();
			
			System.out.println("Enter " + nums + " numbers");
			//for loop for addition
			for(int i1 = 1; i1 <= nums; i1++) {
				
				numsToAdd += numsToAdd = keyboard.nextDouble();
				
				
			}
			
			
			System.out.println("Result: " + numsToAdd);
			// saying if numbers is correct, prompt the computer to ask if the user wants to start over
				System.out.println("Do you want to start over? (Y/N)");
			
			numsToAdd = 0;
			userInput = keyboard.next();
			
			if(userInput.equalsIgnoreCase("y")) {
				loopEnder--;
			}
			
			if(userInput.equalsIgnoreCase("n")) {
				System.out.println("goodbye");
			}
				 }
			
			
			// multiplying
			//_______________________________________________________________________________________
			else if(operation.equals("*")) {
				System.out.println("How many numbers do you want to multiply?");
			
			int multNums = keyboard.nextInt();
			
			System.out.println("Enter " + multNums + " numbers");
			//for loop for addition
			for(int i1 = 1; i1 <= multNums; i1++) {
				numsToMult *= numsToMult = keyboard.nextDouble();
				
			}
			
			System.out.println("Result: " + numsToMult);
			// saying if numbers is correct, prompt the computer to ask if the user wants to start over
				System.out.println("Do you want to start over? (Y/N)");
			
			numsToMult = 1;
			userInput = keyboard.next();
			
			if(userInput.equalsIgnoreCase("y")) {
				loopEnder--;
			}
			
			if(userInput.equalsIgnoreCase("n")) {
				System.out.println("Goodbye");
			
			
			
			
			
			
			}
			}
			
			//subtracting
			//_______________________________________________________________________________________
			else if(operation.equals("-")) {
				
				System.out.println("How many numbers do you want to subtract?");
				
				int subNums = keyboard.nextInt();
				
				System.out.println("Enter " + subNums + " numbers");
				//for loop for subtraction
				numsToSub = keyboard.nextDouble();
				for(int iSub = 1; iSub <= subNums-1; iSub++) {
					  numsToSub = numsToSub - keyboard.nextDouble();
					
					
				}
				
				
				System.out.println("Result: " + numsToSub);
				// saying if numbers is correct, prompt the computer to ask if the user wants to start over
			
					System.out.println("Do you want to start over? (Y/N)");
				
				numsToSub = 0;
				userInput = keyboard.next();
				
				if(userInput.equalsIgnoreCase("y")) {
					loopEnder--;
				}
				if(userInput.equalsIgnoreCase("n")) {
					System.out.println("Goodbye");
				
				
				
				
			}
			}
			
			//dividing
			//_______________________________________________________________________________________
			
			else if(operation.equals("/")) {
					
					System.out.println("How many numbers do you want to divide?");
					
					int divNums = keyboard.nextInt();
					
					System.out.println("Enter " + divNums + " numbers");
					//for loop for division
					numsToDiv = keyboard.nextInt();
					for(int idiv = 1; idiv <= divNums-1; idiv++) {
						  numsToDiv = numsToDiv / keyboard.nextDouble();
					}
						  System.out.println("Result: " + numsToDiv);
						  System.out.println("Do you want to start over? (Y/N)");
						  userInput = keyboard.next();
							if(userInput.equalsIgnoreCase("y")) {
								loopEnder--;
							}
						  
				if(userInput.equalsIgnoreCase("n")) {
					System.out.println("Goodbye");
				
	
				}
				}
				
				
				//tan cos and sin mode
				
			else if(calculator.equalsIgnoreCase("scientific") && (operation.equalsIgnoreCase("sin"))) {
					System.out.println("Enter a number in radians to find the Sine");
					
					Radi = keyboard.nextDouble();
					double sinRadi = Math.sin(Radi);
				
					System.out.println("Result: " + sinRadi);
					  System.out.println("Do you want to start over? (Y/N)");
					  userInput = keyboard.next();
					
					Radi = 0;
					if(userInput.equalsIgnoreCase("y")) {
						loopEnder--;
					}
				  
		if(userInput.equalsIgnoreCase("n")) {
			System.out.println("Goodbye");
		

		}
					
				}
				
				//cos
				
			else if(calculator.equalsIgnoreCase("scientific") && (operation.equalsIgnoreCase("cos"))) {
					System.out.println("Enter a number in radians to find the Cosine");
					
					Radi = keyboard.nextDouble();
					double cosRadi = Math.cos(Radi);
					
					System.out.println("Result: " + cosRadi);
					Radi = 0;
					 System.out.println("Do you want to start over? (Y/N)");
					  userInput = keyboard.next();
					
					Radi = 0;
					if(userInput.equalsIgnoreCase("y")) {
						loopEnder--;
					}
				  
		if(userInput.equalsIgnoreCase("n")) {
			System.out.println("Goodbye");
		

		}
		

		}
					
				
				//Tan
				
			if(calculator.equalsIgnoreCase("scientific") && (operation.equalsIgnoreCase("tan"))) {
					System.out.println("Enter a number in radians to find the tangent");
					
					Radi = keyboard.nextDouble();
					double tanRadi = Math.tan(Radi);
					
					System.out.println("Result: " + tanRadi);
					Radi = 0;
					
					 System.out.println("Do you want to start over? (Y/N)");
					  userInput = keyboard.next();
					
				
					if(userInput.equalsIgnoreCase("y")) {
						loopEnder--;
					}
				  
		if(userInput.equalsIgnoreCase("n")) {
			System.out.println("Goodbye");
		

		}
				}
				
		 }
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		 }
	}










