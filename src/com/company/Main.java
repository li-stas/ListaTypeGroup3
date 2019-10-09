package com.company;

import com.company.arrays.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int aM[] = {1,2,3,4,5};
        String objStr = "";
        Array obj = new Array( aM );
        //System.out.println( obj.findMaxElem());
        objStr = Arrays.toString(obj.getArray());
        System.out.println( objStr );
        obj.ASort1();
        objStr = Arrays.toString(obj.getArray());
        System.out.println( objStr );
    }
}
