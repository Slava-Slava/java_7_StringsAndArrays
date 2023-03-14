package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum = totalSum + sales[i];
        }
        return totalSum;
    }

    public int averageAmount(int[] sales) {
        int averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSum = averageSum + sales[i];

        }
        return averageSum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int average = averageAmount(sales);
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;
    }

    public int aboveAverageSales(int[] sales) {
        int average = averageAmount(sales);
        int aboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverage = aboveAverage + 1;
            }
        }
        return aboveAverage;
    }
}