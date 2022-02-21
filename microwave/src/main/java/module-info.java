module com.example.microwave {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;

    opens com.example.microwave to javafx.fxml;
    exports com.example.microwave;
    exports com.example.microwave.abstractions;
    opens com.example.microwave.abstractions to javafx.fxml;
}