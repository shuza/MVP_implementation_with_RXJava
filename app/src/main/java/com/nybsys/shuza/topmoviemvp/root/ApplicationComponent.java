package com.nybsys.shuza.topmoviemvp.root;

import com.nybsys.shuza.topmoviemvp.http.ApiModuleForInfo;
import com.nybsys.shuza.topmoviemvp.http.ApiModuleForName;
import com.nybsys.shuza.topmoviemvp.topmovies.TopMoviesModule;
import com.nybsys.shuza.topmoviemvp.topmovies.TopMoviesActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Shuza on 10-May-17.
 */

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForInfo.class, ApiModuleForName.class, TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);
}
