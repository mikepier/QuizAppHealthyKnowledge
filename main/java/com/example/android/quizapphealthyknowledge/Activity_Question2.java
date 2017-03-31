package com.example.android.quizapphealthyknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity_Question2 extends AppCompatActivity {

    Button startButton;
    public static boolean q2 = false;

    /**
     * This method checks if the answer is right, updates q2's value and draws next screen. All checkboxes should be checked.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__question2);

        startButton = (Button) findViewById(R.id.getStarted);
        startButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               CheckBox nuts = ((CheckBox) findViewById(R.id.nutsBox));
                                               CheckBox apples = ((CheckBox) findViewById(R.id.applesBox));
                                               CheckBox seeds = ((CheckBox) findViewById(R.id.seedsBox));
                                               if ((nuts).isChecked() && (apples).isChecked() && (seeds).isChecked()) {
                                                   q2 = true;
                                                   Toast.makeText(getApplicationContext(), "Good answer!",
                                                           Toast.LENGTH_LONG).show();
                                               }
                                               Intent intent = new Intent(v.getContext(), Activity_Question3.class);
                                               //startActivityForResult(intent, 0);
                                               startActivity(intent);
                                           }
                                       }
        );
    }
}
