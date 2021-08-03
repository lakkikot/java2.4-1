package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    // 1 сумма всех продаж
    @Test
    public void shouldFindSalesTotal() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.salesTotal(sales);
        int expected = 180;

        assertEquals(expected, actual);
    }

    // 2 Средняя сумма продаж в месяц
    @Test
    public void shouldFindAverageSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSale(sales);
        int expected = 15;

        assertEquals(expected, actual);
    }

    // 3 Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    @Test
    public void shouldReturnNumberOfMonthWithMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales);
        int expected = 8;

        assertEquals(expected, actual);
    }

    // 4 Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    @Test
    public void shouldReturnNumberOfMonthWithMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales);
        int expected = 9;

        assertEquals(expected, actual);
    }

    // 5 Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    @Test
    public void shouldReturnAmountOfMonthLowerAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthLowerAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }

    // 6 Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    @Test
    public void shouldReturnAmountOfMonthHigherAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthHigherAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }


}

