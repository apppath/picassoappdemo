package com.example.basicprogramming.picassoappdemo.model;

import java.util.ArrayList;

public class ImagesData {

    public static Images images;
    public static ArrayList<Images> imagesArrayList;

    public static ArrayList<Images> setMovieData() {

        imagesArrayList = new ArrayList<>();

        images = new Images("Avengers",
                "http://imagizer.imageshack.us/a/img921/5180/7hAeJE.jpg");
        imagesArrayList.add(images);
        images = new Images("Tomb Raider",
                "http://imagizer.imageshack.us/a/img924/5291/UCIHD7.jpg");
        imagesArrayList.add(images);
        images = new Images("Jurassic World",
                "http://imagizer.imageshack.us/a/img924/3383/8XKZ3w.jpg");
        imagesArrayList.add(images);
        images = new Images("Aqua Man",
                "http://imagizer.imageshack.us/a/img921/871/1p4Wu8.jpg");
        imagesArrayList.add(images);
        images = new Images("Rampage",
                "http://imagizer.imageshack.us/a/img924/2996/AgXYAe.jpg");
        imagesArrayList.add(images);
        images = new Images("Black Panther",
                "http://imagizer.imageshack.us/a/img921/1728/pvgE5Y.jpg");
        imagesArrayList.add(images);
        images = new Images("Fall Out",
                "http://imagizer.imageshack.us/a/img923/8599/10eqwW.jpg");
        imagesArrayList.add(images);
        images = new Images("Skyscraper",
                "http://imagizer.imageshack.us/a/img924/4840/oVQxeT.jpg");
        imagesArrayList.add(images);
        images = new Images("Ant Man",
                "http://imagizer.imageshack.us/a/img922/7827/fmGCRt.jpg");
        imagesArrayList.add(images);

        return imagesArrayList;
    }
}
