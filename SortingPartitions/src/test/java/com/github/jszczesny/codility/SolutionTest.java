package com.github.jszczesny.codility;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("Running SolutionTest class tests")
class SolutionTest {

    private static Solution solution;

    @BeforeAll
    private static void setUp(){
        solution = new Solution();
    }

    @Test
    @DisplayName("many assertions test")
    void solution(){
        assertAll(
                () -> assertEquals(3, solution.solution(new int[]{2,4,1,6,5,9,7})),
                () -> assertEquals(1, solution.solution(new int[]{4,3,2,6,1})),
                () -> assertEquals(1, solution.solution(new int[]{0})),
                () -> assertEquals(5, solution.solution(new int[]{-1,-1,-1,-1,-1}))
        );
    }

}