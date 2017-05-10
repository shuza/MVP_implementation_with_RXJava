package com.nybsys.shuza.topmoviemvp.root;

import android.app.Application;

/**
 * Created by Shuza on 10-May-17.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
