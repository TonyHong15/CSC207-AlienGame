package com.example.unlimitedaliengames.alienshooter;

import android.view.View;


import java.util.List;

class AlienShooterPresenter implements AlienShooterPresenterInterface{
    private AlienShooterView view;
    private AlienShooterManager rules;


    AlienShooterPresenter(AlienShooterView view) {
        this.view = view;
        this.rules = new AlienShooterManager(this);
    }

    void clickedAlien(List<View> aliens, View v) {
        if (rules.checkAlien(v))
            rules.setPoints(1);
        else
            rules.setPoints(-2);
        rules.randomize(aliens);
        view.updatePoints(rules.get_point());
    }

    void destroy() {
        view = null;
    }

    public void changeAlienImage(){
        view.changeAlienImage();
    }
    void randomizeAliens(List<View> aliens) {
        rules.randomize(aliens);
    }


}
