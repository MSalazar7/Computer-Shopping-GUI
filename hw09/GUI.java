package hw09;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
* This is a class to model a PC object. It can store the tower, motherboard, processor, videoCard, hardDrive, memory, monitor
* 
* To create an instance of the Case class use the following:
* PC pc = new PC(); default case
* 
* @author Michael Salazar, 401146782, CS2012, Sections 01/02
* https://calstatela.instructuremedia.com/embed/1139343b-c7d5-474a-a23b-f62291113b5b
*/

public class GUI extends Application {

	@Override 
	public void start(Stage primaryStage) { 
		Inventory inv = new Inventory();
		inv.initializeInventory();
		
		Pane pane = new Pane();
		
		Text title = new Text(130, 310,"PC Builder"); 
		title.setFont(Font.font("Verdana", FontWeight.BOLD, 125));
		title.setFill(Color.BLACK);
		title.setStrokeWidth(2);
		
		Button exit = new Button("Exit");
		exit.setLayoutX(650);
		exit.setLayoutY(500);
		exit.setScaleX(3);
		exit.setScaleY(3);
		exit.setOnAction(e -> System.exit(0));
		
		pane.getChildren().addAll(begin(primaryStage),title, exit);
		Scene scene = new Scene(pane, 1000, 700); 
		pane.setBackground(null);
		
		scene.setFill(Color.WHITE);
		primaryStage.setScene(scene); 
		primaryStage.setResizable(false);
		primaryStage.show(); 
	} 
	
	public static void main(String[] args) { 
		Application.launch(); 
	} 
	
	/**
	 * This method returns a button that switches the pane and takes in the stage as the parameters
	 * 	
	 * @param stage The stage of the application
	 * @return The button that switches the pane to the processors pane.
	 */
	public Button begin(Stage stage) {
		PC pc = new PC(); 
		Inventory inv = new Inventory();
		inv.initializeInventory();
		Pane pane = new Pane();
		
		Image imagep1 = new Image("images/p1.jpg");
		ImageView ivp1 = new ImageView(imagep1);
		ivp1.setFitHeight(100);
		ivp1.setFitWidth(100);
		ivp1.setScaleX(2);
		ivp1.setScaleY(2);
		ivp1.setLayoutX(100);
		ivp1.setLayoutY(150);
		
		Label labelp1 = new Label(inv.getProcessor(0).toString());
		labelp1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp1.setTextFill(Color.BLACK);
		labelp1.setLayoutX(30);
		labelp1.setLayoutY(350);
		
		Button p1 = new Button("Add");
		p1.setScaleX(3);
		p1.setScaleY(3);
		p1.setLayoutX(130);
		p1.setLayoutY(500);
		p1.setOnAction(e-> pc.addProcessor(inv.getProcessor(0)));
		
		//
		
		Image imagep2 = new Image("images/p2.jpg");
		ImageView ivp2 = new ImageView(imagep2);
		ivp2.setFitHeight(100);
		ivp2.setFitWidth(100);
		ivp2.setScaleX(2);
		ivp2.setScaleY(2);
		ivp2.setLayoutX(430);
		ivp2.setLayoutY(150);
		
		Label labelp2 = new Label(inv.getProcessor(1).toString());
		labelp2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp2.setTextFill(Color.BLACK);
		labelp2.setLayoutX(370);
		labelp2.setLayoutY(350);
		
		Button p2 = new Button("Add");
		p2.setScaleX(3);
		p2.setScaleY(3);
		p2.setLayoutX(470);
		p2.setLayoutY(500);
		p2.setOnAction(e-> pc.addProcessor(inv.getProcessor(1)));
		
		//
		
		Image imagep3 = new Image("images/p3.jpg");
		ImageView ivp3 = new ImageView(imagep3);
		ivp3.setFitHeight(100);
		ivp3.setFitWidth(100);
		ivp3.setScaleX(2);
		ivp3.setScaleY(2);
		ivp3.setLayoutX(770);
		ivp3.setLayoutY(150);
		
		Label labelp3 = new Label(inv.getProcessor(2).toString());
		labelp3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp3.setTextFill(Color.BLACK);
		labelp3.setLayoutX(700);
		labelp3.setLayoutY(350);
		
		Button p3 = new Button("Add");
		p3.setScaleX(3);
		p3.setScaleY(3);
		p3.setLayoutX(800);
		p3.setLayoutY(500);
		p3.setOnAction(e-> pc.addProcessor(inv.getProcessor(2)));
		
	
		//
		
		Group processor1 = new Group();
		processor1.getChildren().addAll(ivp1, labelp1, p1);
		
		Group processor2 = new Group();
		processor2.getChildren().addAll(ivp2, labelp2, p2);
		
		Group processor3 = new Group();
		processor2.getChildren().addAll(ivp3, labelp3, p3);
		
		pane.getChildren().addAll(processor1, processor2, processor3, motherboard(pc,stage));
		pane.setBackground(null);
		
		Scene scene = new Scene(pane, 1000, 700); 
		scene.setFill(Color.WHITE);
		
		Button start = new Button("Start");
		start.setLayoutX(300);
		start.setLayoutY(500);
		start.setScaleX(3);
		start.setScaleY(3);
		start.setOnAction(e -> stage.setScene(scene));
		
		return start;
	}
	
