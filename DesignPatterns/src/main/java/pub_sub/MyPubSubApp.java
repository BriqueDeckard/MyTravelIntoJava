package design_patterns.pub_sub;

public class MyPubSubApp {
    public static void main(String[] args) {
        MyPublisher myPublisher = new MyPublisher();
        MyConcreteSubscriber myConcreteSubscriber1 = new MyConcreteSubscriber(1L);
        MyConcreteSubscriber myConcreteSubscriber2 = new MyConcreteSubscriber(2L);

        myPublisher.addSubscriber("C1", 1, myConcreteSubscriber1);
        myPublisher.addSubscriber("C1", 2, myConcreteSubscriber2);
        MyEvent myEvent = new MyEvent(1, "Hello ?");
        myPublisher.publish("C1", myEvent);
    }
}
