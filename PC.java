package hw09;

/**
 * This is a class to model a PC object. It can store the tower, motherboard, processor, videoCard, hardDrive, memory, monitor
 * 
 * To create an instance of the PC class use the following:
 * PC pc = new PC(); default case
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */
public class PC {
	/** This value holds the tower of the pc.*/
	private Case tower;
	/** This value holds the motherboard of the pc.*/
	private MotherBoard motherBoard;
	/** This value holds the processor of the pc.*/
	private Processor processor;
	/** This value holds the videoCard of the pc.*/
	private VideoCard videoCard;
	/** This value holds the hardDrive of the pc.*/
	private HardDrive hardDrive;
	/** This value holds the memory of the pc.*/
	private Memory memory; 
	/** This value holds the monitor of the pc.*/
	private Monitor monitor;
	
	/** This constructor creates a pc using the default values.*/
	public PC() {
		this.tower = null;
		this.motherBoard = null;
		this.processor = null;
		this.videoCard = null;
		this.hardDrive = null;
		this.memory = null;
		this.monitor = null;
	}
	
	/**
	 * This method returns the datafield tower.
	 * 
	 * @return The tower of the PC as a Case.
	 */
	public Case getCase() {
		return this.tower;
	}
	
	/**
	 * This method returns the datafield motherboard.
	 * 
	 * @return The motherboard of the PC as a MotherBoard.
	 */
	public MotherBoard getMotherBoard() {
		return this.motherBoard;
	}
	
	/**
	 * This method returns the datafield processor.
	 * 
	 * @return The processor of the PC as a Processor.
	 */
	public Processor getProcessor() {
		return this.processor;
	}
	
	/**
	 * This method returns the datafield videoCard.
	 * 
	 * @return The videoCard of the PC as a VideoCard.
	 */
	public VideoCard getVideoCard() {
		return this.videoCard;
	}
	
	/**
	 * This method returns the datafield hardDrive.
	 * 
	 * @return The hardDrive of the PC as a HardDrive.
	 */
	public HardDrive getHardDrive() {
		return this.hardDrive;
	}
	
	/**
	 * This method returns the datafield memory.
	 * 
	 * @return The memory of the PC as a Memory.
	 */
	public Memory getMemory() {
		return this.memory;
	}
	
	/**
	 * This method returns the datafield monitor.
	 * 
	 * @return The monitor of the PC as a Monitor.
	 */
	public Monitor getMonitor() {
		return this.monitor;
	}
	
	/**
	 * Takes a new value for the tower and updates the pc's tower to the new value.
	 * 
	 * @param tower The new tower of the pc, to replace the old value.
	 */
	public void addCase(Case tower) {
		this.tower = tower;

	}
	
	/**
	 * Takes a new value for the motherBoard and updates the pc's motherBoard to the new value.
	 * 
	 * @param motherBoard The new motherBoard of the pc, to replace the old value.
	 */
	public void addMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
		
	}
	
	/**
	 * Takes a new value for the processor and updates the pc's processor to the new value.
	 * 
	 * @param processor The new processor of the pc, to replace the old value.
	 */
	public void addProcessor(Processor processor) {
		this.processor = processor;
	}
	
	/**
	 * Takes a new value for the videoCard and updates the pc's videoCard to the new value.
	 * 
	 * @param videoCard The new videoCard of the pc, to replace the old value.
	 */
	public void addVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}
	
	/**
	 * Takes a new value for the hardDrive and updates the pc's hardDrive to the new value.
	 *  
	 * @param hardDrive The new hardDrive of the pc, to replace the old value.
	 */
	public void addHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
		
	}
	
	/**
	 * Takes a new value for the memory and updates the pc's memory to the new value.
	 * 
	 * @param memory The new memory of the pc, to replace the old value.
	 */
	public void addMemory(Memory memory) {
		this.memory = memory;
		
	}
	
	/**
	 * Takes a new value for the monitor and updates the pc's monitor to the new value.
	 * 
	 * @param monitor The new monitor of the pc, to replace the old value.
	 */
	public void addMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	/**
	 * This method adds up the price of all pc parts.
	 * 
	 * @return The sum of the pc's part prices.
	 */
	public double computeTotalCost() {
		double sum;
		sum = tower.getPrice() + motherBoard.getPrice() + processor.getPrice() + videoCard.getPrice() 
			 + hardDrive.getPrice() + memory.getPrice() + monitor.getPrice();
		return sum;
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
		
		result += "Case:\n" +  this.tower  + "\n";
		result += "Motherboard:\n" + this.motherBoard + "\n";
		result += "Processor:\n" + this.processor + "\n";
		result += "Videocard:\n" + this.videoCard + "\n";
		result += "Hard Drive:\n" + this.hardDrive + "\n";
		result += "Memory:\n" + this.memory + "\n";
		result += "Monitor:\n" + this.monitor + "\n";
		
		return result;
	}
}


