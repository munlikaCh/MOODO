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
        Label weaponLbl;
        StackPane weaponImgGroup = new StackPane();
        ImageView bg1 = new ImageView();
        ImageView bg2 = new ImageView();
        ImageView weaponImg = new ImageView();

        bg1.setImage(new Image(getClass().getClassLoader().getResource("assets/blank.png")
                .toString()));
        bg2.setImage(new Image(getClass().getClassLoader().getResource("assets/blank.png")
                .toString()));
        weaponImgGroup.getChildren().add(bg1);

        if (equippedWeapon != null) {
            weaponLbl = new Label("MOOD : "+equippedWeapon.getName());
            weaponLbl.setStyle("-fx-text-fill:#855950;");

            weaponImg.setImage(new Image(getClass().getClassLoader().getResource(
                    equippedWeapon.getImagepath()).toString()));
            weaponImgGroup.getChildren().add(weaponImg);
        } else {
            weaponLbl = new Label("MOOD :");
            weaponLbl.setStyle("-fx-text-fill:#855950;");
            weaponImg.setImage(new Image(getClass().getClassLoader().getResource("assets/blank.png").toString()));
        }
        weaponImgGroup.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent e) {
                onDragOver(e, "Weapon");
            }
        });
        weaponImgGroup.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent e) {
                onDragDropped(e, weaponLbl, weaponImgGroup);
            }
        });

        // button
        Button unequip = new Button();
        unequip.setText("reset MOOD");
        unequip.setStyle("-fx-background-color:#E4D9D3;"+"-fx-text-fill:#855950;");
        unequip.setOnAction(new AllCustomHandler.unequip());
        equipmentInfoPane.getChildren().addAll(weaponLbl,weaponImgGroup
                ,unequip);
        return equipmentInfoPane;
    }
    public void drawPane(Weapon equippedWeapon
    ) {
        this.equippedWeapon = equippedWeapon;
        Pane equipmentInfo = getDetailsPane();
        this.setStyle("-fx-background-color:#F4F4F4;");
        this.setContent(equipmentInfo);
    }

}
