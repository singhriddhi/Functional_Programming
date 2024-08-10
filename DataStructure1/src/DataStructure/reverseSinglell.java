package DataStructure;


//Write a Java program to reverse a singly linked list
public class reverseSinglell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static Node reversell(Node head) {
		Node pre=null;
		Node curr=head;
		while(curr!=null) {
		Node temp=curr.next;
		curr.next=pre;
		pre=curr;
		curr=temp;
		}
		return pre;
		
	}

}
