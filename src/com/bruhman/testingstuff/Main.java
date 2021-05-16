package com.bruhman.testingstuff;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arr = new String[] {"value 1", "also a value", "too also a value"};
        String[] a = Test.strArray(Arrays.toString(arr));
        System.out.println(Arrays.toString(a));
    }
}