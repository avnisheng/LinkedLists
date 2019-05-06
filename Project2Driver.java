
import java.util.Scanner;

public class Project2Driver {
	public static void main(String[] args) {
		
		String choice = null;
		
		//LinkedBag<Cheese> myCheesBag = new LinkedBag<Cheese>();
		
		Scanner keyboard = new Scanner(System.in);
		
		// Start the vending and loop until user decides to leave
		do {
			/**
			 * Show the item cost and current balance, then ask the user to
			 * input the command to add money, refund, dispense, or leave.
			 */
			System.out.println("A(Add object to Bag)");
			System.out.println("R(Remove object from bag)");
			System.out.println("F(Find if an object is in bag)");
			System.out.println("C(Count the # of occurrences of object in bag)");
			System.out.println("D(Displays contents of bag)");
			System.out.println("S(Display size of bag)");
			System.out.println("X(Exit the program):  )" );
			System.out.println("Please Enter one of the following: ");
			choice = keyboard.nextLine();

			/**
			 * Take the users input and either quit the vending (X), dispense
			 * 
			 * 
			 */
			if (choice.equals("X")) {

				System.out.println("Good Bye");

			} else if (choice.equals("A")) {
				System.out.println("Enter Kind of Cheese: "); //+ add());
					newCheeseType = keyboard.nextLine();
				System.out.println("Enter Price of Cheese: ");
					newCheesePrice = keyboard.nextDouble();
				myCheeseBag.add(new Cheese(newCheeseType, newCheesePrice));
				
			} else if (choice.equals("R")) {
				System.out.println("\nEnter kind of cheese to remove: ");
					cheeseTypeEntered = keyboard.nextLine();
				System.out.println("Enter Price of cheese to remove: ");
					cheesePriceEntered = keyboard.nextDouble();
					myCheeseBag = myCheeseBag.remove();
					
				if(myCheeseBag.remove(new Cheese(newCheeseType, newCheesePrice))){
					System.out.println("\n" + newCheeseType + "" + newCheesePrice + "removed");
				}
				else
					System.out.println("\n" + newCheeseType + "" + newCheesePrice + "not removed");
				
			} else if (choice.equals("F")) {
				System.out.println("Enter Price of cheese to find in bag: ");
					newCheeseType = keyboard.nextLine();
				System.out.println("Enter Kind of cheese to find in bag: ");
					myCheeseBag.exists();
				
				
			} else if (choice.equals("C")) {
				 myCheeseBag = myCheeseBag.countOccurrences();
				

			} else if (choice.equals("D")) {
				if(myCheeseBag.getSize() == 0){
					System.out.println("Bag is empty");
				}
				else
					System.out.println(myCheeseBag.toString());
					
			} else if (choice.equals("S")) {
				int aVal = myCheeseBag.getSize();
				System.out.println("Size = " + aVal);
				
			} else {
				System.out.println("Invalid Choice");
			}

		
	} while (!(choice.equalsIgnoreCase("X")));
}
}