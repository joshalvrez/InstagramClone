package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("w0jjJBBwQxvaiYNAsluOINj4kMtQL18WLxoGtMPQ")
                .clientKey("hk126YoHp5Iu8CvDglSHPnRG42aKJzUVscpsfNE3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
