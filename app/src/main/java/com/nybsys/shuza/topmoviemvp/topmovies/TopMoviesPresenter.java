package com.nybsys.shuza.topmoviemvp.topmovies;

/**
 * Created by Shuza on 19-May-17.
 */

public class TopMoviesPresenter implements TopMoviesActivityMVP.Presenter {
    private TopMoviesActivityMVP.Model model;

    public TopMoviesPresenter(TopMoviesActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(TopMoviesActivityMVP.View view) {

    }

    @Override
    public void loadData() {

    }

    @Override
    public void rxUnsubscribe() {

    }
}
