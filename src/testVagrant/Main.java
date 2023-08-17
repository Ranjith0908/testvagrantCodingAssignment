package testVagrant;



import testVagrant.LinkedList.Node;

public class Main {
	
		
	public static void main( String []args ) {
		LinkedList test = new LinkedList();
		test.insertatBeginning("s1");
		test.insertatBeginning("s2");
		test.insertatBeginning("s3");
		test.insertatBeginning("s4");
		
		LinkedList.removeDuplicate();
		test.display();
		
		
	}
	
}


// 1 2 3 4 5
//s2 s4 s3
