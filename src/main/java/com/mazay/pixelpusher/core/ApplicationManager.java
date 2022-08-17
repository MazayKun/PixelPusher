package com.mazay.pixelpusher.core;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class ApplicationManager {

    private static ApplicationManager applicationManager;
    private PXContext pxContext = PXContext.getContext();

    private ApplicationManager() {}

    public static ApplicationManager getApplicationManager() {
        if(Objects.isNull(applicationManager)) {
            applicationManager = new ApplicationManager();
        }
        return applicationManager;
    }

    public void start(Stage stage) {
        var root = new Pane();
        // TODO : тут дабл
        var appConfig = pxContext.getApplicationConfiguration();
        var canvas = new Canvas(appConfig.getWindowHeight(), appConfig.getWindowHeight());
        var gc = canvas.getGraphicsContext2D();
        gc.beginPath();
        gc.moveTo(30.5, 30.5);
        gc.lineTo(150.5, 30.5);
        gc.lineTo(150.5, 150.5);
        gc.lineTo(30.5, 30.5);
        gc.stroke();
        root.getChildren().add(canvas);

        var scene = new Scene(root, appConfig.getWindowHeight(), appConfig.getWindowHeight(), Color.WHITESMOKE);

        stage.setTitle(appConfig.getWindowTitle());
        stage.setScene(scene);
        stage.show();
    }
}
