package com.example.unlimitedaliengames.alienshooter;

import android.os.CountDownTimer;

class Timer extends CountDownTimer {
    private boolean isActive = false;
    private AlienShooterView view;

    Timer(AlienShooterView view, long time) {
        super(time, 1000);
        this.view = view;
    }

    public void onTick(long seconds) {
        String text = "Time: " + seconds / 1000;
        view.updateTimer(text);
    }

    void setActive() {
        isActive = true;
    }

    boolean getIsActive() {
        return isActive;
    }

    public void onFinish() {
        isActive = false;
        cancel();
        view.finishGame();
    }
}
