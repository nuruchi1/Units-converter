package com.example.unitsconverter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.InputType;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

        private Button enter;
        private Button enter2;
        private Button reset;
        private EditText lbs;
        private EditText kg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter = findViewById(R.id.enter);
        enter2 = findViewById(R.id.enter2);
        reset = findViewById(R.id.reset);
        lbs = findViewById(R.id.lbs);
        kg = findViewById(R.id.kg);

        enter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                convertKgtoLbs();
                enter.setEnabled(false);
            }
        });

        enter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                convertLbsToKg();
                enter2.setEnabled(false);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    void convertLbsToKg()
    {
        EditText lbs=  findViewById(R.id.lbs);
        lbs.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText kg= findViewById(R.id.kg);
        kg.setInputType(InputType.TYPE_CLASS_NUMBER);
        double x = Integer.parseInt(lbs.getText().toString());
        double result = x/2.205;
        kg.setText(String.valueOf(result));
    }

    void convertKgtoLbs()
    {
        EditText lbs=  findViewById(R.id.lbs);
        lbs.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText kg= findViewById(R.id.kg);
        kg.setInputType(InputType.TYPE_CLASS_NUMBER);
        double x = Integer.parseInt(kg.getText().toString());
        double result = x*2.205;
        lbs.setText(String.valueOf(result));
    }


    public void reset(View view)
    {
        Button b1 = (Button) findViewById(R.id.enter);
        b1.setEnabled(true);
        Button b2 = (Button) findViewById(R.id.enter2);
        b2.setEnabled(true);
        EditText lbs = (EditText) findViewById(R.id.lbs);
        EditText kg = (EditText) findViewById(R.id.kg);
        lbs.setText("Pounds(lbs)");
        kg.setText("Kilograms(kg)");
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
