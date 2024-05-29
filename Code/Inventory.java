package hw09;



import java.util.ArrayList;

/**
 * This is a class to model a Inventory object. It can store PCParts in an ArrayList.
 * 
 * To create an instance of the Inventory class use the following:
 * Inventory inv1 = new Inventory(); default case
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/4cb38ca2-b850-41fe-9336-206403ca80f2
 */

public class Inventory {
	/** This ArrayList holds the cases.*/
	private ArrayList<Case> cases = new ArrayList<>();
	/** This ArrayList holds the motherboards.*/
	private ArrayList<MotherBoard> motherBoards = new ArrayList<>();
	/** This ArrayList holds the processors.*/
	private ArrayList<Processor> processors = new ArrayList<>();
	/** This ArrayList holds the memory.*/
	private ArrayList<Memory> memory = new ArrayList<>();
	/** This ArrayList holds the hard drives.*/
	private ArrayList<HardDrive> hardDrives = new ArrayList<>();
	/** This ArrayList holds the monitors.*/
	private ArrayList<Monitor> monitors = new ArrayList<>();
	/** This ArrayList holds the video cards.*/
	private ArrayList<VideoCard> videoCards = new ArrayList<>();
	
	/** This constructor creates a inventory instance*/
	public Inventory() {
		
	}
	
	/**
	 * This method initializes the data for the PCParts and places them into the proper ArrayList.
	 * 
	 */
	public void initializeInventory() {
		Case c1 = new Case("Cooler Master MasterBox", "Cooler Master", "MCB-Q300L-KANN-S00", 44.99, "Micro ATX Mini Tower", "Black");
		Case c2 = new Case("In Win D-Frame 2.0", "In Win", "D-Frame 2.0 BK/GO", 1199.00, "ATX Full Tower", "Black/Gold");
		Case c3 = new Case("Corsair iCUE 4000X RGB", "Corsair", "CC-9011205-WW", 130.99, "ATX Mid Tower", "White");
		
		MotherBoard mB1 = new MotherBoard("Asus TUF GAMING X570-PLUS", "ASUS", "90MB1170-MVAAY0", 188.99, "AM4", "ATX");
		MotherBoard mB2 = new MotherBoard("Gigabyte Z390 AORUS PRO", "Gigabyte", "GA-Z390-AORUS-PRO-WIFI", 189.99, "LGA1151", "ATX");
		MotherBoard mB3 = new MotherBoard("MSI B450M PRO-M2 MAX", "MSI", "7B84-017R", 78.98, "AM4", "Micro ATX");
		
		Processor p1 = new Processor("Intel Core i9-9900K", "Intel", "BX80684I99900K", 399.99, "3.6 GHz", 8);
		Processor p2 = new Processor("AMD Ryzen 9 3950X", "AMD", "100-100000051WOF", 719.99, "3.5 GHz", 16);
		Processor p3 = new Processor("Intel Core i7-5960X", "Intel", "BX80648I75960X", 799.99, "3 GHz", 8);
		
		VideoCard v1 = new VideoCard("GeForce RTX 3090", "NVIDIA", "900-1G136-2510-000", 1499.99, "24 GB", "1395 MHz");
		VideoCard v2 = new VideoCard("Titan V", "NVIDIA", "900-1G500-2500-000", 2756.99, "12GB", "1200 MHz");
		VideoCard v3 = new VideoCard("Radeon RX 5700 XT", "Radeon", "RX 5700 XT 8G", 449.99, "8 GB", "1605 MHz");
		
		HardDrive h1 = new HardDrive("Samsung 970 Evo 1 TB", "Samsung", "MZ-V7E1T0BW", 168.28, "SSD", "1 TB");
		HardDrive h2 = new HardDrive("Seagate BarraCuda", "Seagate", "ST1000DM010", 49.99, "7200RPM", "1 TB");
		HardDrive h3 = new HardDrive("Western Digital Blue 2 TB", "Western Digital","WD20EZAZ", 49.99, "5400RPM", "2 TB");
		
		Memory mem1 = new Memory("Corsair Vengeance RGB", "Corsair", "CMW32GX4M2C3200C16", 131.99, "288-pin DIMM", "2 x 16GB");
		Memory mem2 = new Memory("Crucial Ballistix 16 GB", "Crucial", "BL2K8G32C16U4B", 59.99, "288-pin DIMM", "2 x 8GB");
		Memory mem3 = new Memory("Samsung 8 GB", "Samsung", "MV-3V4G3D/US", 306.36, "240-pin DIMM", "2 x4GB");
		
		Monitor m1 = new Monitor("Samsung U28E590D", "Samsung", "U28E590D", 357.68, "28\"", "3840 x 2160");
		Monitor m2 = new Monitor("Razer RAPTOR 27", "Razer", "RZ39-02760100-R3U1", 699.99, "27\"", "2560 x 1440");
		Monitor m3 = new Monitor("Samsung C49RG9", "Samsung", "LC49RG90SSNXZA", 1199.99, "49\"", "5120 x 1440 ");
				
		cases.add(c1);
		cases.add(c2);
		cases.add(c3);
		
		motherBoards.add(mB1);
		motherBoards.add(mB2);
		motherBoards.add(mB3);
		
		processors.add(p1);
		processors.add(p2);
		processors.add(p3);
		
		videoCards.add(v1);
		videoCards.add(v2);
		videoCards.add(v3);
		
		hardDrives.add(h1);
		hardDrives.add(h2);
		hardDrives.add(h3);
		
		memory.add(mem1);
		memory.add(mem2);
		memory.add(mem3);
		
		monitors.add(m1);
		monitors.add(m2);
		monitors.add(m3);
		
	}
	
