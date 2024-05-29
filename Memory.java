package hw09;

/**
 * This is a class to model a Memory object. It can store the name, brand, part number, price, formFactor, and modules
 * 
 * To create an instance of the Memory class use the following:
 * Memory mem1 = new Memory(); default case
 * Memory mem2 = new Memory(String name, String brand, String partNumber, double price, String formFactor, String modules)
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */
public class Memory extends PCPart{
	/** This value holds the formFactor of the memory.*/
	private String formFactor;
	/** This value holds the modules of the memory.*/
	private String modules; 

	/**
	 * Initializes a Memory object using the given parameter values.
	 * 
	 * @param name A String to to store the name of the memory.
	 * @param brand A String to store the brand of the memory.
	 * @param partNumber A String to store the partNumber of the memory.
	 * @param price A double value to store the price of the memory.
	 * @param formFactor A String to store the formFactor of the memory.
	 * @param modules A String to store the modules of the memory.
	 */
	public Memory(String name, String brand, String partNumber, double price, String formFactor, String modules) {
		super(name, brand, partNumber, price);
		this.formFactor = formFactor;
		this.modules = modules;
	}
	
	/**
	 * This method returns the datafield formFactor.
	 * 
	 * @return The formFactor of the Memory as a String.
	 */
	public String getFormFactor() {
		return this.formFactor;
	}
	
	/**
	 * This method returns the datafield modules.
	 * 
	 * @return The modules of the Memory as a String.
	 */
	public String getModules() {
		return this.modules;
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
		
		result += "Form Factor:\t" + this.formFactor + "\n";
		result += "Modules:\t" + this.modules + "\n";
		result += "Price:........................................" + "$" + super.getPrice() + "\n";
		
		return result;
	}
	
}
