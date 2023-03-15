package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InsuranceTest {
    Insurance insurance;

    @BeforeEach
    public void setupEachTest() {
        insurance = new Insurance();
    }


    @ValueSource(ints = {30, 31, 65, 39, 40})
    @ParameterizedTest
    public void firstRangeTest(int age) {

        int result = insurance.insurancePrice(age);
        Assertions.assertEquals(100, result);
    }

    @ValueSource(ints = {18, 19, 22, 28, 29})
    @ParameterizedTest
    public void secondRangeTest(int age) {

        int result = insurance.insurancePrice(age);
        Assertions.assertEquals(120, result);
    }

    @ValueSource(ints = {66, 67, 70, 78, 79})
    @ParameterizedTest
    public void thirdRangeTest(int age) {

        int result = insurance.insurancePrice(age);
        Assertions.assertEquals(130, result);
    }

    @ValueSource(ints = {-10, 0, 17, 80, 100})
    @ParameterizedTest
    public void zeroRangeTest(int age) {

        int result = insurance.insurancePrice(age);
        Assertions.assertEquals(0, result);
    }
}
