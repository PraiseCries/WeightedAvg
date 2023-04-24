package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	 public void start(Stage primaryStage) {

		 GridPane pane = new GridPane();

		 pane.setPadding(new Insets(15, 16, 17, 18));

		 pane.setHgap(20.5);

		 pane.setVgap(5.5);

		 
		 Label l1 = new Label("Test one:");
		 Label l2 = new Label("Test two:");
		 Label l3 = new Label("Test three:");
		 Label l4 = new Label("Test four");
		 Label l5 = new Label("Averages Scores:");
		 Label t1 = new Label("Score");
		 Label t2 = new Label("Weight");

		 TextField n1 = new TextField();
		 TextField n2 = new TextField();
		 TextField n3 = new TextField();
		 TextField n4 = new TextField();
		 
		 TextField w1 = new TextField();
		 TextField w2 = new TextField();
		 TextField w3 = new TextField();
		 TextField w4 = new TextField();

		 TextField nResult = new TextField();
		 TextField wResult = new TextField();


		 pane.add(t1, 1, 0);
		 pane.add(t2, 2, 0);
		 
		 pane.add(l1, 0, 1);
		 pane.add(n1, 1, 1);
		 pane.add(w1, 2, 1);
		 
		 pane.add(l2, 0, 2);
		 pane.add(n2, 1, 2);
		 pane.add(w2, 2, 2);
		 
		 pane.add(l3, 0, 3);
		 pane.add(n3, 1, 3);
		 pane.add(w3, 2, 3);
		 
		 pane.add(l4, 0, 4);
		 pane.add(n4, 1, 4);
		 pane.add(w4, 2, 4);
		 
		 pane.add(l5, 0, 5);
		 pane.add(nResult, 1, 5);
		 pane.add(wResult, 2, 5);

		 
		 Button calc = new Button("Calculate");
		 Button exit = new Button("Exit");

		 pane.add(calc, 1, 6);
		 pane.add(exit, 2, 6);

		 //GridPane.setHalignment(calc, HPos.RIGHT);

		 	
		 nResult.setEditable(false);
		 wResult.setEditable(false);
		 
		 calc.setPrefWidth(175);
		 exit.setPrefWidth(175);


		 calc.setOnAction(e -> {
			 double num1 = Double.parseDouble(n1.getText());
			 double num2 = Double.parseDouble(n2.getText());
			 double num3 = Double.parseDouble(n3.getText());
			 double num4 = Double.parseDouble(n4.getText());
			 
			 double weight1 = Double.parseDouble(w1.getText());
			 double weight2 = Double.parseDouble(w2.getText());
			 double weight3 = Double.parseDouble(w3.getText());
			 double weight4 = Double.parseDouble(w4.getText());
			 
			 wResult.setText(String.valueOf(((num1 * weight1) + (num2 * weight2) + (num3 * weight3) + (num4 * weight4))/(weight1 + weight2 + weight3 + weight4)));
			 
			 nResult.setText(String.valueOf((num1 + num2 + num3 + num4)/4));
		 });

		 exit.setOnAction(e -> {
			 System.exit(0);
		 });


		 Scene scene = new Scene(pane);
		 primaryStage.setTitle("Weighted Average");
		 primaryStage.setScene(scene);
		 primaryStage.show();
	 }

	 

	 public static void main(String[] args) {

	  	Application.launch(args);

	 }	 

 }

// Ahmad Z. S. Badwan		U18102159