package jan4;
//import class Node; 
public class IntetrsectionOfLL {
	
	public static void intersect(Node head1,Node head2) {
		Node curr = head1;

		while(curr!=null) {
			if(isPresent(curr.value,head2)) {
				System.out.println(curr.value);
			}
			curr=curr.next;
		}
	}
	public static boolean isPresent(int val,Node head){
		Node curr = head;

		while(curr!=null) {
			if(curr.value==val) {
				return true;
			}
			curr=curr.next;
		}
		return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1=null;
		int input1[] = {1,2,3,4,5};
		for(int i=input1.length-1;i>=0;i--) {
			head1 = new Node(input1[i],head1);
		}
		Node head2 =null;
		int input2[] = {3,4,5};
		for(int i=input2.length-1;i>=0;i--) {
			head2= new Node(input2[i],head2);

		}
		intersect(head1,head2);
		
	}

}
