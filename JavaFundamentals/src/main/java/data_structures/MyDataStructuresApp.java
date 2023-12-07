package data_structures;

import java.util.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyDataStructuresApp {
	static final Logger LOGGER = LogManager.getLogger(MyDataStructuresApp.class);
	protected static final String MY_QUEUE_POLL = "My queue poll: {}";
	protected static final String TEXT_EDITOR_TEXT = "TextEditor text {}";

	public static void main(String[] args) {
		myArrays(); // O(n) recherche, O(n) insertion/suppression dans le pire des cas
		myDeque();
		myLists();
		myMaps();
		myPriorityQueue();
		mySets();
		myStack();
	}

	private static void myPriorityQueue() {
		PriorityQueue<Integer> myQueue = new PriorityQueue<>();
		myQueue.add(10);
		myQueue.add(9);
		myQueue.add(20);
		LOGGER.log(Level.INFO, MY_QUEUE_POLL, myQueue.poll());
		LOGGER.log(Level.INFO, MY_QUEUE_POLL, myQueue.poll());
		LOGGER.log(Level.INFO, MY_QUEUE_POLL, myQueue.poll());
	}

	private static void myDeque() {
		// structure de données deque (double-ended queue) qui permet l'ajout et la suppression d'éléments à la fois au début et à la fin de la file.
		Queue<Integer> myDeQueue = new ArrayDeque<>();
		myDeQueue.add(10);
		myDeQueue.add(9);
		myDeQueue.add(20);
		LOGGER.log(Level.INFO, MY_QUEUE_POLL, myDeQueue.poll());
		LOGGER.log(Level.INFO, MY_QUEUE_POLL, myDeQueue.poll());
		LOGGER.log(Level.INFO, MY_QUEUE_POLL, myDeQueue.poll());
	}

	private static void myStack() {
		Stack<Integer> myStack = new Stack<>();
		// put at the end
		myStack.add(4);
		myStack.add(3);
		myStack.add(5);
		// Pick the first at the top and remove
		LOGGER.log(Level.INFO, "My stack pop {}", myStack.pop());
		// Look the first without removing
		LOGGER.log(Level.INFO, "My stack peek {}", myStack.peek());
		// Put on the top
		myStack.push(2);
		// The first/last element
		myStack.firstElement();
		myStack.lastElement();

		TextEditor textEditor = new TextEditor();
		textEditor.appendText("Hello ! ");
		LOGGER.log(Level.INFO, TEXT_EDITOR_TEXT, textEditor.text);
		textEditor.appendText("Hello ! ");
		LOGGER.log(Level.INFO, TEXT_EDITOR_TEXT, textEditor.text);
		textEditor.undo();
		LOGGER.log(Level.INFO, TEXT_EDITOR_TEXT, textEditor.text);
		textEditor.undo();
		LOGGER.log(Level.INFO, TEXT_EDITOR_TEXT, textEditor.text);
		textEditor.redo();
		LOGGER.log(Level.INFO, TEXT_EDITOR_TEXT, textEditor.text);
		textEditor.redo();
		LOGGER.log(Level.INFO, TEXT_EDITOR_TEXT, textEditor.text);
	}

	private static void myMaps() {
		// # MAP
		// + Stockage de paires clé-valeur, recherche rapide par clé.
		// - Pas d'ordre spécifique
		// - nécessité de convertir en liste pour accéder aux éléments par indice.
		HashMap<Integer, String> myHashMap = new HashMap<>();
		myHashMap.put(1, "AA");
		myHashMap.put(2, "BB");
		myHashMap.put(3, "CC");
		myHashMap.put(5, "EE");
		myHashMap.put(4, "DD");
		if (LOGGER.isInfoEnabled()) {
			LOGGER.log(Level.INFO, "My hashmap get (3) : {}", myHashMap.get(3));
			LOGGER.log(Level.INFO, "new ArrayList<String>(myHashMap.values()).get(2) : {}",
					new ArrayList<>(myHashMap.values()).get(2));
		}


	}

	private static void mySets() {
		// # SETS
		// + éléments uniques
		// + recherches rapides
		// - pas d'ordres
		// - doit etre converti en liste pour acceder par indice
		Set<Integer> myIntSet;
		myIntSet = Set.of(1, 2, 3, 4, 6, 5, 7, 8, 9, 10);
		LOGGER.log(Level.INFO, "myIntSet.contains(4) : {}", myIntSet.contains(4));
		myIntSet.forEach(x -> LOGGER.log(Level.INFO, x));
		LOGGER.log(Level.INFO, "new ArrayList<>(myIntSet).get(1) : {}", new ArrayList<>(myIntSet).get(1));

		// Exemple concret
		PermissionManagement permissionManagement1 = new PermissionManagement();
		permissionManagement1.grantPermissions(Permissions.USER);
		LOGGER.log(Level.INFO, "permissionManagement1.hasPermission(Permissions.ADMIN) : {}",
				permissionManagement1.hasPermission(Permissions.ADMIN));
		permissionManagement1.grantPermissions(Permissions.USER);
		permissionManagement1.grantPermissions(Permissions.ADMIN);
		LOGGER.log(Level.INFO, "permissionManagement1.hasPermission(Permissions.ADMIN) : {}",
				permissionManagement1.hasPermission(Permissions.ADMIN));
	}

	private static void myLists() {
		// # LISTS
		// + Flexibilité de taille
		// + CRUD dynamique
		// - recherche inefficace
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		LOGGER.log(Level.INFO, "intList.get(0) : {}", intList.get(0));
		LOGGER.log(Level.INFO, "intList.get(intList.indexOf(10)) : {}", intList.get(intList.indexOf(10)));

		// Exemple concret : gestion de tâches
		List<String> taskList = new ArrayList<>();

		taskList.add("Courses");
		taskList.add("Mails");
		taskList.add("Rapport");

		// Acces par indice
		String firstTask = taskList.get(0);
		LOGGER.log(Level.INFO, "Première tâche : {}", firstTask);

		taskList.remove(firstTask);

	}

	@SuppressWarnings("CommentedOutCode")
	private static void myArrays() {
		// # ARRAYS
		// + Stockage efficace des données de même type
		// + Accès rapide par indice
		// - Taille fixe
		// - Necessité de déplacer les éléments "manuellement"
		int[] intArray = new int[5];
		intArray[1] = 10;

		LOGGER.log(Level.INFO, "Int array[1] : {}", intArray[1]);

		try {
			//noinspection DataFlowIssue
			intArray[6] = 12; // Array index is out of bounds
		} catch (Exception e) {
			LOGGER.log(Level.ERROR, e);
		}
		// Pas de recherche simple
		String[] lang = { "PHP", "Java", "C++", "Python" };
		boolean found = false;
		String searchValue = "Java";

		for (String s : lang) {
			if (s.equals(searchValue)) {
				found = true;
				break;
			}
		}
		String message = searchValue + (found ? " existe dans le tableau." : " n'existe pas dans le tableau.");
		LOGGER.log(Level.INFO, "Message: {}", message);
		// Tri simple
		Arrays.sort(lang);

		// Exemple concret : les notes d'une classe
		int[] notes = { 84, 90, 75, 95, 80 };

		// Calcul de la moyenne
//		double moyenne = ((Function<int[], Double>) notes1 -> {
//			double somme = 0;
//			for (int note : notes1) {
//				somme += note;
//			}
//			return somme / notes1.length;
//		}).apply(notes);

		double somme = 0;
		for (int note : notes) {
			somme += note;
		}
		double moyenne = somme / notes.length;


		LOGGER.log(Level.INFO, "Moyenne : {}", moyenne);

		// Recherche de la note la plus élevée
		int max = notes[0];
		for (int n : notes) {
			max = Math.max(n, max);
		}
		LOGGER.log(Level.INFO, "Max: {}", max);
	}

	enum Permissions {
		USER,
		ADMIN
	}

	public static class TextEditor {
		private final Stack<String> undoStack;
		private final Stack<String> redoStack;
		private StringBuilder text;

		public TextEditor() {
			text = new StringBuilder();
			undoStack = new Stack<>();
			redoStack = new Stack<>();
		}

		public void appendText(String newText) {
			undoStack.push(text.toString());
			text.append(newText);
			redoStack.clear();
		}

		public void undo() {
			if (!undoStack.isEmpty()) {
				redoStack.push(text.toString());
				text = new StringBuilder(undoStack.pop());
			}
		}

		public void redo() {
			if (!redoStack.isEmpty()) {
				undoStack.push(text.toString());
				text = new StringBuilder(undoStack.pop());
			}
		}

		public String getText() {
			return text.toString();
		}
	}

	static class PermissionManagement {


		private Set<Permissions> userPermissions;

		public PermissionManagement() {
			userPermissions = new HashSet<>();
		}

		public void grantPermissions(Permissions permission) {
			userPermissions.add(permission);
		}

		public void revokePermission(Permissions permission) {
			userPermissions.remove(permission);
		}

		public boolean hasPermission(Permissions permission) {
			return userPermissions.contains(permission);
		}

		public void setUserPermissions(Set<Permissions> userPermissions) {
			this.userPermissions = userPermissions;
		}
	}
}
