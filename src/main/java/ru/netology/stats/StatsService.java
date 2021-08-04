package ru.netology.stats;

public class StatsService {

    // 1 Сумма всех продаж
    public int salesTotal(int[] sales) {
        int total = 0;

        for (int sale : sales) {
            total += sale; // на каждом шаге плюсуем значение к общей сумме
        }
        return total;
    }

    // 2 Средняя сумма продаж в месяц - сумма (1) / длина массива
    public int averageSale(int[] sales) {
        return salesTotal(sales) / sales.length;
    }

    // 3 Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int maxSales(int[] sales) {

        int maxMonth = 0;
        int monthNumber = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = monthNumber; // запоминаем месяц, в котором нашли наибольшую продажу
            }
            monthNumber++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // 4 Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму) - готовый код
    public int minSales(int[] sales) {

        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве

        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    // 5 Кол-во месяцев, в которых продажи были ниже среднего - сравнить месяц со средним (2), прибавить 1 к счетчику
    public int monthLowerAverage(int[] sales) {

        int monthLow = 0; // счетчик месяцев
        int average = averageSale(sales);

        for (int sale : sales) {
            if (sale < average) {
                monthLow++; // если продажа ниже средней, то прибавляем счетчик
            }
        }

        return monthLow;
    }

    // 6 Кол-во месяцев, в которых продажи были выше среднего - сравнить месяц со средним (2), прибавить 1 к счетчику
    public int monthHigherAverage(int[] sales) {

        int monthHigh = 0; // счетчик месяцев
        int average = averageSale(sales);

        for (int sale : sales) {
            if (sale > average) {
                monthHigh++; // если продажа выше средней, то прибавляем счетчик
            }
        }
        return monthHigh;

    }
}
