package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class starting_screen extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_starting_screen);
        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Animation myani = AnimationUtils.loadAnimation(this, R.anim.transition);
        tv.startAnimation(myani);
        iv.startAnimation(myani);
        final Intent i = new Intent(this, MainActivity.class);
        Thread timer = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep (5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    startActivity(i);
                    finish();
                }
            }

        };
        timer.start();
    }

};

