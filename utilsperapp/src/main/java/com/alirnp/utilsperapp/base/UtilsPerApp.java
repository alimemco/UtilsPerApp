package com.alirnp.utilsperapp.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.util.Log;

import androidx.appcompat.app.AppCompatDelegate;

public class UtilsPerApp {

    private static final String TAG = "UtilsPerApp";


    public static void log(Class cls, String txt) {
        Log.i(TAG, cls.getName() + " | " + txt);
    }

    public static void config() {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }


    public static boolean isConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm != null)
            return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
        else
            return false;
    }


    public static boolean isInteger(String number) {
        try {
            Integer.parseInt(number);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static class Converter {

        public static int pxToDp(int px) {
            return (int) (px / Resources.getSystem().getDisplayMetrics().density);
        }

        public static int dpToPx(int dp) {
            return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
        }

        public static float dpToPxFloat(float dp) {
            return dp * Resources.getSystem().getDisplayMetrics().density;
        }
    }


    public static class Font {

        private static Typeface iranSans;
        private static Typeface iranSansBold;
        private static Typeface bykan;


        public static Typeface getIranSans(Context context) {
            if (iranSans == null) {
                iranSans = Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMobile.ttf");
            }
            return iranSans;
        }


        public static Typeface getIranSansBold(Context context) {
            if (iranSansBold == null) {
                iranSansBold = Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMobile_Bold.ttf");

            }
            return iranSansBold;
        }

        public static Typeface getBYekan(Context context) {
            if (bykan == null) {
                bykan = Typeface.createFromAsset(context.getAssets(), "fonts/Yekan.ttf");
            }
            return bykan;
        }

    }


}
