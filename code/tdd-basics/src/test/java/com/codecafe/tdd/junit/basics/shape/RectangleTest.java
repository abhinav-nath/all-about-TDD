package com.codecafe.tdd.junit.basics.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void areaShouldBe10WhenLengthIs5AndHeightIs2() {
        Rectangle rectangle = new Rectangle(5, 2);
        assertEquals(10, rectangle.area());
    }

    @Test
    void areaShouldBe6WhenLengthIs2AndHeightIs3() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area());
    }

    @Test
    void perimeterShouldBe16WhenLengthIs7AndHeightIs1() {
        Rectangle rectangle = new Rectangle(7, 1);
        assertEquals(16, rectangle.perimeter());
    }

    @Test
    void perimeterShouldBe20WhenLengthIs8AndHeightIs2() {
        Rectangle rectangle = new Rectangle(8, 2);
        assertEquals(20, rectangle.perimeter());
    }

}