package com.ehaney.fitch;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FitchApp extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.setTop(initMenuBar());
        root.setCenter(initEditor());
        Scene scene = new Scene(root);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private SplitPane initEditor() {
        // TODO
        return new SplitPane();
    }

    private MenuBar initMenuBar() {
        // TODO
        return new MenuBar();
    }

    public static void main(String[] args) {
        launch();
    }
}