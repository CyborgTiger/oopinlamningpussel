module com.example.javafxtests {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtests to javafx.fxml;
    exports com.example.javafxtests;
}