	/**
	 * This method returns the case at the given index.
	 * 
	 * @param index The index of the ArrayList.
	 * @return The case at the given index value.
	 */
	public Case getCase(int index) {
		return cases.get(index);
	}
	
	/**
	 * This method returns the motherBoard at the given index.
	 * 
	 * @param index The index of the ArrayList.
	 * @return The motherBoard at the given index value.
	 */
	public MotherBoard getMotherBoard(int index) {
		return motherBoards.get(index);
	}
	
	/**
	 * This method returns the processor at the given index.
	 * 
	 * @param index The index of the ArrayList.
	 * @return The processor at the given index value.
	 */
	public Processor getProcessor(int index) {
		return processors.get(index);
	}
	
	/**
	 * This method returns the memory at the given index.
	 * 
	 * @param index The index of the ArrayList.
	 * @return The memory at the given index value.
	 */
	public Memory getMemory(int index) {
		return memory.get(index);
	}
	
	/**
	 * This method returns the hardDrive at the given index.
	 * 
	 * @param index The index of the ArrayList.
	 * @return The hardDrive at the given index value.
	 */
	public HardDrive getHardDrive(int index) {
		return hardDrives.get(index);
	}
	
	/**
	 * This method returns the monitor at the given index.
	 * 
	 * @param index The index of the ArrayList.
	 * @return The monitor at the given index value.
	 */
	public Monitor getMonitor(int index) {
		return monitors.get(index);
	}
	
	/**
	 * This method returns the videoCard at the given index.
	 * 
	 * @param index The index of the ArrayList.
	 * @return The videoCard at the given index value.
	 */
	public VideoCard getVideoCard(int index) {
		return videoCards.get(index);
	}
	
	/**
	 * This method prints out the cases ArrayList.
	 */
	public void printCases() {
		System.out.println(cases.toString().replace("[", "").replace("]", "").replace(", ", ""));
	
	}
	
	/**
	 * This method prints out the motherBoard ArrayList.
	 */
	public void printMotherBoards() {
		System.out.println(motherBoards.toString().replace("[","").replace("]","").replace(", ",""));
	}
	
	/**
	 * This method prints out the processor ArrayList.
	 */
	public void printProcessors() {
		System.out.println(processors.toString().replace("[", "").replace("]", "").replace(", ",""));
	}
	
	/**
	 * This method prints out the memory ArrayList.
	 */
	public void printMemory() {
		System.out.println(memory.toString().replace("[","").replace("]","").replace(", ",""));
	}
	
	/**
	 * This method prints out the hardDrive ArrayList.
	 */
	public void printHardDrive() {
		System.out.println(hardDrives.toString().replace("[","").replace("]","").replace(", ",""));
	}
	
	/**
	 * This method prints out the monitor ArrayList.
	 */
	public void printMonitors() {
		System.out.println(monitors.toString().replace("[", "").replace("]", "").replace(", ", ""));
	}
	
	/**
	 * This method prints out the videoCard ArrayList.
	 */
	public void printVideoCards() {
		System.out.println(videoCards.toString().replace("[", "").replace("]", "").replace(", ", ""));
	}
}
