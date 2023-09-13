import java.util.*;

public class Calculator {

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		String Answer = "Y";
		double i;
		
		while (Answer.equalsIgnoreCase("Y")) {
			
			System.out.println("Enter the calculator mode: Standard/Scientific?");
			String Mode = keyboard.next();
		
		if (Mode.equalsIgnoreCase("Standard")) {
			
			System.out.println("The calculator will operate in standard mode.");
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			
			String Choice = keyboard.next();
			
			
			 while(!Choice.equals("+") && !Choice.equals("-") && !Choice.equals("*") && !Choice.equals("/"))//
	            {
				 System.out.println("Invalid operator " + Choice);
		           System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
					Choice = keyboard.next();
	            }
	               
				 switch (Choice) {
			
			case "+":  
			
				double sum = 0.0; 
				double x = 0.0; 
				int numbers;  
			
				System.out.println("How many numbers do you want to add?");
			
				numbers = keyboard.nextInt();
			
				System.out.println("Enter " + numbers + " numbers");
			
				for ( i = 1.0; i <= numbers; i++) {
			
					x = keyboard.nextDouble();
			
					sum = sum + x;
			
				}
				System.out.println("Result: " + sum);
				break;


			case "-": 
			
				double x1;
				int numbers1;
				
				System.out.println("How many numbers do you want to subtract?");

				numbers1 = keyboard.nextInt();

				System.out.println("Enter " + numbers1 + " numbers");
				
				double difference = keyboard.nextDouble();
				
				for (i = 2.0; i <= numbers1; i++) {
				        
						x1 = keyboard.nextDouble();
				        
				        difference = difference - x1;
				    }
				    System.out.println("Result: " + difference);
				    break;
		        
			case "*": 
			
				double product = 1.0; 
				double x2 = 0.0; 
				int numbers2; 
		
				System.out.println("How many numbers do you want to multiply?");
			
				numbers2 = keyboard.nextInt();
			
				System.out.println("Enter " + numbers2 + " numbers");
			
				for ( i = 1.0; i <= numbers2; i++) {
			
					x2 = keyboard.nextDouble();
			
					product = product * x2;
			
				}
				System.out.println("Result: " + product);
				break;


			case "/": 
			
				double quotient = 1.0; 
				double x3 = 1.0; 
				int numbers3; 
			
				System.out.println("How many numbers do you want to divide?");
			
				numbers3 = keyboard.nextInt();
			
				System.out.println("Enter " + numbers3 + " numbers");
				
				quotient = keyboard.nextDouble();
			
				for ( i = 0.0; i < numbers3 - 1.0; i++) {
			
					x3 = keyboard.nextDouble();
			
					quotient = quotient / x3;
			
				}
				System.out.println("Result: " + quotient);
				break;
			
			

			}
				 
			}
		
		else if (Mode.equalsIgnoreCase("Scientific")) {
      
      System.out.println("The calculator will operate in scientific mode.");
      System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
		
		String Choice = keyboard.next();
		
		 while(!Choice.equals("+") && !Choice.equals("-") && !Choice.equals("*") && !Choice.equals("/") &&!Choice.equals("sin") &&!Choice.equals ("cos")&&!Choice.equals("tan"))//
         {
			 System.out.println("Invalid operator " + Choice);
	           System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
				Choice= keyboard.next();
         }
            
			 switch (Choice) {
		
		case "+": 
			
			double sum = 0.0; 
			double x = 0.0; 
			int numbers;  
		
			System.out.println("How many numbers do you want to add?");
		
			numbers = keyboard.nextInt();
		
			System.out.println("Enter " + numbers + " numbers");
		
			for ( i = 1.0; i <= numbers; i++) {
		
				x = keyboard.nextDouble();
		
				sum = sum + x;
		
			}
			System.out.println("Result: " + sum);
			break;


		case "-": 
		
			double x1;
			int numbers1;
			
			System.out.println("How many numbers do you want to subtract?");

			numbers1 = keyboard.nextInt();

			System.out.println("Enter " + numbers1 + " numbers");
			
			double difference = keyboard.nextDouble();
			
			for (i = 2.0; i <= numbers1; i++) {
			        
					x1 = keyboard.nextDouble();
			        
			        difference = difference - x1;
			}
			System.out.println("Result: " + difference);
			break;


		case "*": 
		
			double product = 1.0; 
			double x2 = 0.0; 
			int numbers2; 
	
			System.out.println("How many numbers do you want to multiply?");
		
			numbers2 = keyboard.nextInt();
		
			System.out.println("Enter " + numbers2 + " numbers");
		
			for ( i = 1.0; i <= numbers2; i++) {
		
				x2 = keyboard.nextDouble();
		
				product = product * x2;
		
			}
			System.out.println("Result: " + product);
			break;


		case "/": 
		
			double quotient = 1.0; 
			double x3 = 1.0; 
			int numbers3; 
		
			System.out.println("How many numbers do you want to divide?");
		
			numbers3 = keyboard.nextInt();
		
			System.out.println("Enter " + numbers3 + " numbers");
			
			quotient = keyboard.nextDouble();
		
			for ( i = 0.0; i < numbers3 - 1.0; i++) {
		
				x3 = keyboard.nextDouble();
		
				quotient = quotient / x3;
		
			}
			System.out.println("Result: " + quotient);
			break;


		case "sin": 
		
			double radian;
		
			System.out.println("Enter a number in radians to find the sine");
		
			radian = keyboard.nextDouble();
		
			System.out.println("Result: " + Math.sin(radian));
			break;


		case "cos": 
		
			double radian1;
		
			System.out.println("Enter a number in radians to find the cosine");
		
			radian1 = keyboard.nextDouble();
		
			System.out.println("Result: " + Math.cos(radian1));
			break;


		case "tan": 
		
			double radian2;
		
			System.out.println("Enter a number in radians to find the tangent");
		
			radian2 = keyboard.nextDouble();
		
			System.out.println("Result: " + Math.tan(radian2));
			break;

		default: 
		System.out.println("Invalid operator " + Choice); 
		System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
		}
		}
		System.out.println("Do you want to start over? (Y/N)");
		Answer = keyboard.next();
		}
		System.out.println("Goodbye");
		}
}


