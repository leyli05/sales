package ru.netology.javaqa.javaqamvn.stats;

import java.util.Arrays;

public class StatsService {
    public int getMinSale(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getMaxSale(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int sum(int[] sales) {

        return Arrays.stream(sales).sum();

    }

    public int average(int[] sales) {

        return Arrays.stream(sales).sum() / 12;
    }

    public int LowerAverage(int[] sales) {
        int monthsAmount = 0;
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        for (int monthSale : sales) {
            if (monthSale < average(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    public int HigherAverage(int[] sales) {
        int monthsAmount = 0;
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }

        for (int monthSale : sales) {
            if (monthSale > average(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;

    }


}


