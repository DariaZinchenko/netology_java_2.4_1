package ru.netology.stats;

public class StatsService {
    public int sumOfAllSales(int [] salesPerMonth) {
        int sum = 0;
        for (int sale: salesPerMonth) {
            sum += sale;
        }
        return sum;
    }

    public float averageSalesPerMonth(int [] salesPerMonth) {
        int sum = sumOfAllSales(salesPerMonth);
        return sum/salesPerMonth.length;
    }

    public int findMaxSales(int [] salesPerMonth) {
        int indexOfMaxSale = 0;
        int maxSale = salesPerMonth[indexOfMaxSale];

        for (int month = 0; month < salesPerMonth.length; month++) {
            if (salesPerMonth[month] >= maxSale) {
                indexOfMaxSale = month;
                maxSale = salesPerMonth[month];
            }
        }
        return indexOfMaxSale;
    }

    public int findMinSales(int [] salesPerMonth) {
        int indexOfMinSale = 0;
        int minSale = salesPerMonth[indexOfMinSale];

        for (int month = 0; month < salesPerMonth.length; month++) {
            if (salesPerMonth[month] <= minSale) {
                indexOfMinSale = month;
                minSale = salesPerMonth[month];
            }
        }
        return indexOfMinSale;
    }

    public int quantityOfMonthUnderAverage(int [] salesPerMonth) {
        float average = averageSalesPerMonth(salesPerMonth);
        int quantityOfMonth = 0;

        for (int sale: salesPerMonth) {
            if (sale < average)
                quantityOfMonth ++;
        }
        return quantityOfMonth;
    }

    public int quantityOfMonthOverAverage(int [] salesPerMonth) {
        float average = averageSalesPerMonth(salesPerMonth);
        int quantityOfMonth = 0;

        for (int sale: salesPerMonth) {
            if (sale > average)
                quantityOfMonth ++;
        }
        return quantityOfMonth;
    }
}
