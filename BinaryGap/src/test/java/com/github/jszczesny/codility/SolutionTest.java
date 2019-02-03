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
    void solutionTest() {
        assertAll(
                ()->assertEquals(5, solution.solution(1041)),
                ()->assertEquals(0, solution.solution(32)),
                ()->assertEquals(0, solution.solution(8)),
                ()->assertEquals(0, solution.solution(1)),
                ()->assertEquals(0, solution.solution(0)),
                ()->assertEquals(5, solution.solution(2147482647)),
                ()->assertEquals(0, solution.solution(2147483647))
        );
    }
}