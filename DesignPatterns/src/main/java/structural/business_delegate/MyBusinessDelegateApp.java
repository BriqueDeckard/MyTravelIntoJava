package structural.business_delegate;

public class MyBusinessDelegateApp {
    public static void main(String[] args) {
        MyBusinessDelegate myBusinessDelegate = new MyBusinessDelegate();
        MyBusinessLookup myBusinessLookup = new MyBusinessLookup();
        myBusinessLookup.setHboStreamingServiceImp(new HBOStreamingServiceImp());
        myBusinessLookup.setShowTimeStreamingServiceImp(new ShowTimeStreamingServiceImp());
        myBusinessDelegate.setLookupService(myBusinessLookup);
        SomeClient someClient = new SomeClient(myBusinessDelegate);
        someClient.playbackMovie("Jurassic park");
        someClient.playbackMovie("Die hard");
    }
}
