package com.mytest.app; // Add this line at the top!

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }
    // ... rest of your merge method
}
