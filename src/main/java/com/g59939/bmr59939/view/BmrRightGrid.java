package com.g59939.bmr59939.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class BmrRightGrid extends GridPane {

     private TextField textFieldBmr = new TextField();
     private TextField textFieldCalories = new TextField();

    public BmrRightGrid() {
        Label lbResultats = new Label("Resultats:");
        Label lbBmr = new Label("BMR");
        Label lbCalories = new Label("Calories");

        this.setPadding(new Insets(5));
        this.setVgap(20);
        this.add(lbResultats, 1, 1);
        this.add(lbBmr, 1, 2);
        this.add(textFieldBmr, 2, 2);
        this.add(lbCalories, 1, 3);
        this.add(textFieldCalories, 2, 3);

        lbResultats.setUnderline(true);
        lbResultats.setStyle("-fx-font-weight: bold");
        textFieldBmr.setPromptText("Résultats du BMR");
        textFieldCalories.setPromptText("Dépenses en calories");
    }

    public void setBmr(String bmrResult) {
        this.textFieldBmr.setText(bmrResult);

    }

    public void setCalories(String caloriesResult) {
        this.textFieldCalories.setText(caloriesResult);

    }

    public TextField getTextFieldBmr() {
        return textFieldBmr;
    }

    public TextField getTextFieldCalories() {
        return textFieldCalories;
    }

    public void clearOutputs(){
        textFieldBmr.clear();
        textFieldCalories.clear();
    }
}