	/**
	 * This method returns a button that switches the pane and takes in the stage as the parameters/
	 * 
	 * @param pc The pc that we are going to be setting values to in the pane.
	 * @param stage The stage we want to set the scene to.
	 * @return The button that switches pane to motherboard pane.
	 */
	public Button motherboard(PC pc, Stage stage) {
		Inventory inv = new Inventory();
		inv.initializeInventory();
		Pane pane = new Pane();
		
		Image imagep1 = new Image("images/mB1.jpg");
		ImageView ivp1 = new ImageView(imagep1);
		ivp1.setFitHeight(100);
		ivp1.setFitWidth(100);
		ivp1.setScaleX(2);
		ivp1.setScaleY(2);
		ivp1.setLayoutX(100);
		ivp1.setLayoutY(150);
		
		Label labelp1 = new Label(inv.getMotherBoard(0).toString());
		labelp1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp1.setTextFill(Color.BLACK);
		labelp1.setLayoutX(30);
		labelp1.setLayoutY(350);
		
		Button p1 = new Button("Add");
		p1.setScaleX(3);
		p1.setScaleY(3);
		p1.setLayoutX(130);
		p1.setLayoutY(500);
		p1.setOnAction(e-> pc.addMotherBoard(inv.getMotherBoard(0)));
		
		//
		
		Image imagep2 = new Image("images/mB2.jpg");
		ImageView ivp2 = new ImageView(imagep2);
		ivp2.setFitHeight(100);
		ivp2.setFitWidth(100);
		ivp2.setScaleX(2);
		ivp2.setScaleY(2);
		ivp2.setLayoutX(430);
		ivp2.setLayoutY(150);
		
		Label labelp2 = new Label(inv.getMotherBoard(1).toString());
		labelp2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp2.setTextFill(Color.BLACK);
		labelp2.setLayoutX(370);
		labelp2.setLayoutY(350);
		
		Button p2 = new Button("Add");
		p2.setScaleX(3);
		p2.setScaleY(3);
		p2.setLayoutX(470);
		p2.setLayoutY(500);
		p2.setOnAction(e-> pc.addMotherBoard(inv.getMotherBoard(1)));
		
		//
		
		Image imagep3 = new Image("images/mB3.jpg");
		ImageView ivp3 = new ImageView(imagep3);
		ivp3.setFitHeight(100);
		ivp3.setFitWidth(100);
		ivp3.setScaleX(2);
		ivp3.setScaleY(2);
		ivp3.setLayoutX(770);
		ivp3.setLayoutY(150);
		
		Label labelp3 = new Label(inv.getMotherBoard(2).toString());
		labelp3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp3.setTextFill(Color.BLACK);
		labelp3.setLayoutX(700);
		labelp3.setLayoutY(350);
		
		Button p3 = new Button("Add");
		p3.setScaleX(3);
		p3.setScaleY(3);
		p3.setLayoutX(800);
		p3.setLayoutY(500);
		p3.setOnAction(e-> pc.addMotherBoard(inv.getMotherBoard(2)));
		
		//
		
		Group motherBoard1 = new Group();
		motherBoard1.getChildren().addAll(ivp1, labelp1, p1);
		
		Group motherBoard2 = new Group();
		motherBoard2.getChildren().addAll(ivp2, labelp2, p2);
		
		Group motherBoard3 = new Group();
		motherBoard3.getChildren().addAll(ivp3, labelp3, p3);
		
		pane.getChildren().addAll(motherBoard1, motherBoard2, motherBoard3, videocard(pc, stage));
		pane.setBackground(null);
		
		Scene scene = new Scene(pane, 1000, 700); 
		scene.setFill(Color.WHITE);
		
		Button next = new Button("Next");
		next.setLayoutX(800);
		next.setLayoutY(630);
		next.setScaleX(2);
		next.setScaleY(2);
		next.setOnAction(e -> stage.setScene(scene));
		
		return next;
	}
	
