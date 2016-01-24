package vienan.app.datetimepicker;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by vienan on 2016/1/24.
 */
public class DeviceConfig {

    public static int screenWidth;
    public static int  screenHeight;
    public static float screenDensity;

    /**
     * 设置屏幕宽高及密度
     */
    public static void setScreenWidthAndHeight(Context context){
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        screenWidth  = dm.widthPixels;
        screenHeight = dm.heightPixels;
        screenDensity = dm.density;
    }

    public float getScreenDensity() {
        return screenDensity;
    }

    public static int getScreenWidth() {
        return screenWidth;
    }

    public static int getScreenHeight() {
        return screenHeight;
    }

}