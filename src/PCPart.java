package src;

/**
 * This is a class to model a PCPart object. It can store the name, brand, part number, and price
 *
 * To create an instance of the PCPart class use the following:
 * PCPart pcPart1 = new PCPart(); default case
 * PCPart pcPart2 = new PCPart(String name, String brand, String partNumber, double price)
 *
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */
public class PCPart {
	/** This value holds the name of the PCPart.*/
	private String name;
	/** This value holds the brand of the PCPart.*/
	private String brand;
	/** This value holds the partNumber of the PCPart.*/
	private String partNumber;
	/** This value holds the price of the PCPart.*/
	private double price;

	/**
	 * Initializes a PCPart object using the given parameter values.
	 *
	 * @param name A String to store the name of the pc part.
	 * @param brand A String to store the name of the pc part.
	 * @param partNumber A String to store the name of the pc part.
	 * @param price A double value to store the price of the pc part.
	 */
	public PCPart(String name, String brand, String partNumber, double price) {
		this.name = name;
		this.brand = brand;
		this.partNumber = partNumber;
		this.price = price;
	}

	/**
	 * This method returns the datafield name.
	 *
	 * @return The name of the pc part.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * This method returns the datafield brand.
	 *
	 * @return The brand of the pc part.
	 */
	public String getBrand() {
		return this.brand;
	}

	/**
	 * This method returns the datafield partNumber.
	 *
	 * @return The partNumber of the pc part.
	 */
	public String getPartNumber() {
		return this.partNumber;
	}

	/**
	 * This method returns the datafield price.
	 *
	 * @return The price of the pc part.
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * This method creates a string representation of this class by displaying
	 * the chosen data fields.
	 *
	 * @return The String representing this object.
	 */
	@Override
	public String toString() {
		String result = "";

		result += "Name:\t\t" + this.name + "\n";
		result += "Brand:\t\t" + this.brand + "\n";
		result += "Part #:\t\t" + this.partNumber + "\n";

		return result;

	}
}
