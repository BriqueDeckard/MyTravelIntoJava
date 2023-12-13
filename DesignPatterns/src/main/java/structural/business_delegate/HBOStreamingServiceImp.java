package structural.business_delegate;

public class HBOStreamingServiceImp implements VideoStreamingService{
    @Override
    public void doProcessing() {
        System.out.println("HBO");
    }
}
