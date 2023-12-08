package behavioral.strategy;

import java.math.BigDecimal;

public class MyStrategyClient {

    public static final BigDecimal VALUE = BigDecimal.valueOf(42);

    public void executeStrategy(MyStrategyContract myStrategyContract) {
        BigDecimal bigDecimal = myStrategyContract.commonMethod(VALUE);
        System.out.println("result: " + bigDecimal);
    }

    public String executeStrategyGetResult(MyStrategyContract myStrategyContract) {
        BigDecimal bigDecimal = myStrategyContract.commonMethod(VALUE);
        return bigDecimal.toString();
    }
}
