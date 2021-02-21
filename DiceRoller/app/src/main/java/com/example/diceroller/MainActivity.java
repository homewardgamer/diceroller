package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random rng =new Random();
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img =findViewById(R.id.imageView);
        Button b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });



    }
    private void rollDice()
    {
        int rand= rng.nextInt(6)+1;
        switch (rand){
            case 1:
                img.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                img.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                img.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                img.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                img.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                img.setImageResource(R.drawable.dice_6);
                break;
        }
    }
}