package com.enrique.apprater;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;

import com.enrique.mymodule.app.R;

public class AppRater {
    private final static String APP_TITLE = "YOUR-APP-NAME";
    private final static String APP_PNAME = "YOUR-PACKAGE-NAME";

    private final static String APP_RATER    = "apprater";
    private final static String DONT_SHOW    = "dontshowagain";
    private final static String LAUNCH_COUNT = "launch_count";
    private final static String FIRST_LAUNCH = "date_firstlaunch";

    private static int DAYS_UNTIL_PROMPT     = 0;
    private static int LAUNCHES_UNTIL_PROMPT = 0;

    private static Context mContext;

    public static void init(Context context) {
        mContext = context;
        SharedPreferences prefs = mContext.getSharedPreferences(APP_RATER, 0);
        if (prefs.getBoolean(DONT_SHOW, false)) { return ; }

        SharedPreferences.Editor editor = prefs.edit();
        long launch_count = prefs.getLong(LAUNCH_COUNT, 0) + 1;
        editor.putLong(LAUNCH_COUNT, launch_count);

        Long date_firstLaunch = prefs.getLong(FIRST_LAUNCH, 0);
        if (date_firstLaunch == 0) {
            date_firstLaunch = System.currentTimeMillis();
            editor.putLong(FIRST_LAUNCH, date_firstLaunch);
        }

        if (launch_count >= LAUNCHES_UNTIL_PROMPT) {
            if (System.currentTimeMillis() >= date_firstLaunch +
                    (DAYS_UNTIL_PROMPT * 24 * 60 * 60 * 1000)) {
                showRateDialog(mContext, editor);
            }
        }
        editor.commit();
    }

    public static void showRateDialog(final Context mContext, final SharedPreferences.Editor editor) {

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setMessage(mContext.getString(R.string.dialog_text,APP_PNAME));
        builder.setTitle(mContext.getResources().getString(R.string.rate) +" "+ APP_TITLE);
        builder.setNegativeButton(mContext.getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });

        builder.setNeutralButton(mContext.getResources().getString(R.string.dontask), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                if (editor != null) {
                    editor.putBoolean(DONT_SHOW, true);
                    editor.commit();
                }
                dialog.dismiss();
            }
        });

        builder.setPositiveButton(mContext.getResources().getString(R.string.rate), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                mContext.startActivity(new Intent(Intent.ACTION_VIEW, Uri
                        .parse("market://details?id=" + APP_PNAME)));
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public static void setMinDays(int minDays) {
        DAYS_UNTIL_PROMPT = minDays;
    }

    public static void setMinLaunches(int minLaunches) {
        LAUNCHES_UNTIL_PROMPT = minLaunches;
    }

}