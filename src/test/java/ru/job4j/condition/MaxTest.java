package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1To2Then3() {
        int left = 3;
        int right = 1;
        int third = 2;
        int result = Max.max(left, Max.max(right, third));
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To6To8Then6() {
        int left = 6;
        int right = 8;
        int third = 4;
        int four = 9;
        int result = Max.max(left, Max.max(right, Max.max(third, four)));
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}