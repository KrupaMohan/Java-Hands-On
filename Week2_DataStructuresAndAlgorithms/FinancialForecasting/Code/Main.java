import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double currValue = 10000.0;
        double growthRate = 0.10;
        int years = 5;
        double futureValue = ForecastUtil.predictFutureValue(currValue,growthRate,years);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Predicted value after "+ years +" years: ₹"+df.format(futureValue));
    }
}
