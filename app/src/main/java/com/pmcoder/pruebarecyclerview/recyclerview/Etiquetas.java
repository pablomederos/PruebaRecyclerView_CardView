package com.pmcoder.pruebarecyclerview.recyclerview;

/**
 * Created by Pablo on 12/12/2016.
 */

public class Etiquetas {

    private String img;
    private String nombreImg;

    public Etiquetas(String img, String nombreImg) {
        this.img = img;
        this.nombreImg = nombreImg;
    }

    public String getImg() {return img;}

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombreImg() {
        return nombreImg;
    }

    public void setNombreImg(String nombreImg) {
        this.nombreImg = nombreImg;
    }
}
