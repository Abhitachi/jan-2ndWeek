package jan4;

public class Merge2SortedLL {
	public static Node merge(Node head1,Node head2) {
		Node newhead;
		if(head1.value<head2.value) {
			newhead=head1;
			head1 = head1.next;
		}
		else {
			newhead=head2;
			head2=head2.next;
		}
		Node cur = newhead;
		while((head1!=null)||(head2)!=null) {
			if(head1==null) {
				cur.next=head2;
				return newhead;
			}
			else if(head2==null) {
				cur.next =head1;
				return newhead;
			}
			if(head1.value<head2.value) {
				cur.next=head1;
				cur = cur.next;
				head1 =head1.next;
			}
			else {
				cur.next=head2;
				cur = cur.next;
				head2 = head2.next;
			}
		}
		cur.next=null;
		return newhead;

		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = null;
		int input1[] = {5,10,11};
		for(int i=input1.length-1;i>=0;i--) {
			head1 = new Node(input1[i],head1);
		}
		Node head2 =null;
		int input2[] = {3,4,5,6,9};
		for(int i=input2.length-1;i>=0;i--) {
			head2= new Node(input2[i],head2);
	}
		Node newlist = merge(head1,head2);
		while(newlist!=null) {
			System.out.println(newlist.value);
			newlist = newlist.next;
}
	}

}
