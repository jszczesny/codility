package com.github.jszczesny.codility;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Solution solution;

    @BeforeAll
    static void setUp(){
        solution = new Solution();
    }

    @Test
    void solution() {
        assertAll(
                ()->assertEquals(5, solution.solution(new int[]{1,3,6,4,1,2})),
                ()->assertEquals(4, solution.solution(new int[]{1,2,3,5})),
                ()->assertEquals(4, solution.solution(new int[]{1,2,3})),
                ()->assertEquals(1, solution.solution(new int[]{-1,-3})),
                ()->assertEquals(100000,solution.solution(getArray(100000)))
        );
    }

    private int[] getArray(int max){
        List<Integer> list = IntStream.range(1, max).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}