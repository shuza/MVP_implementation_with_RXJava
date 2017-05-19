package com.nybsys.shuza.topmoviemvp.http;

import com.nybsys.shuza.topmoviemvp.http.apimodel.OmdbApi;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Shuza on 10-May-17.
 */

public interface MoreInfoApiService {

    @GET("/")
    Observable<OmdbApi> getCountry(@Query("t") String title);
}
