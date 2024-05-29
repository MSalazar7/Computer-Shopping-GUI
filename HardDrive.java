package hw09;

/**
 * This is a class to model a HardDrive object. It can store the name, brand, part number, price, type, and capacity
 * 
 * To create an instance of the HardDrive class use the following:
 * HardDrive h1 = new HardDrive(); default case
 * HardDrive h2 = new HardDrive(String name, String brand, String partNumber, double price, String type, String capacity)
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */
public class HardDrive extends PCPart {
	/** This value holds the type of the hard drive.*/
	private String type;
	/** This value holds the capacity of the hard drive.*/
	private String capacity;
	
	/**
	 * Initializes a HardDrive object using the given parameter values.
	 * 
	 * @param name A String to store the name of the hard drive.
	 * @param brand A String to store the brand of the hard drive.
	 * @param partNumber A String to store the partNumber of the hard drive.
	 * @param price A double value to store the price of the hard drive.
	 * @param type A String to store the type of the hard drive.
	 * @param capacity A String to store the capacity of the hard drive.
	 */
	public HardDrive(String name, String brand, String partNumber, double price, String type, String capacity) {
		super(name, brand, partNumber, price);
		this.type = type;
		this.capacity = capacity;
		
	}
	
	/**
	 * This method returns the datafield type.
	 * 
	 * @return The type of the HardDrive as a String.
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * This method returns the datafield capacity.
	 * 
	 * @return The capacity of the HardDrive as a String.
	 */
	public String getCapacity() {
		return this.capacity;
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
		result += "Capacity:\t" + this.capacity + "\n";
		result += "Price:........................................" + "$" + super.getPrice() + "\n";
		
		return result;
	}
}
