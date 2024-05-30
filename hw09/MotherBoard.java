package hw09;

/**
 * This is a class to model a Motherboard object. It can store the name, brand, part number, price, socket, and form factor
 * 
 * To create an instance of the Motherboard class use the following:
 * MotherBoard mB1 = new MotherBoard(); default case
 * MotherBoard mB2 = new MotherBoard(String name, String brand, String partNumber, double price, String socket, String formFactor)
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */

public class MotherBoard extends PCPart {
	/**  This value holds the socket of the motherboard.*/
	private String socket;
	/**  This value holds the form factor of the motherboard.*/
	private String formFactor;
	
	/**
	 * Initializes a MotherBoard object using the given parameter values.
	 * 
	 * @param name A String to store the name of the motherboard.
	 * @param brand A String to store the brand of the motherboard.
	 * @param partNumber A String to store the part number of the motherboard.
	 * @param price A double value to store the price of the motherboard.
	 * @param socket A String to store the socket of the motherboard.
	 * @param formFactor A String to store the form factor of the motherboard.
	 */
	public MotherBoard (String name, String brand, String partNumber, double price, String socket, String formFactor) {
		super(name, brand, partNumber, price);
		this.socket = socket;
		this.formFactor = formFactor;
	}
	
	/**
	 * This method returns the datafield socket.
	 * 
	 * @return The socket of the MotherBoard as a String.
	 */
	public String getSocket() {
		return this.socket;
	}
	
	/**
	 * This method returns the datafield formFactor.
	 * 
	 * @return The formFactor of the MotherBoard as a String.
	 */
	public String getFormFactor() {
		return this.formFactor;
	}
	
	/**
	 * This method creates a string representation of this class by displaying 
	 * the chosen data fields.
	 * 
	 * @return The String representing this object
	 */
	
	@Override
	public String toString() {
		String result = super.toString();
		
		result += "Socket:\t\t" + this.socket + "\n";
		result += "Form Factor:\t" + this.formFactor + "\n";
		result += "Price:........................................" + "$" + super.getPrice() + "\n";
		
		return result;
	}
}
