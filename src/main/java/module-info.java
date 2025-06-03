module com.example.pro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.pro to javafx.fxml;
    exports com.example.pro;
}