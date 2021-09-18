package model.controller;

//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Character.BasedCharacter;
import model.DamageType;
import model.Item.Armor;
import model.Item.BasedEquipment;
//import model.Item.Bow;
import model.Item.Weapon;
import view.CharacterPane;
import view.EquipPane;
import view.InventoryPane;
import view.Text;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Launcher extends Application {


//    @FXML
//    private Label myLabel;
//    @FXML
//    private TextField myTextField;
//    @FXML
//    private Button myButton;
//
//    int age;

    private static Scene mainScene;
    private static BasedCharacter mainCharacter = null;
    private static ArrayList<BasedEquipment> allEquipments = null;
    private static Weapon equippedWeapon = null;
    private static Armor equippedArmor = null;
    private static CharacterPane characterPane = null;
    private static EquipPane equipPane = null;
    private static InventoryPane inventoryPane = null;
//    private static Text TextField = null;

    //
    public static ArrayList<BasedEquipment> getAllEquipments() {
        return allEquipments;
    }
    public static BasedEquipment getEquippedWeapon() {
        return equippedWeapon;
    }
    public static BasedEquipment getEquippedArmor() {
        return equippedArmor;
    }
    public static void setAllEquipments(ArrayList<BasedEquipment> allEquipments) {
        Launcher.allEquipments = allEquipments;
    }

    //-----Add ค่าเอง
    public static void setEquippedWeapon(Weapon retrievedEquipment) {
        equippedWeapon = retrievedEquipment;
    }
    public static void setEquippedArmor(Armor retrievedEquipment) {
        equippedArmor = retrievedEquipment;
    }

//    public void submit(ActionEvent event) {
//
//        try {
//            age = Integer.parseInt(myTextField.getText());
//
//            if(age >= 18) {
//                myLabel.setText("You are now signed up!");
//            }
//            else {
//                myLabel.setText("You must be 18+");
//            }
//        }
//        catch (NumberFormatException e){
//            myLabel.setText("enter only numbers plz");
//        }
//        catch (Exception e) {
//            myLabel.setText("error");
//        }
//    }

    @Override
    public void start(Stage primaryStage) throws Exception{

//        primaryStage.setImage("assets/Smile.png");
        primaryStage.setTitle("MOODO");
        primaryStage.setResizable(false);
        primaryStage.show();
        //--1.28
        mainCharacter = GenCharacter.setUpCharacter();
        allEquipments = GenItemList.setUpItemList();

        Pane mainPane = getMainPane();
        mainScene = new Scene(mainPane);
        primaryStage.setScene(mainScene);
        // textbox
        new MyFrame();
    }

    public Pane getMainPane() {
        BorderPane mainPane = new BorderPane();
        characterPane = new CharacterPane();
        equipPane = new EquipPane();
        inventoryPane = new InventoryPane();
//        TextField = new Text();
        refreshPane();
        mainPane.setBottom(characterPane);
        mainPane.setCenter(equipPane);
        mainPane.setTop(inventoryPane);
//        mainPane.setBottom(TextField);
        return mainPane;
    }
    public static void refreshPane() {
        characterPane.drawPane(mainCharacter);
        equipPane.drawPane(equippedWeapon
//                ,equippedArmor
        );
        inventoryPane.drawPane(allEquipments);
//        TextField.drawPane();


    }
    public static BasedCharacter getMainCharacter() { return mainCharacter; }
    public static void setMainCharacter(BasedCharacter mainCharacter) {
        Launcher.mainCharacter = mainCharacter;
    }
    public static void main(String[] args) {
        launch(args);

    }

}
