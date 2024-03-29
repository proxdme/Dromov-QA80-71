package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMonthlySalesSum() {
        StatsService service = new StatsService();
        int[] monthlySalesResults = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getSalesSum(monthlySalesResults);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindAverageAmountSales() {
        StatsService service = new StatsService();
        int[] monthlySalesResults = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getAverageAmountSales(monthlySalesResults);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthNumberMaxSales() {
        StatsService service = new StatsService();
        int[] monthlySalesResults = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.getMonthNumberMaxSales(monthlySalesResults);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthNumberMinSales() {
        StatsService service = new StatsService();
        int[] monthlySalesResults = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getMonthNumberMinSales(monthlySalesResults);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMonthSumMinSales() {
        StatsService service = new StatsService();
        int[] monthlySalesResults = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getMonthSumMinSales(monthlySalesResults);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthSumMaxSales() {
        StatsService service = new StatsService();
        int[] monthlySalesResults = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getMonthSumMaxSales(monthlySalesResults);

        Assertions.assertEquals(expected, actual);
    }
}