package ru.netology.stats;

public class StatsService {

    public long calcSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calcAverage (long[] purchases) {
        long sum = calcSum(purchases);
        return sum / purchases.length;
    }

    public int calcMaxMonth(long[] purchases) {
        int maxMonth = 0;
        int month = 0;
        for (long purchase : purchases) {
            if (purchase >= purchases[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calcMinMonth(long[] purchases) {
        int minMonth = 0;
        int month = 0;
        for (long purchase : purchases) {
            if (purchase <= purchases[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int calcMonthAmountLessAver(long[] purchases) {
        int MonthAmount = 0;
        long Average = calcAverage(purchases);
        for (long purchase : purchases) {
            if (purchase < Average) {
                MonthAmount += 1;
            }
        }
        return MonthAmount;
    }
    public int calcMonthAmountMoreAver(long[] purchases) {
        int MonthAmount = 0;
        long Average = calcAverage(purchases);
        for (long purchase : purchases) {
            if (purchase > Average) {
                MonthAmount += 1;
            }
        }
        return MonthAmount;
    }
}
