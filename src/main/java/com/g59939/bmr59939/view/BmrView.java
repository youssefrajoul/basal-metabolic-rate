package com.g59939.bmr59939.view;

import com.g59939.bmr59939.Controller.Buttons;
import com.g59939.bmr59939.Controller.MenuBar;
import com.g59939.bmr59939.Model.Person;
import com.g59939.bmr59939.Observable.Observer;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BmrView implements Observer {
    private VBox vBox;
    private HBox hBox;
    private MenuBar menuBar;
    private BmrLeftGrid bmrLeftGrid;
    private BmrRightGrid bmrRightGrid;
    private Buttons buttons;
    private Person person;

    private Alert alert = new Alert(Alert.AlertType.NONE);


    public BmrView() {
        this.vBox = new VBox();
        this.hBox = new HBox();
        this.menuBar = new MenuBar();
        this.bmrLeftGrid = new BmrLeftGrid();
        this.bmrRightGrid = new BmrRightGrid();
        this.buttons = new Buttons();
        this.person = new Person();
    }

    public void setView() {
        this.hBox.setAlignment(Pos.CENTER);
        this.hBox.getChildren().add(getBmrLeftGrid());
        this.hBox.getChildren().add(getBmrRightGrid());
        this.vBox.setAlignment(Pos.TOP_CENTER);
        this.vBox.getChildren().add(menuBar);
        this.vBox.getChildren().add(gethBox());
        this.vBox.getChildren().add(buttons.getButtonCalcul());
        this.vBox.getChildren().add(buttons.getButtonClear());

    }

    public HBox gethBox() {
        return hBox;
    }

    public VBox getvBox() {
        return vBox;
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }

    public Buttons getButtons() {
        return buttons;
    }

    public BmrLeftGrid getBmrLeftGrid() {
        return bmrLeftGrid;
    }

    public BmrRightGrid getBmrRightGrid() {
        return bmrRightGrid;
    }

    private void alertWindow() {
        alert.setHeaderText("Valeur de taille...");
        alert.setTitle("Erreur d'encadage");
        alert.setContentText("Vous devez encoder une valeur strictement superieure a zero");
        alert.setAlertType(Alert.AlertType.ERROR);
        alert.show();
        clear();
    }


    @Override
    public void action() {
        person.addObs(this);
        if (bmrLeftGrid.getTaille() == 0 || bmrLeftGrid.getPoids() == 0 || bmrLeftGrid.getAge() == 0) {
            alertWindow();

        } else {
            person.setPersonData(bmrLeftGrid.getTaille(), bmrLeftGrid.getPoids(),
                    bmrLeftGrid.getAge(), bmrLeftGrid.getGender(), bmrLeftGrid.getStyleVie());
            update();
        }
    }

    @Override
    public void update() {
        bmrRightGrid.setBmr(Double.toString(person.getBmr()));
        bmrRightGrid.setCalories(Double.toString(person.getCalories()));
        bmrRightGrid.getTextFieldBmr().setStyle("-fx-text-fill: black");
        bmrRightGrid.getTextFieldCalories().setStyle("-fx-text-fill: black");
    }


    public void clear() {
        bmrLeftGrid.clearInputs();
        bmrRightGrid.clearOutputs();
    }

}
