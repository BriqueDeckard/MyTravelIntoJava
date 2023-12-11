package pub_sub;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyPublisher {
    private final Map<String, ConcurrentHashMap<Integer, WeakReference<Object>>> channels;

    public MyPublisher(){
        this.channels = new ConcurrentHashMap<>();
    }

    public void publish(String channel, MyEvent message){
        if(channels.containsKey(channel)){
            channels.get(channel).forEach((key, value) -> {
                if(value.get() != null && message != null){
                    // Envoie du message aux abonnés
                    ((MySubscriber) value.get()).update(message);
                }
            });
        }
    }

    public void addSubscriber(String channel, int id, MySubscriber subscriber){
        channels.computeIfAbsent(channel, k -> new ConcurrentHashMap<>()).put(id, new WeakReference<>(subscriber));
    }

    public void removeSubscriber(String channel, int id){
        if(channels.containsKey(channel)){
            channels.get(channel).remove(id);
        }
    }
}
