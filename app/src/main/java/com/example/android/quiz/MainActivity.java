package com.example.android.quiz;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.quiz.R.id.aleko;
import static com.example.android.quiz.R.id.barber;
import static com.example.android.quiz.R.id.boheme;
import static com.example.android.quiz.R.id.brahms;
import static com.example.android.quiz.R.id.grieg;
import static com.example.android.quiz.R.id.liszt;
import static com.example.android.quiz.R.id.mahler;
import static com.example.android.quiz.R.id.paganini;
import static com.example.android.quiz.R.id.rachmaninoff;
import static com.example.android.quiz.R.id.schoenberg;
import static com.example.android.quiz.R.id.seventeen;
import static com.example.android.quiz.R.id.shostakovich;
import static com.example.android.quiz.R.id.skriabin;
import static com.example.android.quiz.R.id.strauss;
import static com.example.android.quiz.R.id.toastlayout;
import static com.example.android.quiz.R.id.tosca;
import static com.example.android.quiz.R.layout.toast;

/**
 * This app displays a quiz with questions about classical composers
 */
public class MainActivity extends AppCompatActivity {

    /*
    ** declaring of all the global variables
     */
    static final String STATE_NumberOfCorrectAnswers = "correctAnswers";
    static final String STATE_ResultQuestion1 = "resultQuestion1";
    static final String STATE_ResultQuestion2 = "resultQuestion2";
    static final String STATE_ResultQuestion3 = "resultQuestion3";
    static final String STATE_ResultQuestion4 = "resultQuestion4";
    static final String STATE_ResultQuestion5 = "resultQuestion5";
    static final String STATE_ResultQuestion6 = "resultQuestion6";
    static final String STATE_ResultQuestion7 = "resultQuestion7";
    static final String STATE_ResultQuestion8 = "resultQuestion8";
    static final String STATE_ResultQuestion9 = "resultQuestion9";
    static final String STATE_ResultQuestion10 = "resultQuestion10";

    int numberOfCorrectAnswers = 0;
    String resultQuestion1;
    String resultQuestion2;
    String resultQuestion3;
    String resultQuestion4;
    String resultQuestion5;
    String resultQuestion6;
    String resultQuestion7;
    String resultQuestion8;
    String resultQuestion9;
    String resultQuestion10;
    RadioButton quest1answ1;
    RadioButton quest1answ2;
    RadioButton quest1answ3;
    CheckBox quest2answ1;
    CheckBox quest2answ2;
    CheckBox quest2answ3;
    EditText quest3answ;
    RadioButton quest4answ1;
    RadioButton quest4answ2;
    RadioButton quest4answ3;
    CheckBox quest5answ1;
    CheckBox quest5answ2;
    CheckBox quest5answ3;
    RadioButton quest6answ1;
    RadioButton quest6answ2;
    RadioButton quest6answ3;
    CheckBox quest7answ1;
    CheckBox quest7answ2;
    CheckBox quest7answ3;
    RadioButton quest8answ1;
    RadioButton quest8answ2;
    RadioButton quest8answ3;
    EditText quest9answ;
    CheckBox quest10answ1;
    CheckBox quest10answ2;
    CheckBox quest10answ3;
    CheckBox quest10answ4;
    CheckBox quest10answ5;
    RadioGroup group1;
    RadioGroup group2;
    RadioGroup group3;
    RadioGroup group4;
    ImageButton play;
    ImageButton pause;
    ImageButton stop;
    ImageButton play2;
    ImageButton pause2;
    ImageButton stop2;


