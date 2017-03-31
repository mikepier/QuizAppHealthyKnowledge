package com.example.android.quizapphealthyknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    EditText enterName;
    static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterName = (EditText) findViewById(R.id.enterName);

        startButton = (Button) findViewById(R.id.getStarted);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = enterName.getText().toString();
                if (!name.matches("")) {
                    Intent intent = new Intent(v.getContext(), Activity_Question.class);
                    startActivityForResult(intent, 0);
                } else {
                    Toast.makeText(getApplicationContext(), "Please provide your name",
                            Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