	/**
	 * This method returns a button that switches to the video card pane.
	 * 
	 * @param pc The pc that we are going to be setting values to in the pane.
	 * @param stage The stage we want to set the scene to.
	 * @return The button that switches pane to video card pane.
	 */
	public Button videocard(PC pc, Stage stage) {
		Inventory inv = new Inventory();
		inv.initializeInventory();
		Pane pane = new Pane();
		
		Image imagep1 = new Image("images/v1.png");
		ImageView ivp1 = new ImageView(imagep1);
		ivp1.setFitHeight(100);
		ivp1.setFitWidth(100);
		ivp1.setScaleX(2);
		ivp1.setScaleY(1);
		ivp1.setLayoutX(100);
		ivp1.setLayoutY(150);
		
		Label labelp1 = new Label(inv.getVideoCard(0).toString());
		labelp1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp1.setTextFill(Color.BLACK);
		labelp1.setLayoutX(30);
		labelp1.setLayoutY(350);
		
		Button p1 = new Button("Add");
		p1.setScaleX(3);
		p1.setScaleY(3);
		p1.setLayoutX(130);
		p1.setLayoutY(500);
		p1.setOnAction(e-> pc.addVideoCard(inv.getVideoCard(0)));
		
		//
		
		Image imagep2 = new Image("images/v2.png");
		ImageView ivp2 = new ImageView(imagep2);
		ivp2.setFitHeight(100);
		ivp2.setFitWidth(100);
		ivp2.setScaleX(2);
		ivp2.setScaleY(1);
		ivp2.setLayoutX(430);
		ivp2.setLayoutY(150);
		
		Label labelp2 = new Label(inv.getVideoCard(1).toString());
		labelp2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp2.setTextFill(Color.BLACK);
		labelp2.setLayoutX(370);
		labelp2.setLayoutY(350);
		
		Button p2 = new Button("Add");
		p2.setScaleX(3);
		p2.setScaleY(3);
		p2.setLayoutX(470);
		p2.setLayoutY(500);
		p2.setOnAction(e-> pc.addVideoCard(inv.getVideoCard(1)));
		
		//
		
		Image imagep3 = new Image("images/v3.png");
		ImageView ivp3 = new ImageView(imagep3);
		ivp3.setFitHeight(100);
		ivp3.setFitWidth(100);
		ivp3.setScaleX(2);
		ivp3.setScaleY(1.5);
		ivp3.setLayoutX(770);
		ivp3.setLayoutY(150);
		
		Label labelp3 = new Label(inv.getVideoCard(2).toString());
		labelp3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp3.setTextFill(Color.BLACK);
		labelp3.setLayoutX(700);
		labelp3.setLayoutY(350);
		
		Button p3 = new Button("Add");
		p3.setScaleX(3);
		p3.setScaleY(3);
		p3.setLayoutX(800);
		p3.setLayoutY(500);
		p3.setOnAction(e-> pc.addVideoCard(inv.getVideoCard(2)));
		
		//
		
		Group videoCard1 = new Group();
		videoCard1.getChildren().addAll(ivp1, labelp1, p1);
		
		Group videoCard2 = new Group();
		videoCard2.getChildren().addAll(ivp2, labelp2, p2);
		
		Group videoCard3 = new Group();
		videoCard3.getChildren().addAll(ivp3, labelp3, p3);
		
		pane.getChildren().addAll(videoCard1, videoCard2, videoCard3, memory(pc, stage));
		pane.setBackground(null);
		
		Scene scene = new Scene(pane, 1000, 700); 
		scene.setFill(Color.WHITE);
		
		Button next = new Button("Next");
		next.setLayoutX(800);
		next.setLayoutY(630);
		next.setScaleX(2);
		next.setScaleY(2);
		next.setOnAction(e -> stage.setScene(scene));
		
		return next;
	}
	
