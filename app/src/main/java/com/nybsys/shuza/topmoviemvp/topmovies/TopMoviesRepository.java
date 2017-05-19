package com.nybsys.shuza.topmoviemvp.topmovies;

import com.nybsys.shuza.topmoviemvp.http.MoreInfoApiService;
import com.nybsys.shuza.topmoviemvp.http.MovieApiService;
import com.nybsys.shuza.topmoviemvp.http.apimodel.Result;

import rx.Observable;

/**
 * Created by Shuza on 19-May-17.
 */

public class TopMoviesRepository implements Repository {
    private MovieApiService movieApiService;
    private MoreInfoApiService moreInfoApiService;

    public TopMoviesRepository(MovieApiService movieApiService, MoreInfoApiService moreInfoApiService) {
        this.movieApiService = movieApiService;
        this.moreInfoApiService = moreInfoApiService;
    }

    @Override
    public Observable<Result> getResultsFromMemory() {
        return null;
    }

    @Override
    public Observable<Result> getResultsFromNetwork() {
        return null;
    }

    @Override
    public Observable<String> getCountriesFromMemory() {
        return null;
    }

    @Override
    public Observable<String> getCountriesFromNetwork() {
        return null;
    }

    @Override
    public Observable<String> getCountryData() {
        return null;
    }

    @Override
    public Observable<Result> getResultData() {
        return null;
    }
}
