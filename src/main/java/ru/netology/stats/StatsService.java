package ru.netology.stats;

public class StatsService {

    public int getSalesSum(int[] monthlySalesResults) {
        int monthlySalesSum = 0;
        for (int MonthlySales : monthlySalesResults) {
            monthlySalesSum = monthlySalesSum + MonthlySales;
        }
        return monthlySalesSum;
    }

    //сумму всех продаж;
    public int getAverageAmountSales(int[] monthlySalesResults) {
        int monthNumbers = monthlySalesResults.length;
        int monthlySalesSum = getSalesSum(monthlySalesResults);
        int getAverageAmountSalesMonth = monthlySalesSum / monthNumbers;
        return getAverageAmountSalesMonth;
    }

    // среднюю сумму продаж в месяц;
    public int getMonthNumberMaxSales(int[] monthlySalesResults) {
        int monthNumberMaxSales = 0;
        for (int monthNumber = 0; monthNumber < monthlySalesResults.length; monthNumber++) {
            if (monthlySalesResults[monthNumber] > monthlySalesResults[monthNumberMaxSales]) {
                monthNumberMaxSales = monthNumber;
            }
        }
        //System.out.println(" Номер месяца макс продаж -№ " + (MonthNumberMaxSales + 1));
        return monthNumberMaxSales + 1;
    }

    //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
    public int getMonthNumberMinSales(int[] monthlySalesResults) {
        int monthNumberMinSales = 0;
        for (int monthNumber = 0; monthNumber < monthlySalesResults.length; monthNumber++) {
            if (monthlySalesResults[monthNumber] <= monthlySalesResults[monthNumberMinSales]) {
                monthNumberMinSales = monthNumber;
            }
        }
        //System.out.println(" Номер месяца мин продаж -№ " + (MonthNumberMinSales + 1));
        return monthNumberMinSales + 1;


    }
    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*

    public int getMonthSumMinSales(int[] monthlySalesResults) {
        int monthMinAverageSum = 0;
        int averageAmountMonth = getAverageAmountSales(monthlySalesResults);
        for (int monthlySales : monthlySalesResults) {
            if (monthlySales < averageAmountMonth) {
                monthMinAverageSum++;
            }
        }
        return monthMinAverageSum;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int getMonthSumMaxSales(int[] monthlySalesResults) {
        int monthMinAverageSum = 0;
        int averageAmountMonth = getAverageAmountSales(monthlySalesResults);
        for (int monthlySales : monthlySalesResults) {
            if (monthlySales > averageAmountMonth) {
                monthMinAverageSum++;
            }
        }
        return monthMinAverageSum;
    }
    //количество месяцев, в которых продажи были выше среднего
}

