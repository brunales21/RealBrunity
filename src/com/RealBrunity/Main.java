package com.RealBrunity;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        Object cube = new Object();

        cube.transform.position = new Vector(3, 3);
        cube.transform.scale = new Vector(200, 200);

        Window w = new Window(); //Instancio una ventana
        w.setVisible(true); //La muestro

    }
}