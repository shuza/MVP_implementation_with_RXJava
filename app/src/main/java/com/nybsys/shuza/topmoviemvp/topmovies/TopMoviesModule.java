package com.nybsys.shuza.topmoviemvp.topmovies;

import com.nybsys.shuza.topmoviemvp.http.MoreInfoApiService;
import com.nybsys.shuza.topmoviemvp.http.MovieApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shuza on 19-May-17.
 */

@Module
public class TopMoviesModule {

    @Provides
    public TopMoviesActivityMVP.Presenter provideTopMovieActivityPresenter(TopMoviesActivityMVP.Model model) {
        return new TopMoviesPresenter(model);
    }

    @Provides
    public TopMoviesActivityMVP.Model provideTopMoviesActivityModel(Repository repository) {
        return new TopMoviesActivityModel(repository);
    }

    @Singleton
    @Provides
    public Repository provideRepository(MovieApiService movieApiService, MoreInfoApiService moreInfoApiService) {
        return new TopMoviesRepository(movieApiService, moreInfoApiService);
    }

}
