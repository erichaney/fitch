module com.ehaney.fitch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ehaney.fitch to javafx.fxml;
    exports com.ehaney.fitch;
}