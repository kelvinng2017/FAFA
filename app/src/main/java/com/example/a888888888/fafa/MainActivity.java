package com.example.a888888888.fafa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView numberOne,numberTwo,numberThree;
    Random ran = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberOne=(TextView)findViewById(R.id.numberOne);
        numberTwo=(TextView)findViewById(R.id.numberTwo);
        numberThree=(TextView)findViewById(R.id.numberThree);
        numberOne.setText(Integer.toString(ran.nextInt(10)));
        numberTwo.setText(Integer.toString(ran.nextInt(10)));
        numberThree.setText(Integer.toString(ran.nextInt(10)));
    }
}
