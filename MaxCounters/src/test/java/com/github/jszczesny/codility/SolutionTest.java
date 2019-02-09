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
        assertArrayEquals(new int[]{3,2,2,4,2}, solution.solution(5, new int[]{3,4,4,6,1,4,4}));
    }
}