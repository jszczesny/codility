package com.github.jszczesny.codility;

import java.util.HashSet;

class Solution {

    public int solution(int X, int[] A){
        HashSet<Integer> set = new HashSet<>();
        int i =0;
        while(set.size()<X && i<A.length){
            if(A[i]<=X)
                set.add(A[i]);
            i++;
        }
        return set.size()==X?i-1:-1;
    }
}