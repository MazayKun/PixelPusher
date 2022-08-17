package com.mazay.pixelpusher;

import com.mazay.pixelpusher.core.ApplicationManager;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ApplicationManager applicationManager = ApplicationManager.getApplicationManager();
        applicationManager.start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}