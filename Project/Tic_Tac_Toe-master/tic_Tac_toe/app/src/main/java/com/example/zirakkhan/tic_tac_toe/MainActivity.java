package com.example.zirakkhan.tic_tac_toe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);


        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((i%2)==0){
                            button1.setTextSize(40);
                            button1.setText("X");
                        i++;
                        }
                        else
                        if(i%2 ==1){
                            button1.setTextSize(40);
                            button1.setText("O");
                            i++;
                        }
                    }
                }
        );
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((i%2)==0){
                            button2.setTextSize(40);
                            button2.setText("X");
                            i++;
                        }
                        else
                        if(i%2 ==1){
                            button2.setTextSize(40);
                            button2.setText("O");
                            i++;
                        }

                    }
                }
        );
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((i%2)==0){
                            button3.setTextSize(40);
                            button3.setText("X");
                            i++;
                        }
                        else
                        if(i%2 ==1){
                            button3.setTextSize(40);
                            button3.setText("O");
                        i++;
                        }

                    }
                }
        );
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((i%2)==0){
                            button4.setTextSize(40);
                            button4.setText("X");
                            i++;
                        }
                        else
                        if(i%2 ==1){
                            button4.setTextSize(40);
                            button4.setText("O");
                        i++;
                        }

                    }
                }
        );

        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((i%2)==0){
                            button5.setTextSize(40);
                            button5.setText("X");
                            i++;
                        }

                        else
                        if(i%2 ==1){
                            button5.setTextSize(40);
                            button5.setText("O");
                        i++;
                        }

                    }
                }
        );
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((i%2)==0){
                            button6.setTextSize(40);
                            button6.setText("X");
                            i++;
                        }
                        else
                        if(i%2 ==1){
                            button6.setTextSize(40);
                            button6.setText("O");
                        i++;
                        }


                    }
                }
        );
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((i%2)==0){
                            button7.setTextSize(40);
                            button7.setText("X");
                            i++;
                        }
                        else
                        if(i%2 ==1){
                            button7.setTextSize(40);
                            button7.setText("O");
                        i++;
                        }

                    }
                }
        );
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((i%2)==0){
                            button8.setTextSize(40);
                            button8.setText("X");
                            i++;
                        }
                        else
                        if(i%2 ==1){
                            button8.setTextSize(40);
                            button8.setText("O");
                        i++;
                        }


                    }
                }
        );
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((i%2)==0){
                            button9.setTextSize(40);
                            button9.setText("X");
                            i++;
                        }
                        else{
                            button9.setTextSize(40);
                            button9.setText("O");
                        i++;
                        }

                    }
                }
        );

    }


}



