package structural.event_aggregator;

public class MyEventAggregatorApp {
	public static void main(String[] args) {
		MyConcreteEventObserver observer = new MyConcreteEventObserver();
		MyConcreteEventAggregatorA myConcreteEventAggregatorA = new MyConcreteEventAggregatorA();
		myConcreteEventAggregatorA.registerObserver(observer, MyEvent.EVENT_TYPE_1);
		myConcreteEventAggregatorA.registerObserver(observer, MyEvent.EVENT_TYPE_2);
		MyConcreteEventAggregatorB myConcreteEventAggregatorB = new MyConcreteEventAggregatorB();
		myConcreteEventAggregatorB.registerObserver(myConcreteEventAggregatorA, MyEvent.EVENT_TYPE_1);
		MyConcreteEventAggregatorC myConcreteEventAggregatorC = new MyConcreteEventAggregatorC();
		myConcreteEventAggregatorC.registerObserver(myConcreteEventAggregatorA, MyEvent.EVENT_TYPE_2);
		MyConcreteEventEmitterA myConcreteEventEmitterA = new MyConcreteEventEmitterA();
		myConcreteEventEmitterA.registerObserver(myConcreteEventAggregatorB, MyEvent.EVENT_TYPE_1);
		myConcreteEventEmitterA.registerObserver(myConcreteEventAggregatorC, MyEvent.EVENT_TYPE_2);
		myConcreteEventEmitterA.emitSomething();

	}
}
