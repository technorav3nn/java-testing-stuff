package com.bruhman.testingstuff;

import java.util.Arrays;

public class Test {
    public static String[] strArray(String str) {
        try {
            return new String[]{String.join(" ", str)};
        } catch (Exception e) {
            System.out.println(Arrays.toString(
                    new String[] { e.toString() })
            );
        }
        return new String[] {"There was an error"};
    }
}
