package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Character.BasedCharacter;
import model.controller.AllCustomHandler;


public class CharacterPane extends ScrollPane {
    private BasedCharacter character;

    public CharacterPane() {
    }

    private Pane getDetailsPane() {
        Pane characterInfoPane = new VBox(10);
        characterInfoPane.setBorder(null);
        characterInfoPane.setPadding(new Insets(25, 10, 25, 110));
        Label name,type,hp,atk,def,res,Spd;
        ImageView mainImage = new ImageView();
        if (this.character != null) {
            //get mood
            name = new Label("Name: "+character.getName());
            mainImage.setImage(new Image(getClass().getClassLoader().getResource(
                    character.getImagepath()).toString()));
            hp = new Label("HP: "+character.getHp().toString()+"/"+character.
                    getFullHp().toString());
            atk = new Label("Mutelu: "+character.getPower()); //from ATK
        } else {
            name = new Label("Name: ");
            mainImage.setImage(new Image(getClass().getClassLoader().getResource("assets/unknown.png").toString()));
            atk = new Label("ATK: ");
        }
        Button Character = new Button();
        Character.setText("equipments");
        Character.setOnAction(new AllCustomHandler.GenHeroHandler());
        characterInfoPane.getChildren().addAll(name,mainImage
                ,atk
        );
        return characterInfoPane;
    }
    public void drawPane(BasedCharacter character) {
        this.character = character;
        Pane characterInfo = getDetailsPane();
        this.setStyle("-fx-background-color:#F4F4F4;");
        this.setContent(characterInfo);
    }
}
