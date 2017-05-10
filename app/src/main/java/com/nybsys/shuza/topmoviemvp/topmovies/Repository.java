package com.nybsys.shuza.topmoviemvp.topmovies;

import javax.xml.transform.Result;

import rx.Observable;

/**
 * Created by Shuza on 10-May-17.
 */

public interface Repository {

    Observable<Result> getResultsFromMemory();

    Observable<Result> getResultsFromNetwork();

    Observable<String> getCountriesFromMemory();

    Observable<String> getCountriesFromNetwork();

    Observable<String> getCountryData();

    Observable<Result> getResultData();

}
