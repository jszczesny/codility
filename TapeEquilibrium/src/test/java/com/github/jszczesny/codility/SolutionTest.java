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
                ()->assertEquals(1, solution.solution(new int[]{3,1,2,4,3})),
                ()->assertEquals(0, solution.solution(new int[]{1,1})),
                ()->assertEquals(0, solution.solution(new int[]{1000,100,200,200,500}))
        );
    }
}