package hw09;

/**
 * This is a class to model a Monitor object. It can store the name, brand, part number, price, screenSize, and resolution
 * 
 * To create an instance of the Monitor class use the following:
 * Monitor m1 = new Monitor(); default case
 * Monitor m2 = new Monitor(String name, String brand, String partNumber, double price, String screenSize, String resolution)
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */
public class Monitor extends PCPart {
	/** This value holds the screenSize of the monitor.*/
	private String screenSize;
	/** This value holds the resolution of the monitor.*/
	private String resolution;
	
	/**
	 * Initializes a Monitor object using the parameter values
	 * 
	 * @param name A String to store the name of the monitor.
	 * @param brand A String to store the brand of the monitor.
	 * @param partNumber A String to store the partNumber to the monitor.
	 * @param price A double value to store the price of the monitor.
	 * @param screenSize A String to store the screenSize of the monitor.
	 * @param resolution A String to store the resolution of the monitor.
	 */
	public Monitor(String name, String brand, String partNumber, double price, String screenSize, String resolution) {
		super(name, brand, partNumber, price);
		this.screenSize = screenSize;
		this.resolution = resolution;
	}
	
	/**
	 * This method returns the datafield screenSize.
	 * 
	 * @return The screenSize of the Monitor as a String.
	 */
	public String getScreenSize() {
		return this.screenSize;
	}
	
	/**
	 * This method returns the datafield resolution.
	 * 
	 * @return The resolution of the Monitor as a String
	 */
	public String getResolution() {
		return this.resolution;
		
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
		
		result += "Screen Size:\t" + this.screenSize + "\n";
		result += "Resolution:\t" + this.resolution + "\n";
		result += "Price:........................................" + "$" + super.getPrice() + "\n";
		
		return result;
	}
}
