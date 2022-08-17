package com.mazay.pixelpusher.core;

import com.mazay.pixelpusher.pixels.Pixel;

import java.util.Objects;

/**
 * Основной класс приложения, через который можно получить доступ к остальным частям приложения
 */
public class PXContext {

    private static PXContext context;

    private View view;
    private MainEntity mainEntity;
    private ApplicationConfiguration applicationConfiguration;

    private Pixel[][] scene1;
    private Pixel[][] scene2;
    private boolean sceneFlag;

    private PXContext() {
        this.view = new View();
        this.mainEntity = new MainEntity();
        this.applicationConfiguration = new ApplicationConfiguration();
    }

    static PXContext getContext() {
        if(Objects.isNull(context)) {
            context = new PXContext();
        }
        return context;
    }

    public Pixel[][] getSceneToDraw() {
        if(sceneFlag) {
            return scene1;
        }else{
            return scene2;
        }
    }

    public Pixel[][] getSceneToProcess() {
        if(sceneFlag) {
            return scene2;
        }else{
            return scene1;
        }
    }

    // Getters section

    public View getView() {
        return view;
    }

    public MainEntity getMainEntity() {
        return mainEntity;
    }

    public ApplicationConfiguration getApplicationConfiguration() {
        return applicationConfiguration;
    }
}
