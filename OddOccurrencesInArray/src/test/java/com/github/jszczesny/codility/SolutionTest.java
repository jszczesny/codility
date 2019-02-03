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
                ()->assertEquals(0, solution.solution(new int[]{1,2,3,4,5,0,5,4,3,2,1})),
                ()->assertEquals(1, solution.solution(new int[]{1})),
                ()->assertEquals(2, solution.solution(new int[]{1,1,2})),
                ()->assertEquals(4, solution.solution(new int[]{1,1,2,2,3,3,4,5,5}))
        );
    }
}