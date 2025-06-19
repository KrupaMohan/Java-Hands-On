public class ForecastUtil {
    public static double predictFutureValue(double currValue, double growthRate, int years){
        if(years==0){
            return currValue;
        }
        return predictFutureValue(currValue*(1+growthRate), growthRate, years-1);
    }
}
