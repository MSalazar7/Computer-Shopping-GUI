package hw09;

/**
 * This is a class to model a Case object. It can store the name, brand, part number, price, type, and color
 * 
 * To create an instance of the Case class use the following:
 * Case c1 = new Case(); default case
 * Case c2 = new Case(String name, String brand, String partNumber, double price, String type, String color)
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */

public class Case extends PCPart{
	/** This value holds the type of the case.*/
	private String type;
	/** This value holds the color of the case.*/
	private String color;
	
	/**
	 * Initializes a Case object using the given parameter values.
	 * 
	 * @param name A String to store the name of the case.
	 * @param brand	A String to store the brand of the case.
	 * @param partNumber A String to store the partNumber of the case.
	 * @param price A double value to store the price of the case.
	 * @param type A String to store the type of the case.
	 * @param color A String to store the color of the case.
	 */
	public Case(String name, String brand, String partNumber, double price, String type, String color) {
		super(name, brand, partNumber, price);
		this.type = type;
		this.color = color;
	}
	
	/**
	 * This method returns the datafield type.
	 * 
	 * @return The type of the Case as a String.
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * This method returns the datafield color.
	 * 
	 * @return The color of the Case as a String.
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * This method creates a string representation of this class by displaying 
	 * the chosen data fields.
	 * 
	 * @return The String representing this object.
	 */
	@Override
	public String toString() {
		String result = super.toString();
		
		result += "Type:\t\t" + this.type + "\n";
		result += "Color:\t\t" + this.color + "\n";
		result += "Price:........................................" + "$" + super.getPrice() + "\n";

		return result;
				
	}
}
