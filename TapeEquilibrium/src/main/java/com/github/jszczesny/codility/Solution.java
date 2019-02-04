package com.github.jszczesny.codility;

public class Solution {

    public int solution(int[] A){
        int[] sum = new int[A.length];
        sum[0]=A[0];
        for(int i=1; i<A.length;i++)
            sum[i]=sum[i-1]+A[i];

        int result=Integer.MAX_VALUE;
        for(int p=1;p<A.length;p++){
            int tmp=Math.abs(sum[A.length-1]-2*sum[p-1]);
            result=tmp<result?tmp:result;
        }
        return result;
    }
}
