package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.Character.BasedCharacter;
import model.controller.AllCustomHandler;


public class CharacterPane extends ScrollPane {
    private BasedCharacter character;

    public CharacterPane() {
    }

    private Pane getDetailsPane() {
        Pane characterInfoPane = new VBox(50);
        characterInfoPane.setBorder(null);
        characterInfoPane.setPadding(new Insets(50, 50, 50, 50));
        Label name,type,description;
        ImageView mainImage = new ImageView();
        if (this.character != null) {
            name = new Label("Name: "+character.getName());
            mainImage.setImage(new Image(getClass().getClassLoader().getResource(
                    character.getImagepath()).toString()));
            type = new Label("Type: "+character.getType().toString());
            description = new Label("Description: " + character.getDescription());
        } else {
            name = new Label("Name: ");
            mainImage.setImage(new Image(getClass().getClassLoader().getResource("assets/unknown.png").toString()));
            type = new Label("Type: ");
            description = new Label("Description");
        }
        Button genCharacter = new Button();
        genCharacter.setText("Generate Block");

        //++++++
        Button Character = new Button();
        Character.setText("equipments");
        Character.setOnAction(new AllCustomHandler.GenHeroHandler());

        //-- 1.29 -------
        genCharacter.setOnAction(new AllCustomHandler.GenHeroHandler());
        characterInfoPane.getChildren().addAll(name,mainImage,type,description,
                genCharacter);
        return characterInfoPane;
    }
    public void drawPane(BasedCharacter character) {
        this.character = character;
        Pane characterInfo = getDetailsPane();
        this.setStyle("-fx-background-color:Red;");
        this.setContent(characterInfo);
    }
}
