package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ej01 extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root = new BorderPane();

			Button boton = new Button("Enviar");
			Text titulo = new Text("FORMULARIO:");



			BorderPane.setAlignment(boton, Pos.CENTER);
			BorderPane.setAlignment(titulo, Pos.CENTER);
			BorderPane.setMargin(boton, new Insets(50,120,50,60));
			BorderPane.setMargin(titulo, new Insets(50,60,50,120));

			//Creamos un Grid
			GridPane grid = new GridPane();


			Text texto1 = new Text("Nombre");
			TextField nombre = new TextField();
			Text texto2 = new Text("Apellidos");
			TextField apellido = new TextField();
			Text texto3 = new Text("Direcci?n");
			TextField direccion = new TextField();


			grid.setAlignment(Pos.CENTER);
			grid.setHgap(8);
			grid.setVgap(8);


			//Primera Fila
			grid.add(texto1,0,0);
			grid.add(nombre,1,0);


			//Segunda Fila
			grid.add(texto2, 0, 1);
			grid.add(apellido, 1,1);

			//Tercera fila
			grid.add(texto3, 0, 2);
			grid.add(direccion, 1, 2);

			ComboBox<Integer> comboBox = new ComboBox<Integer>();
			for(int i = 0; i <= 100; i++){
	        comboBox.getItems().add(i);
			}
			Text texto4 = new Text("Edad");
			grid.add(texto4, 0, 3);
			grid.add(comboBox, 1, 3);

			RadioButton rb1 = new RadioButton();
			rb1.setText("Masculino");
			RadioButton rb2 = new RadioButton();
			rb2.setText("Femenino");
			grid.add(rb1, 0, 4);
			grid.add(rb2, 1, 4);

			ToggleGroup group = new ToggleGroup();
			rb1.setToggleGroup(group);
			rb2.setToggleGroup(group);

			Text texto6 = new Text("Biografia");
			TextArea biografia = new TextArea();
			grid.add(texto6, 0, 6);
			grid.add(biografia, 1, 6);

			CheckBox check = new CheckBox();
			grid.add(check, 0, 7);
			check.setSelected(true);
			Text texto7 = new Text("Subscribirse a la newsletter");
			grid.add(texto7, 1, 7);

			root.setRight(boton);
			root.setLeft(titulo);
			root.setCenter(grid);
			Scene scene = new Scene(root,900,500);
			primaryStage.setScene(scene);
			primaryStage.show();


		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
