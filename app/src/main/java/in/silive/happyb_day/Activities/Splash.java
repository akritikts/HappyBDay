package in.silive.happyb_day.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import in.silive.happyb_day.R;

/**
 * Created by akriti on 13/7/16.
 */
public class Splash extends AppCompatActivity {
    Context context;
    RelativeLayout splash;
    //ImageView image;
    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        splash = (RelativeLayout) findViewById(R.id.splash);
        context = getApplicationContext();
        //image = (ImageView) findViewById(R.id.image);
        text = (TextView) findViewById(R.id.text);

        /*ViewAnimator
                .animate(text)
                .dp().translationX(-30, 0)
                .descelerate()
                .duration(3000)
                .start();*/
        checkConnection();
    }
    public void checkConnection() {
            Snackbar snackbar = Snackbar
                    .make(splash, " Happy Birthday Sir", Snackbar.LENGTH_LONG);
            snackbar.show();



            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 4000);




    }
}
