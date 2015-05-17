package com.manusantana.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Manu_Santana on 16/5/15.
 */
public class ColorWheel {

    //Member variable (properties about the objects)
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
             };


    //Method (abilities: thinks the object can do)
    public int getColor() {


        String color = "";

        //Esto es un array y cada línea representa un número y un orden.

        //Random select fact.
        Random randomGenerator = new Random(); //Construye un generador de numeros nuevos
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}

