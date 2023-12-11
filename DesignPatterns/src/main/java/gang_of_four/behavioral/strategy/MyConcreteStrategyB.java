package gang_of_four.behavioral.strategy;

import java.math.BigDecimal;

public class MyConcreteStrategyB implements MyStrategyContract{
    @Override
    public BigDecimal commonMethod(BigDecimal value) {
        return BigDecimal.valueOf(0.5).multiply(value);
    }
}
