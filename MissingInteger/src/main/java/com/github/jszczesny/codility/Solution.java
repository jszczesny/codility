package com.github.jszczesny.codility;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] A){
        List<Integer> aList = Arrays.stream(A).filter(i->i>0).distinct().boxed().collect(Collectors.toList());
        if(aList.size()==0)
            return 1;
        Iterator<Integer> it = aList.iterator();
        int max= aList.stream().mapToInt(i->i).max().getAsInt();
        int[] tmp = new int[max+1];
        tmp[0]=1;
        while(it.hasNext()) {
            tmp[it.next()]=1;
        }
        int index = Arrays.stream(tmp).boxed().collect(Collectors.toList()).indexOf(Integer.valueOf(0));
        return index==-1?tmp.length:index;
    }
}
