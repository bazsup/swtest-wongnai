package com.example.swtest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        assertSum("", 0);
    }

    @Test
    public void test12() {
        assertSum("1 2", 3);
    }

    @Test
    public void test123() {
        assertSum("1 2 3", 6);
    }

    private void assertSum(String s, int i) {
        StringCalculator calc = new StringCalculator();
        int result = calc.sum(s);
        MatcherAssert.assertThat(result, Matchers.equalTo(i));
    }
}