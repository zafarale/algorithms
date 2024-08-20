package com.github.zafarale.algorithms.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class SearchTest {

    @ParameterizedTest
    @MethodSource("intArrayProvider")
    public void linearPositiveSearchTest(int[] array){
        int value = 4;
        int index = Searcher.searchValueInArray(array, value);
        Assertions.assertEquals(value, array[index]);
    }


    @ParameterizedTest
    @MethodSource("intNegativeArrayProvider")
    public void linearNegativeSearchTest(int[] array){
        int value = 4;
        int index = Searcher.searchValueInArray(array, value);
        Assertions.assertEquals(-1, index);

    }

    protected static Stream<int[]> intArrayProvider(){
        return Stream.of(new int[]{1,2,3,4,5}
                        , new int[]{5,4,3,2,1}
                        , new int[]{1,5,4,3,2}
        );
    }

    protected static Stream<int[]> intNegativeArrayProvider(){
        return Stream.of(new int[]{0,5}, new int[]{}
        );
    }
}
