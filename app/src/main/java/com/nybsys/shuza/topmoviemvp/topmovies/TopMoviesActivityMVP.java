package com.nybsys.shuza.topmoviemvp.topmovies;

import rx.Observable;

/**
 * Created by Shuza on 10-May-17.
 */

public interface TopMoviesActivityMVP {

    interface View {
        void updateData(ViewModel viewModel);

        void showSnackbar(String s);
    }

    interface Presenter {
        void setView(TopMoviesActivityMVP.View view);

        void loadData();

        void rxUnsubscribe();
    }

    interface Model {
        Observable<ViewModel> result();
    }

}
