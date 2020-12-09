module com.javafx.print {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.web;

	opens com.javafx.print to javafx.fxml;

	exports com.javafx.print;
}