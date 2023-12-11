package structural.adapter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyAdapterApp {
	public static void main(String[] args) {
		LegacyDomainClass legacyDomainClass = new LegacyDomainClass(54);
		AdapterImp adapterImp = new AdapterImp(legacyDomainClass);
		adapterImp.printLegacyFieldHashtaged();
		adapterImp.printLegacyFieldQuoted();
		reflection(adapterImp);
	}

	private static void reflection(AdapterImp adapterImp) {
		Method[] declaredMethods = AdapterImp.class.getDeclaredMethods();
		Arrays.stream(declaredMethods).forEach(method -> {
			try {
				method.invoke(adapterImp);
			} catch (IllegalAccessException | InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		});
	}
}
