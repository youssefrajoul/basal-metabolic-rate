package com.g59939.bmr59939.Main;

import com.g59939.bmr59939.view.BmrView;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    private BmrView view = new BmrView();


    @Override
    public void start(Stage primaryStage) throws IOException {
        // J'aime beaucoup le code, très propre. Pas grand chose à dire.
        primaryStage.setTitle("Calcul du BMR");
        // action event
        EventHandler<ActionEvent> eventCalcul = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                view.action();
            }
        };
        // action event
        EventHandler<ActionEvent> eventClear = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                view.clear();
            }
        };
        Scene scene = new Scene(view.getvBox(), 500, 370);
        primaryStage.setScene(scene);
        primaryStage.show();
        view.getMenuBar().getMenuExit().setOnAction(actionEvent -> System.exit(0));
        view.getButtons().getButtonClear().setOnAction(eventClear);
        view.getButtons().getButtonCalcul().setOnAction(eventCalcul);
        view.setView();
    }

    public static void main(String[] args) {
        launch();
    }
}