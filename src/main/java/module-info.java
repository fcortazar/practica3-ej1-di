module com.di.practica3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.di.practica3 to javafx.fxml;
    exports com.di.practica3;
}