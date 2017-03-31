package com.example.android.quizapphealthyknowledge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;
import static com.example.android.quizapphealthyknowledge.Activity_Question2.q2;
import static com.example.android.quizapphealthyknowledge.R.id.enterName;

public class youWon extends AppCompatActivity {

    Button recommendButton;
    Button tryagainButton;

    /**
     * This method restarts qs' values and launches try again button,
     * also let's a player recommend this app by sending an e-mail to a friend.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_won);

        recommendButton = (Button) findViewById(R.id.recommend);
        tryagainButton = (Button) findViewById(R.id.tryagain);

        recommendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                    //intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Have you heard about Healthy Kownledge?");
                    intent.putExtra(Intent.EXTRA_TEXT, "Hi! Here " + MainActivity.name + ". I've just played Healthy Knowledge and it was amazing! Try it out!");
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
                }

        });

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
