package com.github.jszczesny.codility;

import java.util.Arrays;

public class Solution {

    public int[] solution(int N, int[] A){
        int[] counters = new int[N];
        for(int i=0;i<A.length;i++) {
            int v = A[i];
            if (v > N)
                Arrays.fill(counters,Arrays.stream(counters).max().getAsInt());
            else
                counters[v-1]++;
        }
        return counters;
    }
}
