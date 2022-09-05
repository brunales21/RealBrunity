package com.RealBrunity;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    String windowName = "RealBrunity";
    int width = 1000;
    int height = 600;
    int xLocation = 400;
    int yLocation = 200;
    Window() {
        this.setSize(width, height);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(windowName);
    }

}
