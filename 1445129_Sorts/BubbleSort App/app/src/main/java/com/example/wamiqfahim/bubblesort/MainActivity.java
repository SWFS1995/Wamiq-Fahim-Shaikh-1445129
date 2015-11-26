package com.example.wamiqfahim.bubblesort;

import android.os.Bundle;
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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public EditText Edit;
    public TextView Text;
    public Button Sort;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Edit = (EditText) findViewById(R.id.editText);
        Text = (TextView) findViewById(R.id.textView3);
        Sort = (Button) findViewById(R.id.button);

        Sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String S = Edit.getText().toString();
                String A[] = S.split(",");

                int n = A.length;
                int B[] = new int[n];

                for (int i = 0; i < n; i++)
                {
                    B[i] = Integer.parseInt(A[i]);
                }

                for (int i = 0; i < n; i++)
                {
                    for (int j = i + 1; j < n; j++)


                        if (B[i] > B[j]) {
                            int temp = B[i];
                            B[i] = B[j];
                            B[j] = temp;
                        }

                }
                String j = "{";
                for (int k = 0; k < n; k++)
                {
                    j= j+B[k]+",";
                }

                Text.setText(j+"}");

            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
