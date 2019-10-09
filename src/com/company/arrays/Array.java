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
    public void ASort() {
        int nElem;
        for (int j = 1; j <= array.length ; j++) {
            for (int i = 1; i <= array.length - 1 ; i++) {
                if ( array[ (i - 1) ] < array[ (i - 1) + 1 ]) {
                    // меняем местами
                    nElem = array[ (i - 1) ];
                    array[ (i - 1) ] = array[ (i - 1) + 1 ];
                    array[ (i - 1) + 1 ] = nElem;
                }//endif
            }//next i
        }//next j
     }
    public void ASort1() {
        int nElem;
        for (int j = 1; j <= array.length ; j++) {
            for (int i = 0; i < (array.length - 1) ; i++) {
                if ( array[ i ] < array[ i + 1 ] ) {
                    // меняем местами
                    nElem = array[ i ];
                    array[ i ] = array[ i + 1 ];
                    array[ i + 1 ] = nElem;
                }//endif
            }//next i
        }//next j
    }
}
