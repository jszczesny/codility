package com.github.jszczesny.codility;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A){
        if(Arrays.stream(A).filter(i->i==0).count()==A.length)
            return -1;

        int counter = 0;
        for(int start=0;start<A.length;start++){
            int sum = 0;
            for(int stop=start;stop<A.length;stop++){
                sum+=A[stop];
                if (sum == 0)
                    counter++;
            }
        }
        return counter;
    }
}
