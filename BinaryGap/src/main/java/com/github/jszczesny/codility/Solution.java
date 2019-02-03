package com.github.jszczesny.codility;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int N){
        List<Integer> list = Integer.toBinaryString(N).chars().
                map(i-> {return Character.getNumericValue(i);}).
                boxed().
                collect(Collectors.toList());
        int counter = 0;
        while(list.contains(1)){
            list.subList(0, list.indexOf(1)+1).clear();
            int tmp = list.contains(1)?list.indexOf(1):0;
            counter = tmp>counter?tmp:counter;
        }
        return counter;
    }
}
