public class Example {

	public static void invokeMethods() {
		InnerNode node = new InnerNode("n1", 2);
		Leaf leaf = new Leaf("leaf", 0);
		String id = node.getIdentifier();
		int sum = 0;
		for (Node child : node.children()) {
			sum += child.childrenSum();
		}
	}
}

public abstract class Node {
	protected String identifier;
	protected Integer data;

	public Node(String identifier, Integer data) {
		// ...
	}

	public String getIdentifier() {
		// ...
	}
	
	public abstract Collection<Node> children();
}

public class InnerNode extends Node {
	private Node lhs;
	private Node rhs;

	public InnerNode(String identifier, Integer data, Node lhs, Node rhs) {
		super(identifier, data);
		// ...
	}

	public int childrenSum() {
		// ...
	}

	@Override 
	public Collection<Node> children() {
		// returns children nodes
	}
}

public class Leaf extends Node {

	public Leaf(String identifier, Integer data) {
		super(identifier, data);
	}

	@Override 
	public Collection<Node> children() {
		// returns children nodes
	}
}