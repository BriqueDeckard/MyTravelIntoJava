package structural.business_delegate;

public class ShowTimeStreamingServiceImp implements VideoStreamingService{
    @Override
    public void doProcessing() {
        System.out.println("SHOWTIME");
    }
}
