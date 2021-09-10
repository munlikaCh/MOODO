package view;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import model.Item.Armor;
import model.Item.Weapon;
import model.controller.AllCustomHandler;

import static model.controller.AllCustomHandler.onDragOver;
import static model.controller.AllCustomHandler.onDragDropped;

public class EquipPane extends ScrollPane {
    private Weapon equippedWeapon;
//    private Armor equippedArmor;

    public EquipPane() {
    }

    private Pane getDetailsPane() {
        Pane equipmentInfoPane = new VBox(10);
        equipmentInfoPane.setBorder(null);
        ((VBox) equipmentInfoPane).setAlignment(Pos.CENTER);
        equipmentInfoPane.setPadding(new Insets(25, 10, 25, 125));
//        equipmentInfoPane.setStyle("-fx-background-color:#CBAB90;");
        Label weaponLbl
//                ,armorLbl
                ;

        //---1.38---
        StackPane weaponImgGroup = new StackPane();
//        StackPane armorImgGroup = new StackPane();
        ImageView bg1 = new ImageView();
        ImageView bg2 = new ImageView();
        //----------

        ImageView weaponImg = new ImageView();
//        ImageView armorImg = new ImageView();

        //---1.38(2)---
        bg1.setImage(new Image(getClass().getClassLoader().getResource("assets/blank.png")
                .toString()));
        bg2.setImage(new Image(getClass().getClassLoader().getResource("assets/blank.png")
                .toString()));
        weaponImgGroup.getChildren().add(bg1);
//        armorImgGroup.getChildren().add(bg2);
        //-------------

        if (equippedWeapon != null) {
            weaponLbl = new Label("MOOD : "+equippedWeapon.getName());

            weaponImg.setImage(new Image(getClass().getClassLoader().getResource(
                    equippedWeapon.getImagepath()).toString()));
            //---1.38(3)---
            weaponImgGroup.getChildren().add(weaponImg);
            //--------------
        } else {
            weaponLbl = new Label("MOOD :");

            weaponImg.setImage(new Image(getClass().getClassLoader().getResource("assets/blank.png").toString()));
        }
//        if (equippedArmor != null) {
//            armorLbl = new Label("Armor: \n"+equippedArmor.getName());
//            armorImg.setImage(new Image(getClass().getClassLoader().getResource(
//                    equippedArmor.getImagepath()).toString()));
//            //---1.38(4)---
//            armorImgGroup.getChildren().add(armorImg);
//            //-------------
//        } else {
//            armorLbl = new Label("Armor:");
//            armorImg.setImage(new Image(getClass().getClassLoader().getResource("assets/blank.png").toString()));
//        }
        //---1.38(5)---
        weaponImgGroup.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent e) {
                onDragOver(e, "Weapon");
            }
        });
//        armorImgGroup.setOnDragOver(new EventHandler<DragEvent>() {
//            @Override
//            public void handle(DragEvent e) {
//                onDragOver(e, "Armor");
//            }
//        });
        weaponImgGroup.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent e) {
                onDragDropped(e, weaponLbl, weaponImgGroup);
            }
        });
//        armorImgGroup.setOnDragDropped(new EventHandler<DragEvent>() {
//            @Override
//            public void handle(DragEvent e) {
//                onDragDropped(e, armorLbl, armorImgGroup);
//            }
//        });
        // button
        Button unequip = new Button();
        unequip.setText("reset MOOD");
        unequip.setOnAction(new AllCustomHandler.unequip());

        //+++ add armorLbl, armorImgGroup,unequip +++
        equipmentInfoPane.getChildren().addAll(weaponLbl,weaponImgGroup
//                ,armorLbl, armorImgGroup
                ,unequip);
        return equipmentInfoPane;
    }
    public void drawPane(Weapon equippedWeapon
//            , Armor equippedArmor
    ) {
        this.equippedWeapon = equippedWeapon;
//        this.equippedArmor = equippedArmor;
        Pane equipmentInfo = getDetailsPane();
        this.setStyle("-fx-background-color:#F4F4F4;");
        this.setContent(equipmentInfo);
    }

}
