package com.nybsys.shuza.topmoviemvp.root;

import com.nybsys.shuza.topmoviemvp.topmovies.TopMoviesActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Shuza on 10-May-17.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);
}
