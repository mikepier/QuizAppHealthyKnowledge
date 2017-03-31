package com.example.android.quizapphealthyknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity_Question4 extends AppCompatActivity {

    public static boolean q4 = false;
    Button startButton;
    /**
     * This method checks if the answer is right, updates q4's value and draws next screen..
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__question4);
        startButton = (Button) findViewById(R.id.getStarted);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton radioYes = ((RadioButton) findViewById(R.id.rb42));
                if ((radioYes).isChecked()) {
                    q4 = true;
                    Toast.makeText(getApplicationContext(), "Good answer!",
                            Toast.LENGTH_LONG).show();
                }
                Intent intent = new Intent(v.getContext(), Activity_Question5.class);
                //startActivityForResult(intent, 0);
                startActivity(intent);
            }
        });
    }
}
