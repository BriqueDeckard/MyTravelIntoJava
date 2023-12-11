package pub_sub;

public class MyEvent {
    private long id;
    private Object payload;

    public MyEvent(long id, Object payload) {
        this.id = id;
        this.payload = payload;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "id=" + id +
                ", payload=" + payload +
                '}';
    }
}
