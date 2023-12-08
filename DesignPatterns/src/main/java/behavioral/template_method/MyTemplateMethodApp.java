package behavioral.template_method;

import java.util.Set;
import java.util.stream.Stream;

public class MyTemplateMethodApp {
    public static void main(String[] args) {
        Stream.of(
                new MyTemplateImplAlpha(),
                new MyTemplateImplBeta()
        ).forEach(impl -> impl.finalMethod());
    }
}
