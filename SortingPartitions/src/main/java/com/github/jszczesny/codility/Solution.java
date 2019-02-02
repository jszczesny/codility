package com.github.jszczesny.codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] A){

        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        int count = 0;
        while(list.size()>0){
            int min = list.stream().mapToInt(i->i).min().getAsInt();
            list.subList(0, list.indexOf(min)+1).clear();
            count++;
        }
        return count;
    }
}
