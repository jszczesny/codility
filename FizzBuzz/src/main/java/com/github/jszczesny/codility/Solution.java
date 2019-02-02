package com.github.jszczesny.codility;

import java.util.stream.IntStream;

public class Solution {

    public void getResult(){
        IntStream.range(1, 101).forEach(i-> {
            String result="";
            if(i%3==0 && i%5==0) result+="FizzBuzz";
            else if(i%3==0) result+="Fizz";
            else if(i%5==0) result+="Buzz";
            else result=String.valueOf(i);
            System.out.println(result);
        });
    }

}