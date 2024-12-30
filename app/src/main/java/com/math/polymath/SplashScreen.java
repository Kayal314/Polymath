package com.math.polymath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        HomeScreen homeScreen=new HomeScreen();
        homeScreen.start();
    }
    private class HomeScreen extends Thread{
        public void run()
        {
            try{
                LinearLayout l=findViewById(R.id.splash_layout);
                l.startAnimation(AnimationUtils.loadAnimation(getBaseContext(), R.anim.fade_in));
                sleep(2000);
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
            Intent intent=new Intent(SplashScreen.this,MainActivity.class);
            startActivity(intent);
            SplashScreen.this.finish();
        }
    }
}