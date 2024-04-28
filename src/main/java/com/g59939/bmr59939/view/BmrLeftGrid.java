package com.g59939.bmr59939.view;

import com.g59939.bmr59939.Model.StyleDeVie;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.util.Arrays;

public class BmrLeftGrid extends GridPane {

    private TextField textFieldTaille;
    private TextField textFieldPoids;
    private TextField textFieldAge;

    private final ToggleGroup radioGroup;
    private final RadioButton radioButtonHomme;
    private final RadioButton radioButtonFemme;
    private final HBox hBoxRadioButtons;

    private final ChoiceBox<StyleDeVie> choiceBox = new ChoiceBox<>();

    public BmrLeftGrid() {
        // Un peu long tu aurais pu split ça en méthodes

        final Label lbDonnees = new Label("Donnees:");
        final Label lbTaille = new Label("Taille (cm)");
        final Label lbPoids = new Label("Poids (kg)");
        final Label lbAge = new Label("Age (annees)");
        final Label lbSexe = new Label("Sexe");
        final Label lbStyle_Vie = new Label("Style de vie");
        this.textFieldTaille = new TextField();
        this.textFieldPoids = new TextField();
        this.textFieldAge = new TextField();
        this.radioGroup = new ToggleGroup();
        this.radioButtonHomme = new RadioButton("Homme");
        this.radioButtonFemme = new RadioButton("Femme");
        this.hBoxRadioButtons = new HBox(5);

        this.setPadding(new Insets(5));
        this.add(lbDonnees, 1, 1);
        this.add(lbTaille, 1, 2);
        this.add(textFieldTaille, 2, 2);
        this.add(lbPoids, 1, 3);
        this.add(textFieldPoids, 2, 3);
        this.add(lbAge, 1, 4);
        this.add(textFieldAge, 2, 4);
        this.add(lbSexe, 1, 5);
        this.add(lbStyle_Vie, 1, 6);
        this.add(choiceBox, 2, 6);
        this.add(hBoxRadioButtons, 2, 5);

        radioButtonHomme.setToggleGroup(radioGroup);
        radioButtonFemme.setToggleGroup(radioGroup);
        radioButtonHomme.setSelected(true);
        hBoxRadioButtons.getChildren().add(radioButtonHomme);
        hBoxRadioButtons.getChildren().add(radioButtonFemme);

        textFieldAge.setPromptText("Age en années");
        textFieldPoids.setPromptText("Poids en kg");
        textFieldTaille.setPromptText("Taille en cm");
        lbDonnees.setStyle("-fx-font-weight: bold");
        lbDonnees.setUnderline(true);
        choiceBox.getItems().setAll(Arrays.asList(StyleDeVie.values()));
        choiceBox.getSelectionModel().selectFirst();
        this.setVgap(20);
    }

    public double getTaille() {
        if (textFieldTaille.getText().isEmpty()) return 0;
        return Double.parseDouble(textFieldTaille.getText());
    }

    public double getPoids() {
        if (textFieldPoids.getText().isEmpty()) return 0;
        return Double.parseDouble(textFieldPoids.getText());
    }

    public double getAge() {
        if (textFieldAge.getText().isEmpty()) return 0;
        return Double.parseDouble(textFieldAge.getText());
    }

    public String getGender(){
        RadioButton selectedRadioButton = (RadioButton) radioGroup.getSelectedToggle();
        return selectedRadioButton.getText();
    }

    public double getStyleVie(){
        return choiceBox.getSelectionModel().getSelectedItem().getFactor();
    }

    public void clearInputs(){
        this.textFieldTaille.clear();
        this.textFieldPoids.clear();
        this.textFieldAge.clear();
        choiceBox.getSelectionModel().selectFirst();
    }
}
