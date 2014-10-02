package demo.apprate.enrique.com.appratedemo;

import android.app.Activity;
import android.os.Bundle;

import com.enrique.apprater.AppRater;

public class AppRateDemo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new AppRater(this)
                .setMinDays(0)
                .setMinLaunches(0)
                .setAppTitle("My Title")
                .init();


    }

}
