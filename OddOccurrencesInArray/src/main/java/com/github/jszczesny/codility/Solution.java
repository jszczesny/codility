package com.github.jszczesny.codility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] A){
        LinkedList<Integer> list = new LinkedList<>(Arrays.stream(A).boxed().collect(Collectors.toList()));
        while(list.size()>0){
            int i = list.pollFirst();
            if(list.contains(i))
                list.remove(Integer.valueOf(i));
            else
                return i;
        }
        return -1;
    }
}