    /*
    ** Saves the value of number of correct answers and results
     */
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save the user's current game state
        savedInstanceState.putInt(STATE_NumberOfCorrectAnswers, numberOfCorrectAnswers);
        savedInstanceState.putString(STATE_ResultQuestion1, resultQuestion1);
        savedInstanceState.putString(STATE_ResultQuestion2, resultQuestion2);
        savedInstanceState.putString(STATE_ResultQuestion3, resultQuestion3);
        savedInstanceState.putString(STATE_ResultQuestion4, resultQuestion4);
        savedInstanceState.putString(STATE_ResultQuestion5, resultQuestion5);
        savedInstanceState.putString(STATE_ResultQuestion6, resultQuestion6);
        savedInstanceState.putString(STATE_ResultQuestion7, resultQuestion7);
        savedInstanceState.putString(STATE_ResultQuestion8, resultQuestion8);
        savedInstanceState.putString(STATE_ResultQuestion9, resultQuestion9);
        savedInstanceState.putString(STATE_ResultQuestion10, resultQuestion10);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            numberOfCorrectAnswers = savedInstanceState.getInt(STATE_NumberOfCorrectAnswers);
            resultQuestion1 = savedInstanceState.getString(STATE_ResultQuestion1);
            resultQuestion2 = savedInstanceState.getString(STATE_ResultQuestion2);
            resultQuestion3 = savedInstanceState.getString(STATE_ResultQuestion3);
            resultQuestion4 = savedInstanceState.getString(STATE_ResultQuestion4);
            resultQuestion5 = savedInstanceState.getString(STATE_ResultQuestion5);
            resultQuestion6 = savedInstanceState.getString(STATE_ResultQuestion6);
            resultQuestion7 = savedInstanceState.getString(STATE_ResultQuestion7);
            resultQuestion8 = savedInstanceState.getString(STATE_ResultQuestion8);
            resultQuestion9 = savedInstanceState.getString(STATE_ResultQuestion9);
            resultQuestion10 = savedInstanceState.getString(STATE_ResultQuestion10);
        }

        /*
        ** A list of all the findViewById()
         */
        quest1answ1 = (RadioButton) findViewById(seventeen);
        quest1answ2 = (RadioButton) findViewById(R.id.twentyone);
        quest1answ3 = (RadioButton) findViewById(R.id.twentythree);
        quest2answ1 = (CheckBox) findViewById(R.id.Rigoletto);
        quest2answ2 = (CheckBox) findViewById(R.id.Pagliacci);
        quest2answ3 = (CheckBox) findViewById(R.id.Traviata);
        quest3answ = (EditText) findViewById(R.id.composer);
        quest4answ1 = (RadioButton) findViewById(R.id.Berlioz);
        quest4answ2 = (RadioButton) findViewById(R.id.Bartok);
        quest4answ3 = (RadioButton) findViewById(R.id.Beethoven);
        quest5answ1 = (CheckBox) findViewById(R.id.nutcracker);
        quest5answ2 = (CheckBox) findViewById(paganini);
        quest5answ3 = (CheckBox) findViewById(aleko);
        quest6answ1 = (RadioButton) findViewById(R.id.tchaikovsky);
        quest6answ2 = (RadioButton) findViewById(grieg);
        quest6answ3 = (RadioButton) findViewById(rachmaninoff);
        quest7answ1 = (CheckBox) findViewById(tosca);
        quest7answ2 = (CheckBox) findViewById(R.id.theBarberOfSeville);
        quest7answ3 = (CheckBox) findViewById(boheme);
        quest8answ1 = (RadioButton) findViewById(strauss);
        quest8answ2 = (RadioButton) findViewById(schoenberg);
        quest8answ3 = (RadioButton) findViewById(brahms);
        quest9answ = (EditText) findViewById(R.id.composer1);
        quest10answ1 = (CheckBox) findViewById(mahler);
        quest10answ2 = (CheckBox) findViewById(shostakovich);
        quest10answ3 = (CheckBox) findViewById(skriabin);
        quest10answ4 = (CheckBox) findViewById(liszt);
        quest10answ5 = (CheckBox) findViewById(barber);
        group1 = (RadioGroup) findViewById(R.id.group1);
        group2 = (RadioGroup) findViewById(R.id.group2);
        group3 = (RadioGroup) findViewById(R.id.group3);
        group4 = (RadioGroup) findViewById(R.id.group4);
        play = (ImageButton) findViewById(R.id.play);
        pause = (ImageButton) findViewById(R.id.pause);
        stop = (ImageButton) findViewById(R.id.stop);
        play2 = (ImageButton) findViewById(R.id.play1);
        pause2 = (ImageButton) findViewById(R.id.pause1);
        stop2 = (ImageButton) findViewById(R.id.stop1);

        /*
        ** Activates the Media Player with a click on Play button
         */
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.music_piece1);
        play.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.pause();
                mp.seekTo(0);
            }
        });

        /*
        ** Activates the Media Player(2) with a click on Play(2) button
         */
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.music_piece2);
        play2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp2.start();
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp2.pause();
            }
        });
        stop2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp2.pause();
                mp2.seekTo(0);
            }
        });
    }

    /**
     * This method is called when the Submit button is clicked.
     */
    public void submitAnswers(View v) {
        /*
        ** declaring of all the local variables
         */
        String answer1 = getString(R.string.question1answer3);
        String answer2 = getString(R.string.question2answer1) + ", " + getString(R.string.question2answer3);
        String answer3 = getString(R.string.answer3);
        String answer4 = getString(R.string.question4answer3);
        String answer5 = getString(R.string.question5answer2) + ", " + getString(R.string.question5answer3);
        String answer6 = getString(R.string.question6asnwer1);
        String answer7 = getString(R.string.question7answer1) + ", " + getString(R.string.question7answer3);
        String answer8 = getString(R.string.question8answer2);
        String answer9 = getString(R.string.answer9);
        String answer10 = getString(R.string.question10answer1) + ", " + getString(R.string.question10answer2) + ", " + getString(R.string.question10answer5);

        /*
        ** Checks if the boxes for question1 are checked
         */
        boolean question1answer1 = quest1answ1.isChecked();
        boolean question1answer2 = quest1answ2.isChecked();
        boolean question1Answer3 = quest1answ3.isChecked();

        /*
        ** Checks the answer for question 1
         */
        if (question1Answer3) {
            numberOfCorrectAnswers++;
            resultQuestion1 = "Correct";
        } else if (!question1answer1 && !question1answer2 && !question1Answer3) {
            Toast.makeText(this, "You didn't answer question 1", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion1 = "Wrong";
        }


        /*
        ** Checks if the boxes for question2 are checked
         */
        boolean question2Answer1 = quest2answ1.isChecked();
        boolean question2Answer2 = quest2answ2.isChecked();
        boolean question2Answer3 = quest2answ3.isChecked();

        /*
        ** Checks the answer for question 2
         */
        if (question2Answer1 && question2Answer3 && !question2Answer2) {
            numberOfCorrectAnswers++;
            resultQuestion2 = "Correct";
        } else if (!question2Answer1 && !question2Answer2 && !question2Answer3) {
            Toast.makeText(this, "You didn't answer question 2", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion2 = "Wrong";
        }


        /*
        ** Converts quest3answ to String
         */
        String question3Answer = quest3answ.getText().toString();

        /*
        ** Checks the answer for question 3
         */
        if (question3Answer.equals(answer3)) {
            numberOfCorrectAnswers++;
            resultQuestion3 = "Correct";
        } else if (question3Answer.matches("")) {
            Toast.makeText(this, "You didn't answer question 3", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion3 = "Wrong";
        }


        /*
        ** Checks if the boxes for question4 are checked
         */
        boolean question4Answer1 = quest4answ1.isChecked();
        boolean question4Answer2 = quest4answ2.isChecked();
        boolean question4Answer3 = quest4answ3.isChecked();

        /*
        ** Checks the answer for question 4
         */
        if (question4Answer3) {
            numberOfCorrectAnswers++;
            resultQuestion4 = "Correct";
        } else if (!question4Answer1 && !question4Answer2 && !question4Answer3) {
            Toast.makeText(this, "You didn't answer question 4", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion4 = "Wrong";
        }


        /*
        ** Checks if the boxes for question5 are checked
         */
        boolean question5Answer1 = quest5answ1.isChecked();
        boolean question5Answer2 = quest5answ2.isChecked();
        boolean question5Answer3 = quest5answ3.isChecked();

        /*
        ** Checks the answer for question 5
         */
        if (question5Answer2 && question5Answer3 && !question5Answer1) {
            numberOfCorrectAnswers++;
            resultQuestion5 = "Correct";
        } else if (!question5Answer1 && !question5Answer2 && !question5Answer3) {
            Toast.makeText(this, "You didn't answer question 5", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion5 = "Wrong";
        }


        /*
        ** Checks if the boxes for question6 are checked
         */
        boolean question6Answer1 = quest6answ1.isChecked();
        boolean question6Answer2 = quest6answ2.isChecked();
        boolean question6Answer3 = quest6answ3.isChecked();

        /*
        ** Checks the answer for question 6
         */
        if (question6Answer1) {
            numberOfCorrectAnswers++;
            resultQuestion6 = "Correct";
        } else if (!question6Answer1 && !question6Answer2 && !question6Answer3) {
            Toast.makeText(this, "You didn't answer question 6", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion6 = "Wrong";
        }


        /*
        ** Checks if the boxes for question6 are checked
         */
        boolean question7Answer1 = quest7answ1.isChecked();
        boolean question7Answer2 = quest7answ2.isChecked();
        boolean question7Answer3 = quest7answ3.isChecked();

        /*
        ** Checks the answer for question 7
         */
        if (question7Answer1 && question7Answer3 && !question7Answer2) {
            numberOfCorrectAnswers++;
            resultQuestion7 = "Correct";
        } else if (!question7Answer1 && !question7Answer2 && !question7Answer3) {
            Toast.makeText(this, "You didn't answer question 7", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion7 = "Wrong";
        }


        /*
        ** Checks if the boxes for question8 are checked
         */
        boolean question8Answer1 = quest8answ1.isChecked();
        boolean question8Answer2 = quest8answ2.isChecked();
        boolean question8Answer3 = quest8answ3.isChecked();

        /*
        ** Checks the answer for question 8
         */
        if (question8Answer2) {
            numberOfCorrectAnswers++;
            resultQuestion8 = "Correct";
        } else if (!question8Answer1 && !question8Answer2 && !question8Answer3) {
            Toast.makeText(this, "You didn't answer question 8", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion8 = "Wrong";
        }


        /*
        ** Converts the quest9answ to String
         */
        String question9Answer = quest9answ.getText().toString();

        /*
        ** Checks the answer for question 9
         */
        if (question9Answer.equals(answer9)) {
            numberOfCorrectAnswers++;
            resultQuestion9 = "Correct";
        } else if (question9Answer.matches("")) {
            Toast.makeText(this, "You didn't answer question 9", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion9 = "Wrong";
        }


        /*
        ** Checks if the boxes for question10 are checked
         */
        boolean question10Answer1 = quest10answ1.isChecked();
        boolean question10Answer2 = quest10answ2.isChecked();
        boolean question10Answer3 = quest10answ3.isChecked();
        boolean question10Answer4 = quest10answ4.isChecked();
        boolean question10Answer5 = quest10answ5.isChecked();

        /*
        ** Checks the answer for question 10
         */
        if (!(question10Answer3 || question10Answer4) && (question10Answer1 && question10Answer2 && question10Answer5)) {
            numberOfCorrectAnswers++;
            resultQuestion10 = "Correct";

        } else if (!question10Answer1 && !question10Answer2 && !question10Answer3 && !question10Answer4 && !question10Answer5) {
            Toast.makeText(this, "You didn't answer question 10", Toast.LENGTH_SHORT).show();
            return;
        } else {
            resultQuestion10 = "Wrong";
        }


        /*
        ** Finds a customized toast layout
         */
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(toast, (ViewGroup) findViewById(toastlayout));

        /*
        ** Sets an image to the customized toast layout
         */
        ImageView image = (ImageView) layout.findViewById(R.id.img);
        image.setImageResource(R.drawable.burninggrandpiano);

        /*
        ** Sets the text to the toast
         */
        TextView text = (TextView) layout.findViewById(R.id.txt);
        text.setText("Number of correct answers: " + numberOfCorrectAnswers + "\n" + createSubmitMessage(resultQuestion1, answer1,
                resultQuestion2, answer2, resultQuestion3, answer3, resultQuestion4, answer4, resultQuestion5, answer5, resultQuestion6, answer6,
                resultQuestion7, answer7, resultQuestion8, answer8, resultQuestion9, answer9, resultQuestion10, answer10));

        /*
        ** Shows the toast
         */
        final Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.FILL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
        new CountDownTimer(9000, 1000) {

            public void onTick(long millisUntilFinished) {
                toast.show();
            }

            public void onFinish() {
                toast.show();
            }

        }.start();


        /*
        ** Resets the number of correct answers
         */
        numberOfCorrectAnswers = 0;

    }


    /*
    ** The message that is displayed in toast
     */
    private String createSubmitMessage(String resultQuestion1, String answer1, String resultQuestion2, String answer2, String resultQuestion3,
                                       String answer3, String resultQuestion4, String answer4, String resultQuestion5, String answer5, String resultQuestion6, String answer6,
                                       String resultQuestion7, String answer7, String resultQuestion8, String answer8, String resultQuestion9, String answer9,
                                       String resultQuestion10, String answer10) {
        String resultMessage = "1. " + resultQuestion1 + ". It's " + answer1;
        resultMessage += "\n2. " + resultQuestion2 + ". It's " + answer2;
        resultMessage += "\n3. " + resultQuestion3 + ". It's " + answer3;
        resultMessage += "\n4. " + resultQuestion4 + ". It's " + answer4;
        resultMessage += "\n5. " + resultQuestion5 + ". It's " + answer5;
        resultMessage += "\n6. " + resultQuestion6 + ". It's " + answer6;
        resultMessage += "\n7. " + resultQuestion7 + ". It's " + answer7;
        resultMessage += "\n8. " + resultQuestion8 + ". It's " + answer8;
        resultMessage += "\n9. " + resultQuestion9 + ". It's " + answer9;
        resultMessage += "\n10. " + resultQuestion10 + ". It's " + answer10;
        return resultMessage;
    }


    /**
     * This method is called when the Reset button is clicked.
     * Resets all the answer boxes to unchecked and text field to empty
     */
    public void resetAnswers(View view) {
        group1.clearCheck();
        group2.clearCheck();
        group3.clearCheck();
        group4.clearCheck();

        quest3answ.setText("");
        quest9answ.setText("");

        quest2answ1.setChecked(false);
        quest2answ2.setChecked(false);
        quest2answ3.setChecked(false);

        quest5answ1.setChecked(false);
        quest5answ2.setChecked(false);
        quest5answ3.setChecked(false);

        quest7answ1.setChecked(false);
        quest7answ2.setChecked(false);
        quest7answ3.setChecked(false);

        quest7answ1.setChecked(false);
        quest7answ2.setChecked(false);
        quest7answ3.setChecked(false);

        quest10answ1.setChecked(false);
        quest10answ2.setChecked(false);
        quest10answ3.setChecked(false);
        quest10answ4.setChecked(false);
        quest10answ5.setChecked(false);

    }


}






