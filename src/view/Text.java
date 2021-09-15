package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Character.BasedCharacter;

public class Text extends ScrollPane {
//    private textbox box;

    public void start(Stage stage) {
        //Creating nodes
        TextField textField1 = new TextField("Enter your name");
        TextField textField2 = new TextField("Enter your e-mail");
        //Creating labels
        Label label1 = new Label("Name: ");
        Label label2 = new Label("Email: ");
        //Adding labels for nodes
        HBox box = new HBox(5);
        box.setPadding(new Insets(25, 5 , 5, 50));
        box.getChildren().addAll(label1, textField1, label2, textField2);
        //Setting the stage
        Scene scene = new Scene(box, 595, 150, Color.BEIGE);
        stage.setTitle("Text Field Example");
        stage.setScene(scene);
        stage.show();
    }
//    public static void main(String args[]){
//        launch(args);
//    }
}
