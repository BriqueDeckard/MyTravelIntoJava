package creational.factory_kit;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface MyDomainEntityFactory {
	/**
	 * used to configure the factory with the classes it needs to
	 * be able to construct
	 *
	 * Un Consumer est une interface fonctionnelle de Java qui prend un argument et exécute des opérations sur
	 * celui-ci, mais ici il est utilisé pour remplir une structure de données.
	 *
	 * cette méthode factory est conçue pour créer une fabrique flexible d'objets MyDomainContract basée sur des
	 * associations entre des éléments d'énumération et des fournisseurs de ces objets. Cette approche permet de
	 * créer des objets MyDomainContract en utilisant une méthode plus dynamique et paramétrée.
	 *
	 * @param consumer
	 */
	static MyDomainEntityFactory factory(Consumer<MyBuilder> consumer) {
		// stocker des associations entre des éléments d'énumération (MyDomainEnum) et des fournisseurs (Supplier)
		//  pour créer des objets de type MyDomainContract.
		HashMap<MyDomainEnum, Supplier<MyDomainContract>> myDomainEnumSupplierHashMap = new HashMap<>();
		// La méthode accept de l'objet consumer est appelée avec une référence de méthode
		// myDomainEnumSupplierHashMap::put. Cela signifie que pour chaque élément passé à la méthode factory via
		// consumer.accept(), cet élément sera utilisé comme clé pour la HashMap, et la valeur associée sera un
		// fournisseur (Supplier) pour l'objet MyDomainContract.
		consumer.accept(myDomainEnumSupplierHashMap::put);
		// la méthode retourne une fonction qui prend un MyDomainEnum en paramètre (name) et renvoie un objet
		// MyDomainContract.
		// Cette fonction utilise la HashMap créée précédemment pour récupérer le fournisseur (Supplier) associé à la
		// clé name et crée un nouvel objet MyDomainContract en utilisant la méthode get() du fournisseur.
		MyDomainEntityFactory myDomainEntityFactory = name -> myDomainEnumSupplierHashMap.get(name).get();
		return myDomainEntityFactory;
	}

	MyDomainContract create(MyDomainEnum name);
}
