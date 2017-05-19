package com.nybsys.shuza.topmoviemvp.topmovies;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nybsys.shuza.topmoviemvp.R;

import java.util.ArrayList;

/**
 * Created by Shuza on 19-May-17.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.ItemViewHolder> {
    private ArrayList<ViewModel> movieList;

    public MovieListAdapter(ArrayList<ViewModel> movieList) {
        this.movieList = movieList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.tvName.setText(movieList.get(position).getName());
        holder.tvCountry.setText(movieList.get(position).getCountry());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public TextView tvCountry;

        public ItemViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tvMovieName);
            tvCountry = (TextView) itemView.findViewById(R.id.tvMovieCountry);
        }
    }
}
