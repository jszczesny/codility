package com.github.jszczesny.codility;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
                ()->assertEquals(0, solution.solution(new int[]{1,2,3,4,5,7})),
                ()->assertEquals(1, solution.solution(new int[]{1,2,3,4,5,6})),
                ()->assertEquals(1, solution.solution(new int[]{1})),
                ()->assertEquals(0, solution.solution(new int[]{9})),
                ()->assertEquals(1, solution.solution(new int[]{4,1,3,2})),
                ()->assertEquals(1, solution.solution(this.getShuffledList(true))),
                ()->assertEquals(0, solution.solution(this.getShuffledList(false)))
        );
    }

    private int[] getShuffledList(boolean isPermutation){
        List<Integer> list = IntStream.range(1, 100001).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        if(!isPermutation)
            list.remove(new Random().nextInt(100000));
        return list.stream().mapToInt(i->i).toArray();
    }
}