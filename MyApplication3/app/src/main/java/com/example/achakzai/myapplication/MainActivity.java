package com.example.achakzai.myapplication;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Inp;

    TextView Output1;
    Button Enter;
    //public String OutputZ;
    String P1="[^a-zA-Z0-9]*$";
    String P2 = "^[a-zA-Z]*$";
    String P3= "^[\\d]*$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Inp = (EditText)findViewById(R.id.Input);
        Enter = (Button)findViewById(R.id.button);
        Output1 = (TextView)findViewById(R.id.Output);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String num1 = (Inp.getText().toString());

                if(num1.matches(P2))
                {
                   String OutputZ = "Alphabet";

                    Output1.setText(OutputZ);

                }
                else if(num1.matches(P1))
                {

                   String OutputZ = "Special Character";
                    Output1.setText(OutputZ);

                }
                else if(num1.matches(P3))
                {
                    String OutputZ = "Number";
                    Output1.setText(OutputZ);

                }
                else
                {
                    String OutputZ = "AlphaNumerical";
                    Output1.setText(OutputZ);
                }


            }





        });
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
