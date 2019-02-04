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
                ()->assertEquals(1, solution.solution(new int[]{2})),
                ()->assertEquals(4, solution.solution(new int[]{2,3,1,5})),
                ()->assertEquals(5, solution.solution(new int[]{2,3,1,4})),
                ()->assertEquals(1, solution.solution(new int[]{2,3,4,5})),
                ()-> {
                    RandomArrayObject randomArrayObject = new RandomArrayObject();
                    randomArrayObject.generateArray(100000);
                    assertEquals(randomArrayObject.missingValue,solution.solution(randomArrayObject.array));
                }

        );
    }

    private class RandomArrayObject{

        private int[] array;
        private int missingValue;

        public void generateArray(int size){
            List<Integer> list = IntStream.range(1, size+1).boxed().collect(Collectors.toList());
            Collections.shuffle(list);
            this.missingValue = new Random().nextInt(size+1);
            list.remove(Integer.valueOf(this.missingValue));
            this.array = list.stream().mapToInt(i->i).toArray();
        }

        public int[] getArray(){
            return this.array;
        }

        public int getMissingValue(){
            return this.missingValue;
        }
    }
}