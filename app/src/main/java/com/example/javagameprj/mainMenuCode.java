package com.example.javagameprj;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

public class mainMenuCode extends AppCompatActivity {
    ImageView LocationView;
    ConstraintLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        this.layout = findViewById(R.id.linearLayout);
        this.LocationView = findViewById(R.id.locationView);
        int width = layout.getWidth();
        ViewGroup.LayoutParams params = this.LocationView.getLayoutParams();
        params.width = width;
        params.height = width;
        this.LocationView.setLayoutParams(params);
}

    public void startGame(View view) {
        Intent intent = new Intent(mainMenuCode.this, mainGameLoop.class);
        startActivity(intent);
    }
}
