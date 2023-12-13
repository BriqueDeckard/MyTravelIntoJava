package structural.business_delegate;

public class SomeClient {
    private final MyBusinessDelegate myBusinessDelegate;

    public SomeClient(MyBusinessDelegate myBusinessDelegate) {
        this.myBusinessDelegate = myBusinessDelegate;
    }

    public void playbackMovie(String movie){
        myBusinessDelegate.playbackMovie(movie);
    }
}
