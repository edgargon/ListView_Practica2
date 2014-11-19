package com.example.edgargonzalez.listview_practica2;

import android.graphics.drawable.Drawable;

/**
 * Created by EdgarGonzalez on 16/11/14.
 */
public class ListItem {
    //Variable
    private String Empresa = null;
    private String Giro = null;

    public Drawable getImageUser() {
        return imageUser;
    }

    public void setImageUser(Drawable imageUser) {
        this.imageUser = imageUser;
    }

    private Drawable imageUser = null;


    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getGiro() {
        return Giro;
    }

    public void setGiro(String giro) {
        Giro = giro;
    }

}

