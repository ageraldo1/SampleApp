package com.example.alexandre.sampleapp;

/**
 * Created by Alexandre on 1/9/2018.
 */

public class Number {

    private int number;

    public Number( int n) {
        this.number = n;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public boolean isTriangular() {
        boolean retFunc = false;

        int triangularNumber = 0;

        for ( int i = 0; i <= getNumber(); i++ ) {
            triangularNumber = ((i * (i+1))/2);

            if ( triangularNumber == getNumber()) {
                retFunc = true;
                break;
            }
        }

        return retFunc;
    }

    public boolean isPerfectSquare() {
        int sqrt = (int) Math.sqrt(getNumber());

        if ( sqrt * sqrt == getNumber()) {
            return true;
        } else {
            return false;
        }
    }

}
