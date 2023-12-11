package gang_of_four.behavioral.strategy;

import java.math.BigDecimal;

public class MyConcreteStrategyA implements MyStrategyContract{
    private BigDecimal multiplier;

    public MyConcreteStrategyA(BigDecimal multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public BigDecimal commonMethod(BigDecimal value) {
        return multiplier.multiply(value);
    }
}
