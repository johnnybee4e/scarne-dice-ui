package com.example.scarnesdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int userTotalScore = 0;
    private int userTurnScore = 0;
    private int compTotalScore = 0;
    private int compTurnScore = 0;
    private Random rand = new Random();
    private Map<Integer, String> diceImages = new HashMap<Integer, String>() {{
        put(1, "dice1.png");
        put(2, "dice2.png");
        put(3, "dice3.png");
        put(4, "dice4.png");
        put(5, "dice5.png");
        put(6, "dice6.png");
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String rollDice (){
        int diceFace = rand.nextInt(7);
        return diceImages.get(diceFace);
    }

}
