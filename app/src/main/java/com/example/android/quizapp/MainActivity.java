package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.quizapp.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score = 0;

    public void submit_answers(View view) {

        RadioButton Sprb = findViewById(R.id.sp);
        RadioButton Dprb = findViewById(R.id.dp);
        if (Sprb.isChecked()) {
            score = score + 1;
            Log.v(TAG, "plus one");
        } else if (Dprb.isChecked()) {
            score = score + 0;
        }
        EditText q2 = findViewById(R.id.q2);
        String userAnswer = q2.getText().toString().trim();
        String correctAnswer = "android:textColor=\"@android:color/black\"";
        if (userAnswer.equals(correctAnswer)) {
            score = score + 1;
            Log.v(TAG, "plus one");
        }
        CheckBox matchParent = findViewById(R.id.match_parent);
        CheckBox matchContent = findViewById(R.id.match_content);
        if(matchParent.isChecked()) {
            score = score + 1;
        }
        CheckBox wrapParent = findViewById(R.id.wrap_parent);
        CheckBox wrapContent = findViewById(R.id.wrap_content);
        if (wrapContent.isChecked()) {
            score = score + 1;
        }
        CheckBox image_view = findViewById(R.id.image_view);
        CheckBox TextView = findViewById(R.id.TextView);
        if (TextView.isChecked()) {
            score = score + 1;
        }
        CheckBox textview = findViewById(R.id.Textview);
        CheckBox ImageView = findViewById(R.id.ImageView);
        if (ImageView.isChecked()) {
            score = score + 1;
        }
        Toast.makeText(getApplicationContext(), "you scored: "+score, Toast.LENGTH_LONG).show();
        return;
    }
}