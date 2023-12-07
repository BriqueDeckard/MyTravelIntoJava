package dagger.myimp;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = MyDaggerModule.class)
public interface MyDaggerComponent {
	MyService buildService();
}
