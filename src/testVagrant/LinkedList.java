package testVagrant;

import java.util.HashSet;
import java.util.Set;


public class LinkedList {
	Node head;
	class Node{
		String data;	
		Node next;
		public String val;
		Node(String val){
			data = val;
			next = null;
		}
	}
	 LinkedList(){
		head = null;
	}
	public void insertatBeginning(String val) {
		Node temp = head;
		int count=1;
		while(temp!=null && count<3) {
			count++;
		//	System.out.print(count);
			if(count==3) {
				temp.next= null;
			}
			temp=temp.next;
		}
		Node newNode = new Node(val);
		
	
		if(head==null) {
			head = newNode;
		}
			else {
				newNode.next = head;
				head = newNode;
		}
	}
	public Node removeDuplicate()
    {
        
        HashSet<String> duplicate = new HashSet<>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            String current1 = current.data;
            
            
			if (duplicate.contains(current1)) 
                previous.next = current.next;
            
            else {
                duplicate.add(current1);
                previous = current;
            }
            current = current.next;
        }
        return head;
    }
	  
 
	public void display() {
     Node temp = head;
     while(temp!= null) {
    	 System.out.print(temp.data);
    	 temp = temp.next;
     }
		
	}
	
	
}
