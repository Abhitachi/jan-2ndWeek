package jan4;


class Node{
	int value;
	Node next;
	Node(int value,Node next){
		this.value = value;
		this.next= next;
	}

}


public class FindingKthelement {
	
	public static void  findKthendElement(Node head,int k) {
    	Node curr = head;
    	int count = 0;
    	while(curr!=null) {
    		count++;
    		curr=curr.next;
    	}

    	System.out.println(count);
    	if(count>=k) {
    		curr= head;
    		for(int i=0;i<count-k;i++)
    			curr=curr.next;
    		System.out.println(curr.value);
    	}
    	else 
    		System.out.println("Wrong Input");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		int input[] = {1,2,3,4,5};
		for(int i=input.length-1;i>=0;i--) {
			head = new Node(input[i],head);
		}
		int k = 4;

		findKthendElement(head,k);

	}

}
