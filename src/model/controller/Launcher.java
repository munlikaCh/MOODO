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
import model.Item.Weapon;
import view.CharacterPane;
import view.EquipPane;
import view.InventoryPane;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Launcher extends Application {

    private static Scene mainScene;
    private static BasedCharacter mainCharacter = null;
    private static ArrayList<BasedEquipment> allEquipments = null;
    private static Weapon equippedWeapon = null;
    private static Armor equippedArmor = null;
    private static CharacterPane characterPane = null;
    private static EquipPane equipPane = null;
    private static InventoryPane inventoryPane = null;

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

    //-----Add
    public static void setEquippedWeapon(Weapon retrievedEquipment) {
        equippedWeapon = retrievedEquipment;
    }
    public static void setEquippedArmor(Armor retrievedEquipment) {
        equippedArmor = retrievedEquipment;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("MOODO");
        primaryStage.setResizable(false);
        primaryStage.show();

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

        refreshPane();
        mainPane.setBottom(characterPane);
        mainPane.setCenter(equipPane);
        mainPane.setTop(inventoryPane);

        return mainPane;
    }
    public static void refreshPane() {
        characterPane.drawPane(mainCharacter);
        equipPane.drawPane(equippedWeapon
//                ,equippedArmor
        );
        inventoryPane.drawPane(allEquipments);
    }

    public static BasedCharacter getMainCharacter() { return mainCharacter; }
    public static void setMainCharacter(BasedCharacter mainCharacter) {
        Launcher.mainCharacter = mainCharacter;
    }
    public static void main(String[] args) {

        try{
            System.out.println("==== Welcome to MOODO ====");
            launch(args);
        }catch (Exception ee){
            System.out.println(ee);
        }
        System.out.println("See you later :')");
    }
}
