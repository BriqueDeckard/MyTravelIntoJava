package data_structures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("ClassEscapesDefinedScope")
public class Graph {
	private final Map<Vertex, Set<Vertex>> adjacencyList;

	public Graph() {
		this.adjacencyList = new HashMap<>();
	}

	public static void main(String[] args) {
		Vertex pierre1 = new Vertex("Pierre", 1);
		Graph socialNetwork = new Graph();
		socialNetwork.addVertex(pierre1);
		Vertex emma = new Vertex("Emma", 2);
		socialNetwork.addVertex(emma);
		Vertex vincent = new Vertex("Vincent", 3);
		socialNetwork.addVertex(vincent);
		Vertex bene = new Vertex("Bene", 4);
		socialNetwork.addVertex(bene);
		socialNetwork.addEdge(pierre1, emma);
		socialNetwork.addEdge(emma, bene);
		socialNetwork.addEdge(vincent, pierre1);

		Set<Vertex> pierre = socialNetwork.getFriends(pierre1);
		System.out.println(pierre);

	}

	/**
	 * Ajout d'un sommet, avec une liste d'arrêtes vides
	 *
	 */
	public void addVertex(Vertex user) {
		adjacencyList.putIfAbsent(user, new HashSet<>());
	}

	public void addEdge(Vertex user1, Vertex user2) {
		adjacencyList.get(user1).add(user2);
		adjacencyList.get(user2).add(user1);
	}

	public Set<Vertex> getFriends(Vertex user) {
		return adjacencyList.get(user);
	}

	static class Vertex {
		private String name;
		private int value;

		public Vertex(String name, int value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Vertex{" +
					"name='" + name + '\'' +
					", value=" + value +
					'}';
		}
	}
}
