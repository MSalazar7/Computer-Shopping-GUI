package hw09;

/**
 * This is a class to model a Processor object. It can store the name, brand, part number, price, coreClock, and coreCount
 * 
 * To create an instance of the Processor class use the following:
 * Processor p1 = new Processor(); default case
 * Processor p2 = new Processor(String name, String brand, String partNumber, double price, String coreClock, int coreCount)
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */
public class Processor extends PCPart {
	/** This value holds the coreClock of the processor.*/
	private String coreClock;
	/** This value holds the coreCount of the processor.*/
	private int coreCount;
	
	/**
	 * Initializes a Processor object using the given parameter values.
	 * 
	 * @param name A String to store the name of the processor.
	 * @param brand A String to store the name of the processor.
	 * @param partNumber A String to store the partNumber of the processor.
	 * @param price A double value to store the price of the processor.
	 * @param coreClock A String to store the coreClock of the processor. 
	 * @param coreCount A int value to store the coreCount of the processor.
	 */
	public Processor(String name, String brand, String partNumber, double price, String coreClock, int coreCount) {
		super(name, brand, partNumber, price);	
		this.coreClock = coreClock;
		this.coreCount = coreCount;
	}
	
	/**
	 * This method returns the datafield coreClock.
	 *  
	 * @return The coreClock of the Processor as a String.
	 */
	
	public String getCoreClock() {
		return this.coreClock;
	}
	
	/**
	 * This method returns the datafield coreCount.
	 * 
	 * @return The coreCount of the Processor as a String.
	 */
	public int getCoreCount() {
		return this.coreCount;
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
		
		result += "Core Clock:\t" + this.coreClock + "\n";
		result += "Core Count:\t" + this.coreCount + "\n";
		result += "Price:........................................" + "$" + super.getPrice() + "\n";
		
		return result;
	}
}
