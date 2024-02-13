package ru.netology.stats;

public class StatsService {

    public int getSalesSum(int[] MonthlySalesResults) {
        int MonthlySalesSum = 0;
        for (int MonthlySales : MonthlySalesResults) {
            MonthlySalesSum = MonthlySalesSum + MonthlySales;
        }
        return MonthlySalesSum;
    }

    //сумму всех продаж;
    public int getAverageAmountSales(int[] MonthlySalesResults) {
        int MonthNumbers = MonthlySalesResults.length;
        int MonthlySalesSum = getSalesSum(MonthlySalesResults);
        int getAverageAmountSalesMonth = MonthlySalesSum / MonthNumbers;
        return getAverageAmountSalesMonth;
    }

    // среднюю сумму продаж в месяц;
    public int getMonthNumberMaxSales(int[] MonthlySalesResults) {
        int MonthNumberMaxSales = 0;
        for (int MonthNumber = 0; MonthNumber < MonthlySalesResults.length; MonthNumber++) {
            if (MonthlySalesResults[MonthNumber] > MonthlySalesResults[MonthNumberMaxSales]) {
                MonthNumberMaxSales = MonthNumber;
            }
        }
        //System.out.println(" Номер месяца макс продаж -№ " + (MonthNumberMaxSales + 1));
        return MonthNumberMaxSales + 1;
    }

    //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
    public int getMonthNumberMinSales(int[] MonthlySalesResults) {
        int MonthNumberMinSales = 0;
        for (int MonthNumber = 0; MonthNumber < MonthlySalesResults.length; MonthNumber++) {
            if (MonthlySalesResults[MonthNumber] <= MonthlySalesResults[MonthNumberMinSales]) {
                MonthNumberMinSales = MonthNumber;
            }
        }
        //System.out.println(" Номер месяца мин продаж -№ " + (MonthNumberMinSales + 1));
        return MonthNumberMinSales + 1;


    }
    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*

    public int getMonthSumMinSales(int[] MonthlySalesResults) {
        int MonthMinAverageSum = 0;
        int AverageAmountMonth = getAverageAmountSales(MonthlySalesResults);
        for (int MonthlySales : MonthlySalesResults) {
            if (MonthlySales < AverageAmountMonth) {
                MonthMinAverageSum++;
            }
        }
        return MonthMinAverageSum;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int getMonthSumMaxSales(int[] MonthlySalesResults) {
        int MonthMinAverageSum = 0;
        int AverageAmountMonth = getAverageAmountSales(MonthlySalesResults);
        for (int MonthlySales : MonthlySalesResults) {
            if (MonthlySales > AverageAmountMonth) {
                MonthMinAverageSum++;
            }
        }
        return MonthMinAverageSum;
    }
    //количество месяцев, в которых продажи были выше среднего
}

