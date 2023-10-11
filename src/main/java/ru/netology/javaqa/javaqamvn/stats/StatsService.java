package ru.netology.javaqa.javaqamvn.stats;


public class StatsService {
    public int getMinSale(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getMaxSale(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int sum(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += (int) sale;
        }

        return sumMonth;

    }

    public int averageSales(long[] sales) {
        int sumMonth = sum(sales);

        return sumMonth / sales.length;
    }

    public int lowerAverage(long[] sales) {
        int monthsAmount = 0;
        int averageSales = averageSales(sales);
        for (long monthSale : sales) {
            if (monthSale <= averageSales) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    public int higherAverage(long[] sales) {
        int monthsAmount = 0;
        int averageSales = averageSales(sales);

        for (long monthSale : sales) {
            if (monthSale >= averageSales) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;

    }


}


