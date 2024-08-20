package com.github.zafarale.algorithms.search;

public class Searcher {

    public static int searchValueInArray(int[] array, int value) {

        // Going through array sequentially
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }


}
