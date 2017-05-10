package com.nybsys.shuza.topmoviemvp.topmovies;

/**
 * Created by Shuza on 10-May-17.
 */

public class ViewModel {

    private String country;
    private String name;

    public ViewModel(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
