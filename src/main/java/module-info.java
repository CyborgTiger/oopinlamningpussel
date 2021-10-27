module com.example.javafxtests {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.javafxtests to javafx.fxml;
    exports com.example.javafxtests;
}