package com.RealBrunity;

public class Vector {
    int x;
    int y;
    static final Vector zero = new Vector(0, 0);
    static final Vector up = new Vector(0, 1);
    static final Vector right = new Vector(1, 0);

    Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
