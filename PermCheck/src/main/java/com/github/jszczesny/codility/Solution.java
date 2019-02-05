package com.github.jszczesny.codility;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A){
        int[] tmp = new int[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]>A.length)
                return 0;
            tmp[A[i]-1]=1;
        }
        return Arrays.stream(tmp).allMatch(i->i==1)?1:0;
    }
}
