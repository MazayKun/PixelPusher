package com.mazay.pixelpusher.core;

import java.util.Objects;

/**
 * Основной класс приложения, через который можно получить доступ к остальным частям приложения
 */
public class PXContext {

    private static PXContext context;

    private View view;
    private MainEntity mainEntity;

    private PXContext() {
        this.view = new View();
        this.mainEntity = new MainEntity();
    }

    public static PXContext getContext() {
        if(Objects.isNull(context)) {
            context = new PXContext();
        }
        return context;
    }

    // Getters section

    public View getView() {
        return view;
    }

    public MainEntity getMainEntity() {
        return mainEntity;
    }
}
