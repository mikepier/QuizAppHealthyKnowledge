package com.example.android.quizapphealthyknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.R.attr.name;
import static com.example.android.quizapphealthyknowledge.R.id.enterName;

public class Activity_Question extends AppCompatActivity {

    Button startButton;
    public static String radiovalue = "";
    public static boolean q1 = false;

    /**
     * This method checks if the answer is right, updates q1's value and draws next screen..
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__question);

        startButton = (Button) findViewById(R.id.getStarted);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton radioYes = ((RadioButton) findViewById(R.id.yes_radio_button));
                if ((radioYes).isChecked()) {
                    radiovalue = radioYes.getText().toString();
                    q1 = true;
                    Toast.makeText(getApplicationContext(), "Good answer!",
                            Toast.LENGTH_LONG).show();
                }
                    Intent intent = new Intent(v.getContext(), Activity_Question2.class);
                    startActivity(intent);
                    //startActivityForResult(intent, 0);
                }
            }
        );
    }
}
