package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MultiplicationTableTest {

    @Test
    public void should_return_single_expression_when_start_1_and_end_1() {
        // given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 1;
        int end = 1;


        // when
        String actualResult = multiplicationTable.create(start, end);

        // then
        String expectedResult = "1*1=1";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void should_return_null_when_start_2_greater_end_1() {
        // given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 1;

        // when
        String actualResult = multiplicationTable.create(start, end);

        // then
        assertNull(actualResult);
    }

    @Test
    public void should_return_two_lines_when_start_2_end_3() {
        // given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 3;

        // when
        String actualResult = multiplicationTable.create(start, end);

        // then
        String expectedResult = "2*2=4\n2*3=6\t3*3=9";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void should_return_mutiple_lines_when_start_2_end_5() {
        // given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 5;

        // when
        String actualResult = multiplicationTable.create(start, end);

        // then
        String expectedResult = "2*2=4\n" +
                "2*3=6\t3*3=9\n" +
                "2*4=8\t3*4=12\t4*4=16\n" +
                "2*5=10\t3*5=15\t4*5=20\t5*5=25";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void should_return_null_when_start_1001_and_end_1001() {
        // given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 1001;
        int end = 1001;

        // when
        String actualResult = multiplicationTable.create(start, end);

        // then
        assertNull(actualResult);
    }

}
