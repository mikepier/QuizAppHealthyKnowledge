package com.example.android.quizapphealthyknowledge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class youLost extends AppCompatActivity {

    Button tryagainButton;

    /**
     * This method restarts qs' values and launches try again button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_lost);

        tryagainButton = (Button) findViewById(R.id.tryagain);

        tryagainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity_Question.q1 = false;
                Activity_Question2.q2 = false;
                Activity_Question3.q3 = false;
                Activity_Question4.q4 = false;
                Activity_Question5.q5 = false;
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }

        });
    }
}
