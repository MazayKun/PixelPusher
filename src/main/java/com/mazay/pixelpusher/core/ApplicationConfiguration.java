package com.mazay.pixelpusher.core;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;

public class ApplicationConfiguration {
    private Integer windowWidth = 300;
    private Integer windowHeight = 300;
    private String windowTitle = "Pixel Pusher Application";

    private Rectangle2D screenBounds;

    ApplicationConfiguration() {
        updateScreenBounds();
    }

    private void updateScreenBounds() {
        screenBounds = Screen.getPrimary().getBounds();
    }

    public void setWindowSize(Integer windowHeight, Integer windowWidth) {
        setWindowHeight(windowHeight);
        setWindowWidth(windowWidth);
    }

    // Setters section

    public void setWindowWidth(Integer windowWidth) {
        updateScreenBounds();
        if(windowWidth > screenBounds.getWidth()) {
            this.windowWidth = (int)screenBounds.getWidth();
        }else{
            this.windowWidth = windowWidth;
        }
    }

    public void setWindowHeight(Integer windowHeight) {
        updateScreenBounds();
        if(windowHeight > screenBounds.getHeight()) {
            this.windowHeight = (int)screenBounds.getHeight();
        }else{
            this.windowHeight = windowHeight;
        }
    }

    public void setWindowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
    }

    // Getters section

    public Integer getWindowWidth() {
        return windowWidth;
    }

    public Integer getWindowHeight() {
        return windowHeight;
    }

    public String getWindowTitle() {
        return windowTitle;
    }
}
