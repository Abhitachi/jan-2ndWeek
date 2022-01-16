package jan4;

public class RemoveDupli {
	public static void removeduplicates(Node head) { 
		Node curr =head;
		Node prev = curr;
		while(curr.next!=null) {
			prev =curr;
			curr= curr.next;
			if(prev.value==curr.value) {
				prev.next= curr.next;
			}

		}
		curr=head;
		while(curr!=null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = null;
		int input1[] = {1,2,3,3,4,5,5,6,6,7,8,8};
		for(int i=input1.length-1;i>=0;i--) {
			head1 = new Node(input1[i],head1);
		}

		removeduplicates(head1);


	}

}