	/**
	 * This method returns a button that switches pane to memory pane.
	 * 
	 * @param pc The pc that we are going to be setting values to in the pane.
	 * @param stage The stage we want to set the scene to.
	 * @return The button that switches pane to video card pane.
	 */
	public Button memory(PC pc, Stage stage) {
		Inventory inv = new Inventory();
		inv.initializeInventory();
		Pane pane = new Pane();
		
		Image imagep1 = new Image("images/mem1.jpg");
		ImageView ivp1 = new ImageView(imagep1);
		ivp1.setFitHeight(100);
		ivp1.setFitWidth(100);
		ivp1.setScaleX(2);
		ivp1.setScaleY(1);
		ivp1.setLayoutX(100);
		ivp1.setLayoutY(150);
		
		Label labelp1 = new Label(inv.getMemory(0).toString());
		labelp1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp1.setTextFill(Color.BLACK);
		labelp1.setLayoutX(30);
		labelp1.setLayoutY(350);
		
		Button p1 = new Button("Add");
		p1.setScaleX(3);
		p1.setScaleY(3);
		p1.setLayoutX(130);
		p1.setLayoutY(500);
		p1.setOnAction(e-> pc.addMemory(inv.getMemory(0)));
		
		//
		
		Image imagep2 = new Image("images/mem2.jpg");
		ImageView ivp2 = new ImageView(imagep2);
		ivp2.setFitHeight(100);
		ivp2.setFitWidth(100);
		ivp2.setScaleX(2);
		ivp2.setScaleY(1);
		ivp2.setLayoutX(430);
		ivp2.setLayoutY(150);
		
		Label labelp2 = new Label(inv.getMemory(1).toString());
		labelp2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp2.setTextFill(Color.BLACK);
		labelp2.setLayoutX(370);
		labelp2.setLayoutY(350);
		
		Button p2 = new Button("Add");
		p2.setScaleX(3);
		p2.setScaleY(3);
		p2.setLayoutX(470);
		p2.setLayoutY(500);
		p2.setOnAction(e-> pc.addMemory(inv.getMemory(1)));
		
		//
		
		Image imagep3 = new Image("images/mem3.jpg");
		ImageView ivp3 = new ImageView(imagep3);
		ivp3.setFitHeight(100);
		ivp3.setFitWidth(100);
		ivp3.setScaleX(2);
		ivp3.setScaleY(1.5);
		ivp3.setLayoutX(770);
		ivp3.setLayoutY(150);
		
		Label labelp3 = new Label(inv.getMemory(2).toString());
		labelp3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp3.setTextFill(Color.BLACK);
		labelp3.setLayoutX(700);
		labelp3.setLayoutY(350);
		
		Button p3 = new Button("Add");
		p3.setScaleX(3);
		p3.setScaleY(3);
		p3.setLayoutX(800);
		p3.setLayoutY(500);
		p3.setOnAction(v-> pc.addMemory(inv.getMemory(2)));
		
		//
		
		Group memory1 = new Group();
		memory1.getChildren().addAll(ivp1, labelp1, p1);
		
		Group memory2 = new Group();
		memory2.getChildren().addAll(ivp2, labelp2, p2);
		
		Group memory3 = new Group();
		memory3.getChildren().addAll(ivp3, labelp3, p3);
		
		pane.getChildren().addAll(memory1, memory2, memory3, hardDrive(pc,stage));
		pane.setBackground(null);
		
		Scene scene = new Scene(pane, 1000, 700); 
		scene.setFill(Color.WHITE);
		
		Button next = new Button("Next");
		next.setLayoutX(800);
		next.setLayoutY(630);
		next.setScaleX(2);
		next.setScaleY(2);
		next.setOnAction(e -> stage.setScene(scene));
		
		return next;
	}
	 /**
	  * This method returns a button that switches pane to hard drive pane.
	  * 
	  * @param pc The pc that we are going to be setting values to in the pane.
	  * @param stage The stage we want to set the scene to.
	  * @return The button that switches pane to video card pane.
	  */
	public Button hardDrive(PC pc, Stage stage) {
		Inventory inv = new Inventory();
		inv.initializeInventory();
		Pane pane = new Pane();
		
		Image imagep1 = new Image("images/h1.jpg");
		ImageView ivp1 = new ImageView(imagep1);
		ivp1.setFitHeight(100);
		ivp1.setFitWidth(100);
		ivp1.setScaleX(2);
		ivp1.setScaleY(1);
		ivp1.setLayoutX(100);
		ivp1.setLayoutY(150);
		
		Label labelp1 = new Label(inv.getHardDrive(0).toString());
		labelp1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp1.setTextFill(Color.BLACK);
		labelp1.setLayoutX(30);
		labelp1.setLayoutY(350);
		
		Button p1 = new Button("Add");
		p1.setScaleX(3);
		p1.setScaleY(3);
		p1.setLayoutX(130);
		p1.setLayoutY(500);
		p1.setOnAction(e-> pc.addHardDrive(inv.getHardDrive(0)));
		
		//
		
		Image imagep2 = new Image("images/h2.jpg");
		ImageView ivp2 = new ImageView(imagep2);
		ivp2.setFitHeight(100);
		ivp2.setFitWidth(100);
		ivp2.setScaleX(2);
		ivp2.setScaleY(1);
		ivp2.setLayoutX(430);
		ivp2.setLayoutY(150);
		
		Label labelp2 = new Label(inv.getHardDrive(1).toString());
		labelp2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp2.setTextFill(Color.BLACK);
		labelp2.setLayoutX(370);
		labelp2.setLayoutY(350);
		
		Button p2 = new Button("Add");
		p2.setScaleX(3);
		p2.setScaleY(3);
		p2.setLayoutX(470);
		p2.setLayoutY(500);
		p2.setOnAction(e-> pc.addHardDrive(inv.getHardDrive(1)));
		
		//
		
		Image imagep3 = new Image("images/mem3.jpg");
		ImageView ivp3 = new ImageView(imagep3);
		ivp3.setFitHeight(100);
		ivp3.setFitWidth(100);
		ivp3.setScaleX(2);
		ivp3.setScaleY(1.5);
		ivp3.setLayoutX(770);
		ivp3.setLayoutY(150);
		
		Label labelp3 = new Label(inv.getHardDrive(2).toString());
		labelp3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp3.setTextFill(Color.BLACK);
		labelp3.setLayoutX(700);
		labelp3.setLayoutY(350);
		
		Button p3 = new Button("Add");
		p3.setScaleX(3);
		p3.setScaleY(3);
		p3.setLayoutX(800);
		p3.setLayoutY(500);
		p3.setOnAction(e-> pc.addHardDrive(inv.getHardDrive(2)));
		
		//
		
		Group hardDrive1 = new Group();
		hardDrive1.getChildren().addAll(ivp1, labelp1, p1);
		
		Group hardDrive2 = new Group();
		hardDrive2.getChildren().addAll(ivp2, labelp2, p2);
		
		Group hardDrive3 = new Group();
		hardDrive3.getChildren().addAll(ivp3, labelp3, p3);
		
		pane.getChildren().addAll(hardDrive1, hardDrive2, hardDrive3, cases(pc,stage));
		pane.setBackground(null);
		
		Scene scene = new Scene(pane, 1000, 700); 
		scene.setFill(Color.WHITE);
		
		Button next = new Button("Next");
		next.setLayoutX(800);
		next.setLayoutY(630);
		next.setScaleX(2);
		next.setScaleY(2);
		next.setOnAction(e -> stage.setScene(scene));
		
		return next;
	}
	
