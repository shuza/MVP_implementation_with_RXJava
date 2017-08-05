package com.nybsys.shuza.topmoviemvp.root;

import android.app.Application;

import com.nybsys.shuza.topmoviemvp.http.ApiModuleForInfo;
import com.nybsys.shuza.topmoviemvp.http.ApiModuleForName;
import com.nybsys.shuza.topmoviemvp.topmovies.TopMoviesModule;

/**
 * Created by Shuza on 10-May-17.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .topMoviesModule(new TopMoviesModule())
                .apiModuleForInfo(new ApiModuleForInfo())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
