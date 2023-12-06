package advanced_concepts.recursivity.di;

import advanced_concepts.recursivity.services.MyRecursivityService;
import advanced_concepts.recursivity.services.MyUserService;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = RecursivityServiceModule.class)
public interface MyRecursivityComponent {
	MyRecursivityService buildRecursivityService();
	MyUserService buildUserService();
}
