package com.di.practica3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class resizer extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Resizable Button Demo");

        ResizableButton resizableButton = new ResizableButton("Resizable Button");
        StackPane root = new StackPane();
        root.getChildren().add(resizableButton);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    // Clase ResizableButton que extiende de Button
    public class ResizableButton extends Button {

        public ResizableButton(String text) {
            super(text);

            // Añadir un evento de clic para cambiar el tamaño
            setOnAction(event -> changeSize());
        }

        // Método para cambiar el tamaño del botón
        private void changeSize() {
            double newWidth = getWidth() * 1.5; // Aumentar el ancho en un 50%
            double newHeight = getHeight() * 1.5; // Aumentar la altura en un 50%
            setPrefSize(newWidth, newHeight);
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