	/**
	 * This method returns a button that switches pane to cases pane.
	 * 
	 * @param pc The pc that we are going to be setting values to in the pane.
	 * @param stage The stage we want to set the scene to.
	 * @return The button that switches pane to video card pane.
	 */
	public Button cases(PC pc, Stage stage) {
		Inventory inv = new Inventory();
		inv.initializeInventory();
		Pane pane = new Pane();
		
		Image imagep1 = new Image("images/c1.jpg");
		ImageView ivp1 = new ImageView(imagep1);
		ivp1.setFitHeight(100);
		ivp1.setFitWidth(100);
		ivp1.setScaleX(2);
		ivp1.setScaleY(1);
		ivp1.setLayoutX(100);
		ivp1.setLayoutY(150);
		
		Label labelp1 = new Label(inv.getCase(0).toString());
		labelp1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp1.setTextFill(Color.BLACK);
		labelp1.setLayoutX(30);
		labelp1.setLayoutY(350);
		
		Button p1 = new Button("Add");
		p1.setScaleX(3);
		p1.setScaleY(3);
		p1.setLayoutX(130);
		p1.setLayoutY(500);
		p1.setOnAction(e-> pc.addCase(inv.getCase(0)));
		
		//
		
		Image imagep2 = new Image("images/c2.jpg");
		ImageView ivp2 = new ImageView(imagep2);
		ivp2.setFitHeight(100);
		ivp2.setFitWidth(100);
		ivp2.setScaleX(2);
		ivp2.setScaleY(1);
		ivp2.setLayoutX(430);
		ivp2.setLayoutY(150);
		
		Label labelp2 = new Label(inv.getCase(1).toString());
		labelp2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp2.setTextFill(Color.BLACK);
		labelp2.setLayoutX(370);
		labelp2.setLayoutY(350);
		
		Button p2 = new Button("Add");
		p2.setScaleX(3);
		p2.setScaleY(3);
		p2.setLayoutX(470);
		p2.setLayoutY(500);
		p2.setOnAction(e-> pc.addCase(inv.getCase(1)));
		
		//
		
		Image imagep3 = new Image("images/c3.jpg");
		ImageView ivp3 = new ImageView(imagep3);
		ivp3.setFitHeight(100);
		ivp3.setFitWidth(100);
		ivp3.setScaleX(2);
		ivp3.setScaleY(1.5);
		ivp3.setLayoutX(770);
		ivp3.setLayoutY(150);
		
		Label labelp3 = new Label(inv.getCase(2).toString());
		labelp3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp3.setTextFill(Color.BLACK);
		labelp3.setLayoutX(700);
		labelp3.setLayoutY(350);
		
		Button p3 = new Button("Add");
		p3.setScaleX(3);
		p3.setScaleY(3);
		p3.setLayoutX(800);
		p3.setLayoutY(500);
		p3.setOnAction(e-> pc.addCase(inv.getCase(2)));
		
		//
		
		Group case1 = new Group();
		case1.getChildren().addAll(ivp1, labelp1, p1);
		
		Group case2 = new Group();
		case2.getChildren().addAll(ivp2, labelp2, p2);
		
		Group case3 = new Group();
		case3.getChildren().addAll(ivp3, labelp3, p3);
		
		pane.getChildren().addAll(case1, case2, case3, monitor(pc,stage));
		pane.setBackground(null);
		
		Scene scene = new Scene(pane, 1000, 700); 
		scene.setFill(Color.WHITE);
		
		Button next = new Button("Next");
		next.setLayoutX(800);
		next.setLayoutY(630);
		next.setScaleX(2);
		next.setScaleY(2);
		next.setOnAction(e -> stage.setScene(scene));
		
		return next;
	}
	
