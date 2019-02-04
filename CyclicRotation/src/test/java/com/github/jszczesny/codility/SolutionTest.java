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
                ()->assertArrayEquals(new int[]{9,7,6,3,8}, solution.solution(new int[]{3,8,9,7,6}, 3)),
                ()->assertArrayEquals(new int[]{0,0,0}, solution.solution(new int[]{0,0,0}, 1)),
                ()->assertArrayEquals(new int[]{1,2,3,4}, solution.solution(new int[]{1,2,3,4}, 4)),
                ()->assertArrayEquals(new int[]{1}, solution.solution(new int[]{1}, 100))
        );
    }
}