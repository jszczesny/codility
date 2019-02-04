package com.github.jszczesny.codility;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] A){
        int[] tmp = new int[A.length+1];
        int i=0;
        while(i<A.length)
            tmp[A[i++]-1]=1;
        return Arrays.stream(tmp).boxed().collect(Collectors.toList()).indexOf(0)+1;
    }
}
