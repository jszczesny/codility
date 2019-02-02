package com.github.jszczesny.codility;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;

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
                () -> assertEquals(4, solution.solution(new int[]{2,-2,3,0,4,-7})),
                () -> assertEquals(4, solution.solution(new int[]{-1,0,3,-2,1,0,1})),
                () -> assertEquals(-1, solution.solution(new int[]{0,0,0,0,0,0,0,0,0,0})),
                () -> assertEquals(0, solution.solution(new int[]{-1,-1,-1,-1,-1,-1,-1})),
                () -> assertEquals(6, solution.solution(new int[]{3,4,-7,3,1,3,1,-4,-2,-2})),
                () -> assertEquals(6, solution.solution(new int[]{0,0,0,1})),
                () -> {
                    int[] ints = Collections.nCopies(0, 1000000).stream().mapToInt(i->i).toArray();
                    assertEquals(-1, solution.solution(ints));
                }
        );
    }
}