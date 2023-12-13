package structural.business_delegate;

public class MyBusinessDelegate {

    private MyBusinessLookup lookupService;

    public void setLookupService(MyBusinessLookup lookupService) {
        this.lookupService = lookupService;
    }

    public void playbackMovie(String movie){
        VideoStreamingService videoStreamingService = lookupService.getBusinessService(movie);
        videoStreamingService.doProcessing();
    }


}
