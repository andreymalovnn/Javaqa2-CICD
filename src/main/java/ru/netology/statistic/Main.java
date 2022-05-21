package ru.netology.statistic;

public class Main {
    public static void main(String[] args) {
        long [] incomes = {1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        StatisticsService maxIncome = new StatisticsService();
        long max = maxIncome.findMax(incomes);
        System.out.println("Max income: " + max);
    }
}
