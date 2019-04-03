/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalc;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.fail;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)
@SmallTest
public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }


    /**
     * A test with positive integer operands.
     */
    @Test
    public void powTwoPositive() {
        double resultPow = mCalculator.mypow(2d, 1d);
        assertThat(resultPow, is(equalTo(2d)));
        //fail("powTwoPositive() hasn't been implemented.");
    }

    /**
     * A test with a negative integer as the first operand.
     */
    @Test
    public void powFirstNegative() {
        double resultPow = mCalculator.mypow(-2d, 2d);
        assertThat(resultPow, is(equalTo(4d)));
        //fail("powFirstNegative() hasn't been implemented.");
    }

    /**
     * A test with a negative integer as the second operand.
     */
    @Test
    public void powSecondNegative() {
        double resultPow = mCalculator.mypow(2d, -2d);
        assertThat(resultPow, is(equalTo(0.25d)));
        //fail("powSecondNegative() hasn't been implemented.");
    }

    /**
     * A test with 0 as the first operand and a positive integer as the second operand.
     */
    @Test
    public void powFirstZeroSecondPositive() {
        double resultPow = mCalculator.mypow(0d, 1d);
        assertThat(resultPow, is(equalTo(0d)));
        //fail("powFirstZeroSecondPositive() hasn't been implemented.");
    }

    /**
     * A test with 0 as the second operand.
     */
    @Test
    public void powSecondZero() {
        double resultAdd = mCalculator.mypow(1d, 0d);
        assertThat(resultAdd, is(equalTo(1d)));
        //fail("powSecondZero() hasn't been implemented.");
    }

    /**
     * A test with 0 as the first operand and -1 as the second operand. (Hint: consult the documentation for Double.POSITIVE_INFINITY.)
     */
    @Test
    public void powFirstZeroSecondMinus1() {
        double resultPow = mCalculator.mypow(0d, -1d);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
        //fail("powFirstZeroSecondMinus1() hasn't been implemented.");
    }

    /**
     * A test with -0 as the first operand and any negative number as the second operand.
     */
    @Test
    public void powFirstMinusZeroSecondNegative() {
        double resultPow = mCalculator.mypow(-0d, -1d);
        assertThat(resultPow, is(equalTo(Double.NEGATIVE_INFINITY)));
        //fail("powFirstMinusZeroSecondNegative() hasn't been implemented.");
    }

}