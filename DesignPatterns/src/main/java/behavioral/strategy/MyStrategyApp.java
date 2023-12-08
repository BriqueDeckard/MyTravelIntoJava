package behavioral.strategy;

import java.math.BigDecimal;
import java.util.Set;
import java.util.stream.Collectors;

public class MyStrategyApp {
    public static void main(String[] args) {
        Set<MyStrategyContract> strategyContracts = createStrategies();
        MyStrategyClient myStrategyClient = new MyStrategyClient();
        String collected = executeStrategies(strategyContracts, myStrategyClient);
        System.out.println(collected);
    }

    private static String executeStrategies(Set<MyStrategyContract> strategyContracts, MyStrategyClient myStrategyClient) {
        strategyContracts.forEach(myStrategyClient::executeStrategy);
        String collected = strategyContracts.stream()
                .map(myStrategyClient::executeStrategyGetResult)
                .collect(Collectors.joining(", "));
        return collected;
    }

    private static Set<MyStrategyContract> createStrategies() {
        MyStrategyContract strategyA = new MyConcreteStrategyA(BigDecimal.TEN);
        MyStrategyContract strategyB = new MyConcreteStrategyB();
        Set<MyStrategyContract> strategyContracts = Set.of(strategyA, strategyB);
        return strategyContracts;
    }
}
