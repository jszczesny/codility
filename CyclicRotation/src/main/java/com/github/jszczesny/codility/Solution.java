package com.github.jszczesny.codility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[] A, int K){
        LinkedList<Integer> list = new LinkedList<>(
                Arrays.stream(A)
                        .boxed()
                        .collect(Collectors.toList()));
        while(K>0) {
            list.addFirst(list.pollLast());
            K--;
        }
        return list.stream()
                .mapToInt(i->i)
                .toArray();
    }
}
