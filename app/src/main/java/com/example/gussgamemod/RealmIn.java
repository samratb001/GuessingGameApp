package com.example.gussgamemod;

import android.app.Application;
import io.realm.Realm;


public class RealmIn extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
