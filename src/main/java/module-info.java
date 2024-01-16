module com.example.libary_database_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens com.example.libary_database_project to javafx.fxml;
    exports com.example.libary_database_project;
}