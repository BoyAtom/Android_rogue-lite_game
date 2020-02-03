package com.example.javagameprj;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class mainGameLoop extends AppCompatActivity {

    public Button AttackButton; public Button NextRoomButton; public Button RestartButton;
    public TextView HPView; public TextView DMGView;
    public TextView EnemyHPView; public TextView EnemyDMGView;
    public TextView LevelView;
    public ImageView LocationView; public ImageView EnemyView; public ImageView attackAnimation;
    public AnimationDrawable AttackAnim;
    public mainHero hero = new mainHero(100, 5);
    public Enemy enemy = new Enemy();
    public int level, loc, cycle;

    //the output of all data
    public void output () {
        if (this.enemy.HP <= 0) {
            this.NextRoomButton.setClickable(true);
            this.AttackButton.setClickable(false);
        }
        else {
            this.NextRoomButton.setClickable(false);
            this.AttackButton.setClickable(true);
        }
        if (this.hero.HP <= 0) {
            this.NextRoomButton.setClickable(false);
            this.AttackButton.setClickable(false);
        }
        this.HPView.setText("Your HP: " + hero.HP);
        this.DMGView.setText(hero.DMG + " :Your DMG");
        this.EnemyHPView.setText("Enemy HP: " + enemy.HP);
        this.EnemyDMGView.setText(enemy.DMG + " :Enemy DMG");
        this.LevelView.setText("Level " + this.level + "\nCycle " + (this.cycle - 1));
    }

    //attack button
    @SuppressLint("SetTextI18n")
    public void attackOnClick(View view) {
        this.output();
        this.enemy.attack(hero);
        this.hero.attack(enemy, EnemyView);
        this.hero.die(AttackButton, NextRoomButton);
        this.AttackAnim.stop();
        this.AttackAnim.selectDrawable(0);
        this.AttackAnim.start();
        this.output();
    }

    //restart button
    @SuppressLint("SetTextI18n")
    public void mainMenu(View view) {
        this.hero.HP = 100;
        this.hero.DMG = 5;
        this.enemy.HP = 0;
        this.enemy.DMG = 0;
        this.level = 1;
        this.loc = 1;
        this.cycle = 1;
        this.AttackButton.setClickable(true);
        this.NextRoomButton.setClickable(true);
        this.EnemyView.setImageDrawable(null);
        this.AttackButton.setClickable(true);
        Intent intent = new Intent(mainGameLoop.this, mainMenuCode.class);
        startActivity(intent);
        this.output();
    }

    //next room button
    @SuppressLint("SetTextI18n")
    public void nextRoomOnClick(View view) {
        this.level += 1;
        this.output();
        int rnd = 1 + (int) (Math.random() * 2);
        if (this.level > 0 && this.level <= 20 && this.loc == 1) {
            this.LocationView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.forest));
            loc = 2;
        }
        if (this.level > 20 && this.level <= 40 && this.loc == 2) {
            this.LocationView.setImageDrawable(null);
            this.loc = 3;
        }
        if (this.level > 40 && this.level <= 60 && this.loc == 3) {
            this.LocationView.setImageDrawable(null);
            this.loc = 1;
        }
        if (this.level == 20 || this.level == 40 || this.level == 60) {
            this.EnemyView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.slimy_king));
            this.enemy.HP = 80 * this.cycle;
            this.enemy.DMG = 5 * this.cycle;
        }
        else if (rnd == 1) {
            this.EnemyView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.slimy));
            this.enemy.HP = 20 * this.cycle;
            this.enemy.DMG = 2 * this.cycle;
        }
        else if (rnd == 2) {
            int Rnd = 1 + (int) (Math.random() * 3);
            if (Rnd == 1) {
                this.EnemyView.setImageDrawable(null);
            }
            else if (Rnd == 2) {
                this.EnemyView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.hpup));
                this.hero.HP += 10 * this.cycle;
            }
            else if (Rnd == 3) {
                this.EnemyView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.chest));
                this.hero.DMG += this.cycle;
            }
            this.enemy.HP = 0;
            this.enemy.DMG = 0;
        }
        if (this.level == 61) {
            this.level = 1;
            this.cycle += 1;
        }
        this.LevelView.setText("Level " + this.level + "\n" + "Cycle " + (this.cycle));
        this.output();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_loop);

        //creating all elements
        this.HPView = findViewById(R.id.HPView);
        this.DMGView = findViewById(R.id.DMGView);
        this.EnemyHPView = findViewById(R.id.EnemyHPView);
        this.EnemyDMGView = findViewById(R.id.EnemyDMGView);
        this.LocationView = findViewById(R.id.locationView);
        this.EnemyView = findViewById(R.id.enemyView);
        this.AttackButton = findViewById(R.id.attackButton);
        this.NextRoomButton = findViewById(R.id.nextRoomButton);
        this.LevelView = findViewById(R.id.levelView);
        this.attackAnimation = findViewById(R.id.attackAnimation);
        this.level = 1;
        this.cycle = 1;

        //enemy stats
        this.enemy.DMG = 0;
        this.enemy.HP = 0;

        //start output all stats
        this.attackAnimation.setBackgroundResource(R.drawable.attack);
        this.AttackAnim = (AnimationDrawable) this.attackAnimation.getBackground();
        this.output();
    }
}
