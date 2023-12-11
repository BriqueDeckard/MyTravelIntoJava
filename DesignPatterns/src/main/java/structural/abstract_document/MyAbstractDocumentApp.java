package structural.abstract_document;

import structural.abstract_document.domain.MyConcreteDocument;
import structural.abstract_document.domain.MyProperty;
import java.util.List;
import java.util.Map;

public class MyAbstractDocumentApp {
	public static void main(String[] args) {
		Map<String, Object> wheelProperties = Map.of(
				MyProperty.TYPE.toString(), "wheel",
				MyProperty.MODEL.toString(), "15C",
				MyProperty.PRICE.toString(), 100L
		);

		Map<String, Object> doorProperties = Map.of(
				MyProperty.TYPE.toString(), "door",
				MyProperty.MODEL.toString(), "Lambo",
				MyProperty.PRICE.toString(), 300L
		);

		Map<String, Object> gunProperties = Map.of(
				MyProperty.TYPE.toString(), "gun",
				MyProperty.MODEL.toString(), "Barrate",
				MyProperty.PRICE.toString(), 150L
		);

		Map<String, Object> carProperties = Map.of(
				MyProperty.MODEL.toString(), "Batmobile",
				MyProperty.PRICE.toString(), 10000L,
				MyProperty.PARTS.toString(), List.of(
						wheelProperties,
						doorProperties,
						gunProperties
				)
		);
		MyConcreteDocument myConcreteDocument = new MyConcreteDocument(carProperties);
		printConcreteDocument(myConcreteDocument);
	}

	private static void printConcreteDocument(MyConcreteDocument myConcreteDocument) {
		System.out.println("Here is our concrete document : ");
		System.out.println("MODEL: " + myConcreteDocument.getModel().orElseThrow());
		System.out.println("PRICE: " + myConcreteDocument.getPrice().orElseThrow());
		System.out.println("PARTS: ");
		myConcreteDocument.getParts().forEach(part ->
				System.out.println("\t" +
						part.getType().orElse(null) + "/" +
						part.getModel().orElse(null) + "/" +
						part.getPrice().orElse(null)
				));
	}
}
