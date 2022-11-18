module com.example.banque {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.banque to javafx.fxml;
    exports com.example.banque;
    exports com.example.banque.controllers;
    opens com.example.banque.controllers to javafx.fxml;
}