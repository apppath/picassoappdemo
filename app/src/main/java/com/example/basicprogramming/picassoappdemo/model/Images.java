package com.example.basicprogramming.picassoappdemo.model;

public class Images {

    private String movieName;
    private String imageUrl;

    public Images(String movieName, String imageUrl) {
        this.movieName = movieName;
        this.imageUrl = imageUrl;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