	/**
	 * This method returns a button that switches pane to monitor pane.
	 *  
	 * @param pc The pc that we are going to be setting values to in the pane.
	 * @param stage The stage we want to set the scene to.
	 * @return The button that switches pane to monitor pane.
	 */
	public Button monitor(PC pc, Stage stage) {
		Inventory inv = new Inventory();
		inv.initializeInventory();
		Pane pane = new Pane();
		
		Image imagep1 = new Image("images/m1.jpg");
		ImageView ivp1 = new ImageView(imagep1);
		ivp1.setFitHeight(100);
		ivp1.setFitWidth(100);
		ivp1.setScaleX(2);
		ivp1.setScaleY(1);
		ivp1.setLayoutX(100);
		ivp1.setLayoutY(150);
		
		Label labelp1 = new Label(inv.getMonitor(0).toString());
		labelp1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp1.setTextFill(Color.BLACK);
		labelp1.setLayoutX(30);
		labelp1.setLayoutY(350);
		
		Button p1 = new Button("Add");
		p1.setScaleX(3);
		p1.setScaleY(3);
		p1.setLayoutX(130);
		p1.setLayoutY(500);
		p1.setOnAction(e-> pc.addMonitor(inv.getMonitor(0)));
		
		//
		
		Image imagep2 = new Image("images/m2.jpg");
		ImageView ivp2 = new ImageView(imagep2);
		ivp2.setFitHeight(100);
		ivp2.setFitWidth(100);
		ivp2.setScaleX(2);
		ivp2.setScaleY(1);
		ivp2.setLayoutX(430);
		ivp2.setLayoutY(150);
		
		Label labelp2 = new Label(inv.getMonitor(1).toString());
		labelp2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp2.setTextFill(Color.BLACK);
		labelp2.setLayoutX(370);
		labelp2.setLayoutY(350);
		
		Button p2 = new Button("Add");
		p2.setScaleX(3);
		p2.setScaleY(3);
		p2.setLayoutX(470);
		p2.setLayoutY(500);
		p2.setOnAction(e-> pc.addMonitor(inv.getMonitor(1)));
		
		//
		
		Image imagep3 = new Image("images/m3.jpg");
		ImageView ivp3 = new ImageView(imagep3);
		ivp3.setFitHeight(100);
		ivp3.setFitWidth(100);
		ivp3.setScaleX(2);
		ivp3.setScaleY(1.5);
		ivp3.setLayoutX(770);
		ivp3.setLayoutY(150);
		
		Label labelp3 = new Label(inv.getMonitor(2).toString());
		labelp3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		labelp3.setTextFill(Color.BLACK);
		labelp3.setLayoutX(700);
		labelp3.setLayoutY(350);
		
		Button p3 = new Button("Add");
		p3.setScaleX(3);
		p3.setScaleY(3);
		p3.setLayoutX(800);
		p3.setLayoutY(500);
		p3.setOnAction(e-> pc.addMonitor(inv.getMonitor(2)));
		
		//
		
		Group monitor1 = new Group();
		monitor1.getChildren().addAll(ivp1, labelp1, p1);
		
		Group monitor2 = new Group();
		monitor2.getChildren().addAll(ivp2, labelp2, p2);
		
		Group monitor3 = new Group();
		monitor3.getChildren().addAll(ivp3, labelp3, p3);
		
		Label total = new Label();
		total.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		total.setLayoutX(370);
		total.setLayoutY(350);
		

		pane.getChildren().addAll(monitor1, monitor2, monitor3, checkout(pc, stage));
		pane.setBackground(null);
		
		Scene scene = new Scene(pane, 1000, 700); 
		scene.setFill(Color.WHITE);
		
		Button next = new Button("Next");
		next.setLayoutX(800);
		next.setLayoutY(630);
		next.setScaleX(2);
		next.setScaleY(2);
		next.setOnAction(e -> stage.setScene(scene));
		
		return next;
	}
	
