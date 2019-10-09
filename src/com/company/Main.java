package com.company;

import com.company.arrays.Array;

public class Main {

    public static void main(String[] args) {
        int aM[] = {1,2,3,4,5};
        Array obj = new Array( aM );
        System.out.println( obj.findMaxElem());
    }
}
