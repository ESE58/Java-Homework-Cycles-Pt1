package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldValue() {
        SQRService service = new SQRService();

        int limitBelow = 100;
        int limitTop = 200;
        int expected = 5;

        int actual = service.squareNumber(limitBelow, limitTop);

        assertEquals(expected, actual);

    }

    @Test
    void shouldLimitsAreLessFirstValue() {
        SQRService service = new SQRService();

        int limitBelow = 1;
        int limitTop = 99;
        int expected = 0;

        int actual = service.squareNumber(limitBelow, limitTop);

        assertEquals(expected, actual);

    }

    @Test
    void shouldLimitsAreFirstValue() {
        SQRService service = new SQRService();

        int limitBelow = 100;
        int limitTop = 100;
        int expected = 1;

        int actual = service.squareNumber(limitBelow, limitTop);

        assertEquals(expected, actual);

    }

    @Test
    void shouldLimitTopIsGreaterFirstValueByOne() {
        SQRService service = new SQRService();

        int limitBelow = 100;
        int limitTop = 101;
        int expected = 1;

        int actual = service.squareNumber(limitBelow, limitTop);

        assertEquals(expected, actual);

    }

    @Test
    void shouldLimitsAreLessLastValueByOne() {
        SQRService service = new SQRService();

        int limitBelow = 9799;
        int limitTop = 9800;
        int expected = 0;

        int actual = service.squareNumber(limitBelow, limitTop);

        assertEquals(expected, actual);

    }

    @Test
    void shouldLimitsAreLastValue() {
        SQRService service = new SQRService();

        int limitBelow = 9801;
        int limitTop = 9801;
        int expected = 1;

        int actual = service.squareNumber(limitBelow, limitTop);

        assertEquals(expected, actual);

    }

    @Test
    void shouldLimitsAreGreaterLastValue() {
        SQRService service = new SQRService();

        int limitBelow = 9802;
        int limitTop = 9900;
        int expected = 0;

        int actual = service.squareNumber(limitBelow, limitTop);

        assertEquals(expected, actual);

    }
}