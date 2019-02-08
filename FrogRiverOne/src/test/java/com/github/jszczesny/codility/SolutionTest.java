package com.github.jszczesny.codility;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
                ()->assertEquals(6, solution.solution(5, new int[]{1,3,1,4,2,3,5,4})),
                ()->assertEquals(-1, solution.solution(2, new int[]{1,1,1,1,1,1,1,1})),
                ()->assertEquals(4, solution.solution(5, new int[]{1,2,3,4,5,4,3,2,1})),
                ()->assertEquals(8, solution.solution(5, new int[]{1,2,3,4,4,3,2,1,5})),
                ()->assertEquals(-1, solution.solution(5, new int[]{1,2,3,4,4,3,2,1,6}))
        );


    }
}