package com.example.javagameprj;

import android.widget.ImageView;

public class Enemy {
    int HP, DMG;
    String type;

    public void attack (mainHero hero) {
        if (this.HP > 0) {
            hero.HP -= this.DMG;
        }
    }

    public void die (ImageView enemy) {
        enemy.setImageDrawable(null);
        this.DMG = 0;
        this.HP = 0;
    }
}
