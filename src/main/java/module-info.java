module com.javafx.print {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens com.javafx.print to javafx.fxml;
    exports com.javafx.print;
}