
public class NodeTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		IntNode head = new IntNode(111, null);
		IntNode node = new IntNode(555, head);
		IntNode node2 = new IntNode(777,node);
		System.out.println("good morning");
		System.out.println(head.toString());
		
		System.out.println("node");
		System.out.println(node.toString());
		System.out.println("node2");
		System.out.println(node2.toString());
		head.addNodeAfter(node.getData());
		System.out.println("head");
		head.toString();
		IntNode position;
		position = IntNode.listPosition(head, 2);
		
		IntNode.insertAtPos(head, 2, 10101);
		System.out.println("inserted ---- head");
		System.out.println(head.toString());
		System.out.println("print node2");
		System.out.println(node2.toString());
		
		
		
		
		
		

	}

}
