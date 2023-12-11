package pub_sub;

public interface MySubscriber {
    void update(MyEvent message);

    Long getId();
}
