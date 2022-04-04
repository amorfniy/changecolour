module com.example.changecolour {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.changecolour to javafx.fxml;
    exports com.example.changecolour;
}