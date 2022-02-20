module com.example.microwave {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.microwave to javafx.fxml;
    exports com.example.microwave;
}