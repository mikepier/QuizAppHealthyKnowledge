package com.example.android.quizapphealthyknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.quizapphealthyknowledge.Activity_Question.q1;

public class Activity_Question5 extends AppCompatActivity {

    public static boolean q5 = false;
    Button startButton;
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__question5);

        startButton = (Button) findViewById(R.id.getStarted);
        startButton.setOnClickListener(new View.OnClickListener() {
            /**
             * This method checks if the quantity is right and draws a proper class.
             */
            @Override
            public void onClick(View v) {
                TextView chosenNumber = ((TextView) findViewById(R.id.numberChoice));
                if (quantity == 30) {
                    q5 = true;
                    Toast.makeText(getApplicationContext(), "Good answer!",
                            Toast.LENGTH_LONG).show();
                }

                if (Activity_Question.q1 && Activity_Question2.q2 && Activity_Question3.q3 && Activity_Question4.q4
                        && Activity_Question5.q5) {
                    Intent intent = new Intent(v.getContext(), youWon.class);
                    //startActivityForResult(intent, 0);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(v.getContext(), youLost.class);
                    //startActivityForResult(intent, 0);
                    startActivity(intent);
                }
            }
        });
    }
    /**
     * This method increments the numberChoice TextView.
     */
    public void increment(View view) {
        if (quantity == 100) {
            Toast.makeText(getApplicationContext(), "Can you really be that fast?",
                    Toast.LENGTH_LONG).show();
        } else {
            quantity = quantity + 1;
            displayQuantity(quantity);
        }
    }

    /**
     * This method decrements the numberChoice TextView.
     */
    public void decrement(View view) {
        if (quantity == 1) {
            Toast.makeText(getApplicationContext(), "Whoah, tt can't be less than 1!",
                    Toast.LENGTH_LONG).show();
        } else {
            quantity = quantity - 1;
            displayQuantity(quantity);
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    private void displayQuantity(int quantity) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.numberChoice);
        quantityTextView.setText("" + quantity);
    }

}

