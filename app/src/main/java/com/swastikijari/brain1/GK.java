package com.swastikijari.brain1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.ServiceConfigurationError;

import static android.support.v4.os.LocaleListCompat.create;

public class GK extends AppCompatActivity {


    TextView tv1,CountDown,score,fscore;
    LinearLayout linearLayout;
    Button b1,b2,b3,b4,replay,pre,next;
    private  Question2 Object = new Question2();
    private int score1 = 0;
    private int i,k;
    private String answer;
    private int mquestionLength=Object.Appti2.length;
    //  Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gk);
        //linearLayout=(LinearLayout)findViewById(R.id.linearLayout);
        //Text initialization
        tv1 = (TextView)findViewById(R.id.question);
        CountDown = (TextView)findViewById(R.id.timer);
        score=findViewById(R.id.scoreupdate);
        fscore=findViewById(R.id.finaldisp);
        pre=findViewById(R.id.Pre);
        next=findViewById(R.id.next);
        replay=findViewById(R.id.replay);
        fscore.setEnabled(false);
        replay.setEnabled(false);
        // linearLayout.setVisibility(View.INVISIBLE);

        //Buttons initialization
        b1=(Button)findViewById(R.id.gk1);
        b2=(Button)findViewById(R.id.gk2);
        b3=(Button)findViewById(R.id.gk3);
        b4=(Button)findViewById(R.id.gk4);
        //  r = new Random();

        updateQuestion(k);
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k=k-1;
                decreasequestion(k);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                updateQuestion(k);

            }
        });


        //on Button CLick b1
        new CountDownTimer(30100, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {

                CountDown.setText(String.valueOf(millisUntilFinished / 1000) + "s");

            }

            @Override
            public void onFinish() {
                fscore.setEnabled(true);
                replay.setEnabled(true);
                CountDown.setText("0s");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);

                fscore.setText(
                        "Your score: " + Integer.toString(score1) + "/" + Integer.toString(mquestionLength));
                replay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(GK.this,MainActivity.class));
                        finish();
                    }
                });

            }
        }.start();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.getText() == answer){
                    score1++;
                    i++;
                    updateQuestion(k);

                }
                else{

                }




            }
        });
        //On Button Click b2

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.getText() == answer){
                    score1++;
                    i++;
                    updateQuestion(k);
                }
                else{

                }





            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3.getText() == answer){
                    score1++;
                    i++;
                    updateQuestion(k);
                }
                if(b3.getText()!=answer){

                }





            }
        });
        //On Button Click b2

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.getText() == answer){
                    score1++;
                    i++;
                    updateQuestion(k);
                }
                else{

                }



            }
        });




    }

    public void decreasequestion(int num){
        if(num<=0){
            Toast.makeText(GK.this, "No  Qusestion press Next", Toast.LENGTH_SHORT).show();
            k=1;
        }
        score.setText(i + "/" + mquestionLength);
        tv1.setText(Object.getQuestion(num));
        b1.setText(Object.Choice1(num));
        b2.setText(Object.Choice2(num));
        b3.setText(Object.Choice3(num));
        b4.setText(Object.Choice4(num));
        answer = Object.Answers(num);

    }


    public  void updateQuestion(int num){

        score.setText(i + "/" + mquestionLength);
        tv1.setText(Object.getQuestion(num));
        b1.setText(Object.Choice1(num));
        b2.setText(Object.Choice2(num));
        b3.setText(Object.Choice3(num));
        b4.setText(Object.Choice4(num));
        answer = Object.Answers(num);
        k++;
        if(k>=mquestionLength) {
            Toast.makeText(GK.this, "This is last Qusestion", Toast.LENGTH_SHORT).show();
            k=0;
        }

    }



  /* public  void gameOver(){

       AlertDialog.Builder alert1 = new AlertDialog.Builder(Logic.this);
       alert1.setMessage("Congratulations  you Have Won :"+score1+" Rupees ").setCancelable(false);
       alert1.setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
              startActivity(new Intent(getApplicationContext(),MainActivity.class));
           }
       }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
            finish();
           }
       });
       AlertDialog  alert= alert1.create();
       alert.setTitle("!!! Alert !!!");
       alert.show();
   }
   */
}


