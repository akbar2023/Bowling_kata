package com.renault.bowling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingTest {

    @Test
    public void should_score_must_be_1_when_total_point_is_1() {
        // Given
        int[] rolls = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
        Assertions.assertAll(
                () -> Assertions.assertEquals(1, result),
                () -> Assertions.assertEquals(1, result)
        );
    }

    @Test
    public void should_score_must_be_2_when_total_point_is_2() {
        // Given
        int[] rolls = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void should_score_must_be_10_when_total_point_is_10() {
        // Given
        int[] rolls = {2, 7, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
        Assertions.assertEquals(10, result);
    }

    @Test
    public void should_score_must_be_12_when_total_point_is_12() {
        // Given
        int[] rolls = {3, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
        Assertions.assertEquals(12, result);
    }

    @Test
    public void should_score_must_be_14_when_total_point_is_14() {
        // Given
        int[] rolls = {0, 0, 3, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
        Assertions.assertEquals(14, result);
    }

    @Test
    public void should_score_must_be_15_when_total_point_is_15() {
        // Given
        int[] rolls = {0, 1, 3, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
        Assertions.assertEquals(15, result);
    }

    @Test
    public void should_score_must_be_21_when_total_point_is_21() {
        // Given
        int[] rolls = {0, 7, 3, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
    }

    @Test
    public void should_return_12_when_total_point_is_12() {
        // Given
        int[] rolls = {10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
        Assertions.assertEquals(12, result);
    }

    @Test
    public void should_return_26_when_total_point_is_26() {
        // Given
        int[] rolls = {10, 1, 0, 10, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
        Assertions.assertEquals(26, result);
    }

    @Test
    public void should_return_34_when_total_point_is_34() {
        // Given
        int[] rolls = {10, 7, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        Bowling bowling = new Bowling();
        int result = bowling.calculateScore(rolls);

        // Then
        Assertions.assertEquals(33, result);
    }
}
