public class FinancialForecaster {
    
    // Recursive method to calculate future value
    public static double forecastValue(double principal, double growthRate, int years) {
        if (years == 0) {
            return principal;
        }
        return forecastValue(principal * (1 + growthRate), growthRate, years - 1);
    }

    

    public static void main(String[] args) {
        double initialAmount = 10000;
        double annualGrowthRate = 0.08; // 8% annual growth
        int forecastYears = 5;

        // Recursive prediction
        double recursiveResult = forecastValue(initialAmount, annualGrowthRate, forecastYears);
        System.out.printf("Recursive Forecast: ₹%.2f after %d years%n", recursiveResult, forecastYears);

       
    }
}
