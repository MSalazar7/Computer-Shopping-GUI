package src;

/**
 * This is a class to model a VideoCard object. It can store the name, brand, part number, price, memory, and core clock
 *
 * To create an instance of the Case class use the following:
 * VideoCard v1 = new VideoCard(); default case
 * VideoCard v2 = new VideoCard(String name, String brand, String partNumber, double price, String memory, String coreClock)
 *
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */


public class VideoCard extends PCPart{
	/** This value holds the memory of the video card.*/
	private String memory;
	/** This value holds the core clock of the video card.*/
	private String coreClock;

	/**
	 * Initializes a VideoCard object using the given parameter values.
	 *
	 * @param name A String to store the name of the video card.
	 * @param brand A String to store the brand of the video card.
	 * @param partNumber A String to store the partNumber of the video card.
	 * @param price A double value to store the price of the video card.
	 * @param memory A String to store the memory of the video card.
	 * @param coreClock A String to the core clock of the video card.
	 */
	public VideoCard(String name, String brand, String partNumber, double price, String memory, String coreClock) {
		super(name, brand, partNumber, price);
		this.memory = memory;
		this.coreClock = coreClock;

	}
	/**
	 * This method returns the datafield memory.
	 *
	 * @return The memory of the VideoCard as a String.
	 */
	public String getMemory() {
		return this.memory;
	}

	/**
	 * This method returns the datafield coreClock.
	 *
	 * @return The coreClock of the VideoCard as a String.
	 */
	public String getcoreClock() {
		return this.coreClock;
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

		result += "Memory:\t\t" + this.memory + "\n";
		result += "Core Clock:\t" + this.coreClock + "\n";
		result += "Price:........................................" + "$" + super.getPrice() + "\n";

		return result;
	}

}
