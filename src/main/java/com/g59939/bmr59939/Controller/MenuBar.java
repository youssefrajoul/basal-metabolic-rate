package com.g59939.bmr59939.Controller;

import javafx.scene.control.*;

public class MenuBar extends javafx.scene.control.MenuBar {

    private final Menu menuFile = new Menu("File");
    private final MenuItem menuExit = new MenuItem("Exit");

    public MenuBar() {
        this.getMenus().addAll(menuFile);
        menuFile.getItems().add(menuExit);
    }

    public Menu getMenuFile() {
        return menuFile;
    }

    public MenuItem getMenuExit() {
        return menuExit;
    }
}
