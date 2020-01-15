package com.example.javagameprj;

import android.widget.ImageView;

import java.util.Random;

public class mainHero {
    int HP, DMG;

    public mainHero(int startHP, int startDMG) {
        this.HP = startHP;
        this.DMG = startDMG;
    }

    public void attack (Enemy enemy, ImageView EnemyImage) {
        if (enemy.HP > 0) {
            enemy.HP -= this.DMG;
        }
        if (enemy.HP <= 0) {
            enemy.die(EnemyImage);
        }
    }

    public void die () {
        if (this.HP <= 0) {
            this.HP = 0;
            this.DMG = 0;
        }
    }

}
