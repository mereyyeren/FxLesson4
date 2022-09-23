module com.example.lesson3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson3 to javafx.fxml;
    exports com.example.lesson3;
}