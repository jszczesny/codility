package com.github.jszczesny.codility;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private static Solution solution;

    @BeforeAll
    static void setUp(){
        solution = new Solution();
    }

    @Test
    void solution() {
        assertAll(
                ()->assertEquals(3, solution.solution(10, 85, 30)),
                ()->assertEquals(2, solution.solution(10, 70, 30)),
                ()->assertEquals(1, solution.solution(0, 29, 30)),
                ()->assertEquals(0, solution.solution(10, 10, 100))
        );
    }
}