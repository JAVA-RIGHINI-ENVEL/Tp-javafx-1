package fr.envel.coursjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Ma première application");

        Button button = new Button();
        button.setText("Ceci est un bouton");
        button.setOnAction(actionEvent -> System.out.println("Ye !"));

        // Edit layout
        StackPane layout = new StackPane();
        layout.getChildren().add(button);


        // Edit scene
        Scene scene = new Scene(layout, 300, 250);


        // Edit stage
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}