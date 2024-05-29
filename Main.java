package hw09;


import java.util.Scanner;

/**
 * This is a class to model a PC object. It can store the tower, motherboard, processor, videoCard, hardDrive, memory, monitor
 * 
 * To create an instance of the Case class use the following:
 * PC pc = new PC(); default case
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */
public class Main {
	public static void main(String[] args) {
		mainMenu();
		displayParts();
		
	}
	/**
	 * A method to display the options in the menu.
	 */
	public static void mainMenu() {
	System.out.println("***********Main Menu************");
	System.out.println("    1. Choose a Case");
	System.out.println("    2. Choose a Motherboard");
	System.out.println("    3. Choose a Monitor");
	System.out.println("    4. Choose a CPU");
	System.out.println("    5. Choose a VideoCard");
	System.out.println("    6. Choose a Hard Drive");
	System.out.println("    7. Choose a Memory");
	System.out.println("    8. Display Reciept");
	System.out.println("    9. Exit Program");
	System.out.println("********************************");
	
	}
	 /**
	  *  A method to display the pc parts and add them to the pc.
	  */
	public static void displayParts() {
		Scanner in = new Scanner(System.in);
		Inventory inv = new Inventory();
		inv.initializeInventory();
		PC pc = new PC(); 
		
		while(true) {
		int choice = in.nextInt();
		if(choice == 1) { 
			System.out.println("");
			inv.printCases();
			System.out.println("Would you like the first, second, or third option:(1, 2, 3)");
			int choice2 = in.nextInt();
			
			if(choice2 == 1) {
				pc.addCase(inv.getCase(0));
			
			}
			if (choice2 == 2) {
				pc.addCase(inv.getCase(1));
			}
			if (choice2 == 3) {
				pc.addCase(inv.getCase(2));
			} 
			mainMenu();
		}
		else if(choice == 2) {
			System.out.println("");
			inv.printMotherBoards();
			
			System.out.println("Would you like the first, second, or third option:(1, 2, 3)");
			int choice2 = in.nextInt();
			
			if(choice2 == 1) {
				pc.addMotherBoard(inv.getMotherBoard(0));
			}
			if (choice2 == 2) {
				pc.addMotherBoard(inv.getMotherBoard(1));
			}
			if (choice2 == 3) {
				pc.addMotherBoard(inv.getMotherBoard(2));
			} 
			mainMenu();
		}
		else if(choice == 3) {
			System.out.println("");
			inv.printMonitors();
			System.out.println("Would you like the first, second, or third option:(1, 2, 3)");
			int choice2 = in.nextInt();
			
			if(choice2 == 1) {
				pc.addMonitor(inv.getMonitor(0));
			}
			if (choice2 == 2) {
				pc.addMonitor(inv.getMonitor(1));
			}
			if (choice2 == 3) {
				pc.addMonitor(inv.getMonitor(2));;
			} 
			mainMenu();
		}
		else if(choice == 4) {
			System.out.println("");
			inv.printProcessors();
			System.out.println("Would you like the first, second, or third option:(1, 2, 3)");
			int choice2 = in.nextInt();
			
			if(choice2 == 1) {
				pc.addProcessor(inv.getProcessor(0));
			}
			if (choice2 == 2) {
				pc.addProcessor(inv.getProcessor(1));
			}
			if (choice2 == 3) {
				pc.addProcessor(inv.getProcessor(2));
			} 
			mainMenu();
		}
		else if(choice == 5) {
			System.out.println("");
			inv.printVideoCards();
			System.out.println("Would you like the first, second, or third option:(1, 2, 3)");
			int choice2 = in.nextInt();
			
			if(choice2 == 1) {
				pc.addVideoCard(inv.getVideoCard(0));
			}
			if (choice2 == 2) {
				pc.addVideoCard(inv.getVideoCard(1));
			}
			if (choice2 == 3) {
				pc.addVideoCard(inv.getVideoCard(2));
			} 
			mainMenu();
		}
		else if(choice == 6) {
			System.out.println("");
			inv.printHardDrive();
			System.out.println("Would you like the first, second, or third option:(1, 2, 3)");
			int choice2 = in.nextInt();
			
			if(choice2 == 1) {
				pc.addHardDrive(inv.getHardDrive(0));
			}
			if (choice2 == 2) {
				pc.addHardDrive(inv.getHardDrive(1));
			}
			if (choice2 == 3) {
				pc.addHardDrive(inv.getHardDrive(2));;
			} 
			mainMenu();
		}
		else if(choice == 7) {
			System.out.println("");
			inv.printMemory();
			System.out.println("Would y1ou like the first, second, or third option:");
			int choice2 = in.nextInt();
			
			if(choice2 == 1) {
				pc.addMemory(inv.getMemory(0));
			}
			if (choice2 == 2) {
				pc.addMemory(inv.getMemory(1));
			}
			if (choice2 == 3) {
				pc.addMemory(inv.getMemory(2));
			} 
			mainMenu();
		}
		else if(choice == 8) {
			System.out.println("");
			System.out.println(pc.toString());
			//double sum = pc.computeTotalCost();
			//System.out.println("Total:........................................$"+ String.format("%.2f", sum));
			System.exit(0);
				
		}
		else if(choice == 9) {
			System.exit(0);
		}
		else {
			System.err.println("Invalid input. Try again.");
			mainMenu();
			displayParts();
		}
		
		}
		
	}
}

	
	