	/**
	 * This method returns a button that switches pane to checkout pane.
	 * 
	 * @param pc The pc that we are going to be setting values to in the pane.
	 * @param stage The stage we want to set the scene to.
	 * @return The button that switches pane to checkout pane.
	 */
	public Button checkout(PC pc, Stage stage) {
		Pane pane = new Pane();
		
		Text receipt = new Text ("Reciept");
		receipt.setFont(Font.font("Verdana", FontWeight.BOLD, 40));
		receipt.setLayoutX(40);
		receipt.setLayoutY(50);
		receipt.setFill(Color.BLACK);
		
		Button total = new Button("Get Total");
		total.setScaleX(3);
		total.setScaleY(3);
		total.setLayoutX(550);
		total.setLayoutY(900);
		total.setOnAction(e-> pane.getChildren().addAll(new Text(250, 55,pc.toString()), new Text(250, 950,"Total:........................................$"+ String.format("%.2f", pc.computeTotalCost()))));
		
		pane.getChildren().addAll(receipt ,total);
		pane.setBackground(null);
		
		Scene scene2 = new Scene(pane, 700, 1000); 
		scene2.setFill(Color.WHITE);
		
		Button next = new Button("Next");
		next.setLayoutX(800);
		next.setLayoutY(630);
		next.setScaleX(2);
		next.setScaleY(2);
		next.setOnAction(e -> stage.setScene(scene2));
		
		return next;
	}
} 

