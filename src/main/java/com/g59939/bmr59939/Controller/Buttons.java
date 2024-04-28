package com.g59939.bmr59939.Controller;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Buttons extends Button {
    private final Button buttonCalcul;
    private final Button buttonClear;

    public Buttons() {
        buttonCalcul = new Button("Calcul du BMR");
        buttonClear = new Button("Clear");
        buttonCalcul.setMaxWidth(480);
        buttonClear.setMaxWidth(480);
    }

    public Button getButtonCalcul() {
        return buttonCalcul;
    }

    public Button getButtonClear() {
        return buttonClear;
    }
}
