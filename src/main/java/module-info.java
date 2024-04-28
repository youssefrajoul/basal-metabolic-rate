module com.g59939.bmr59939 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.g59939.bmr59939 to javafx.fxml;
    //exports com.g59939.bmr59939;
    exports com.g59939.bmr59939.Main;
    opens com.g59939.bmr59939.Main to javafx.fxml;
    exports com.g59939.bmr59939.Controller;
    opens com.g59939.bmr59939.Controller to javafx.fxml;
    exports com.g59939.bmr59939.Model;
    opens com.g59939.bmr59939.Model to javafx.fxml;
    exports com.g59939.bmr59939.view;
    opens com.g59939.bmr59939.view to javafx.fxml;
}