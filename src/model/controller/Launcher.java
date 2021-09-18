package model.controller;

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
