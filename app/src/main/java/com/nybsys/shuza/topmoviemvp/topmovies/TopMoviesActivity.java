package com.nybsys.shuza.topmoviemvp.topmovies;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.nybsys.shuza.topmoviemvp.R;
import com.nybsys.shuza.topmoviemvp.root.App;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopMoviesActivity extends AppCompatActivity implements TopMoviesActivityMVP.View {
    private final String TAG = TopMoviesActivity.class.getSimpleName();

    @BindView(R.id.rvMovieList)
    RecyclerView recyclerView;

    @BindView(R.id.listActivity_rootView)
    ViewGroup rootView;

    @Inject
    TopMoviesActivityMVP.Presenter presenter;

    private MovieListAdapter adapter;
    private ArrayList<ViewModel> movieList = new ArrayList<ViewModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        ButterKnife.bind(this);

        adapter = new MovieListAdapter(movieList);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this));

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.setView(this);
        presenter.loadData();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.rxUnsubscribe();
        movieList.clear();
        adapter.notifyDataSetChanged();
    }

    @Override
    public void updateData(ViewModel viewModel) {
        movieList.add(viewModel);
        if (movieList.isEmpty()) {
            adapter.notifyItemInserted(0);
        } else {
            adapter.notifyItemInserted(movieList.size() - 1);
        }
    }

    @Override
    public void showSnackbar(String s) {
        Snackbar.make(rootView, s, Snackbar.LENGTH_SHORT).show();
    }
}
