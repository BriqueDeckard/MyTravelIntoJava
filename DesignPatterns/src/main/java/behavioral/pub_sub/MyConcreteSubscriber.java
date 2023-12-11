package behavioral.pub_sub;

public class MyConcreteSubscriber implements MySubscriber {
    private final Long id;

    public MyConcreteSubscriber(Long id) {
        this.id = id;
    }

    @Override
    public void update(MyEvent message) {
        if (message == null || message.getPayload() == null) {
            throw new IllegalArgumentException();
        }
        Object payload = message.getPayload();
        if (payload instanceof String s) {

            System.out.println("Message with id : " + message.getId() + " {\n" + s + "\n}");
        }

    }

    @Override
    public Long getId() {
        return this.id;
    }
}
