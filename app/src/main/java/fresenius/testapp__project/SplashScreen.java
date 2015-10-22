package fresenius.testapp__project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

/**
 * Created by snoopy235 on 21.10.2015.
 */
public class SplashScreen extends ActionBarActivity {

    private static final String TAG = "buckysMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Log.i(TAG, "onCreate");

        Thread mythread = new Thread() {

            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent in = new Intent(SplashScreen.this, MainActivity.class);
//                    Intent in = new Intent("android.intent.action.RUN");
                    startActivity(in);
                }
            }
        };
        mythread.start();
    } // End Oncreate

    @Override
    protected void onPause() {
        finish();
    }
}
