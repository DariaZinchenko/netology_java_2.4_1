package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void sumOfAllSalesTest() {
        int [] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        StatsService statsService = new StatsService();
        int actual = statsService.sumOfAllSales(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void averageSalesPerMonthTest() {
        int [] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 15;

        StatsService statsService = new StatsService();
        float actual = statsService.averageSalesPerMonth(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxSalesTest() {
        int [] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        StatsService statsService = new StatsService();
        int actual = statsService.findMaxSales(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void findMinSalesTest() {
        int [] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        StatsService statsService = new StatsService();
        int actual = statsService.findMinSales(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void quantityOfMonthUnderAverageTest() {
        int [] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        StatsService statsService = new StatsService();
        int actual = statsService.quantityOfMonthUnderAverage(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void quantityOfMonthOverAverageTest() {
        int [] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        StatsService statsService = new StatsService();
        int actual = statsService.quantityOfMonthOverAverage(salesPerMonth);
        assertEquals(expected, actual);
    }
}
