package com.nybsys.shuza.topmoviemvp.topmovies;

import com.nybsys.shuza.topmoviemvp.http.apimodel.Result;
import rx.Observable;
import rx.functions.Func2;

/**
 * Created by Shuza on 19-May-17.
 */

public class TopMoviesActivityModel implements TopMoviesActivityMVP.Model {
    private Repository repository;

    public TopMoviesActivityModel(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<ViewModel> result() {
        return Observable.zip(repository.getResultData(), repository.getCountryData(), new Func2<Result, String, ViewModel>() {
            @Override
            public ViewModel call(Result result, String s) {
                return new ViewModel(result.title,s);
            }
        });
    }
}
