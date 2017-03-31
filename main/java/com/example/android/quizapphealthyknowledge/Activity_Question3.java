package com.example.android.quizapphealthyknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.android.quizapphealthyknowledge.R.string.apples;
import static com.example.android.quizapphealthyknowledge.R.string.nuts;
import static com.example.android.quizapphealthyknowledge.R.string.seeds;

public class Activity_Question3 extends AppCompatActivity {

    public static boolean q3 = false;
    Button startButton;

    /**
     * This method checks if the answer is right, updates q3's value and draws next screen..
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__question3);
        startButton = (Button) findViewById(R.id.getStarted);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText strawberry = ((EditText) findViewById(R.id.answer3));
                String userAnswer = strawberry.getText().toString().replace(" ", "").toUpperCase();
                if (userAnswer.equals("STRAWBERRY")) {
                    q3 = true;
                    Toast.makeText(getApplicationContext(), "Good answer!",
                            Toast.LENGTH_LONG).show();
                }
                Intent intent = new Intent(v.getContext(), Activity_Question4.class);
                //startActivityForResult(intent, 0);
                startActivity(intent);
            }
        });
    }
}
