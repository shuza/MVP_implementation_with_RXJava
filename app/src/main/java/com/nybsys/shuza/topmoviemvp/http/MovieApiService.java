package com.nybsys.shuza.topmoviemvp.http;

import com.nybsys.shuza.topmoviemvp.http.apimodel.TopRated;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Shuza on 10-May-17.
 */

public interface MovieApiService {

    @GET("top_rated")
    Observable<TopRated> getTopRatedMovies(@Query("page") Integer page);

}
