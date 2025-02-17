
public class Main {
	
	//ex1
	public static Node<Integer> mergeLists(Node<Integer> L1, Node<Integer> L2){
		
		Node<Integer> headL1 = L1;
		Node<Integer> headL2 = L2;
		Node<Integer> L3 = new Node<Integer>(-1);
		Node<Integer> current = L3;
		
		while (headL1 != null && headL2 != null) {
		       if (L1.getValue() <= L2.getValue()) { 
		    	   current.setNext(new Node < Integer>(headL1.getValue()));
		    	   headL1 = headL1.getNext();
		       }
		       else {
		    	   current.setNext(new Node < Integer>(headL2.getValue()));
		    	   headL2 = headL2.getNext();
		       }
		       current = current.getNext();
		}
	
		// one of the lists might have more values - they don't have to be equal
		
		while(headL1 != null) {
			current.setNext(new Node<Integer>(headL1.getValue()));
			headL1 = headL1.getNext();
			current = current.getNext();
		}
		while(headL2 != null) {
			current.setNext(new Node<Integer>(headL2.getValue()));
			headL2 = headL2.getNext();
			current = current.getNext();
		}
		
		return L3.getNext();	
	}
	
public static Node<Integer> ex2(Node<Integer> list){
	Node<Integer> dummy = new Node <Integer>(-1,list);
	Node<Integer> head = new Node<Integer> (-1);
	Node<Integer> p = dummy;
	Node<Integer> h = head;
		
	while (dummy.hasNext()) {
		p = dummy;
		Node <Integer> m = dummy;
		int min = p.getNext().getValue();

	while (p.hasNext()) {
		if (p.getNext().getValue() < min) {
			m = p;
			min = p.getNext().getValue();
		}
	p = p.getNext();
	}

	h.setNext(m.getNext());
	h = h.getNext();
	m.setNext(m.getNext().getNext());
	}
	return head.getNext();
}
	

public static Node<Integer> ex2b(Node<Integer> list){
	Node<Integer> dummy = new Node<Integer> (-1,list);
	Node<Integer> p = dummy; // current
	Node<Integer> last = dummy;

	while(last.hasNext()) {
	p = last;
	Node<Integer> m = dummy;
	int min = p.getNext().getValue();

	while (p.hasNext()) {
	if (p.getNext().getValue()<min) {
	m = p;
	min = p.getNext().getValue();
	}
	p = p.getNext();
	}

	last.setNext(m.getNext());
	last = last.getNext();
	last.setNext(m);
	m.setNext(m.getNext().getNext());
	}
	return dummy.getNext();
}
	
	

	public static void main(String[] args) {

		Node<Integer> node5 = new Node<>(9);
		Node<Integer> node4 = new Node<>(7, node5);
		Node<Integer> node3 = new Node<>(3, node4);
		Node<Integer> node2 = new Node<>(2, node3);
		Node<Integer> node1 = new Node<>(1, node2);  // L1
			
			
		Node<Integer> nodeA = new Node<>(9);
		Node<Integer> nodeB = new Node<>(7, nodeA);
		Node<Integer> nodeC = new Node<>(4, nodeB);
		Node<Integer> nodeD = new Node<>(3, nodeC);
		Node<Integer> nodeE = new Node<>(2, nodeD);  // L2
		    
	
    		System.out.println("exe 1: ");
		System.out.println(mergeLists(node1,nodeE));
    		System.out.println(" ");
		}

	}

}
