package structural.business_delegate;

import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class MyBusinessLookup {

    static Set<String> hboMovies;
    static Set<String> showTimeMovies;

    static {
        hboMovies = Set.of("Die hard").stream().map(String::toLowerCase).collect(Collectors.toSet());
        showTimeMovies = Set.of("Jurassic Park").stream().map(String::toLowerCase).collect(Collectors.toSet());

    }

    private HBOStreamingServiceImp hboStreamingServiceImp;
    private ShowTimeStreamingServiceImp showTimeStreamingServiceImp;

    public void setHboStreamingServiceImp(HBOStreamingServiceImp hboStreamingServiceImp) {
        this.hboStreamingServiceImp = hboStreamingServiceImp;
    }

    public void setShowTimeStreamingServiceImp(ShowTimeStreamingServiceImp showTimeStreamingServiceImp) {
        this.showTimeStreamingServiceImp = showTimeStreamingServiceImp;
    }

    public VideoStreamingService getBusinessService(String movie) {
        if (hboMovies.contains(movie.toLowerCase(Locale.ROOT))) {
            return hboStreamingServiceImp;
        } else if (showTimeMovies.contains(movie.toLowerCase(Locale.ROOT))) {
            return showTimeStreamingServiceImp;
        }
        throw new IllegalArgumentException();
    }
}
