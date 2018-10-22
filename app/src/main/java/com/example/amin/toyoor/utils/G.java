package com.example.amin.toyoor.utils;

import android.app.Application;

import com.example.amin.toyoor.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by lenovo on 6/2/2018.
 */

public class G extends Application {


     @Override
     public void onCreate() {
          super.onCreate();
          CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                  .setDefaultFontPath("IRANSansMobileBold.ttf")
                  .setFontAttrId(R.attr.fontPath)
                  .build()
          );
     }


}
