package com.company.arrays;

public class Array {
    private int array[];
    private int max;

    //  конструктор
    public Array( int array[] ) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int findMaxElem() {
        max = array[0];
        for (int i = 1; i <= array.length ; i++) {
            if ( array[i-1] > max ) {
                 max =  array[i-1];
            }

        }
        return max;
    }
}
