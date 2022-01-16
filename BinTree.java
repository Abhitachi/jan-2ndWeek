package jan4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
public class BinTree {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static int levelSoFar=0;		 
	static int getHeight(Node node)
    {
        if (node == null)
            return -1;
        else
        {
            int lheight = getHeight(node.left);
            int rheight = getHeight(node.right);
            if (lheight >= rheight)
                return (lheight + 1);
             else
                return (rheight + 1);
        }
    }

	static String print_leafNodes(Node root){

		    Stack<Node> s1 = new Stack<>();
		    Stack<Node> s2 = new Stack<>();
		    String str="";
		    s1.push(root);
		    while (!s1.empty())
		    {
		    	Node curr = s1.peek();
		        s1.pop();
		        if (curr.left!=null)
		            s1.push(curr.left);
		        if (curr.right!=null)
		            s1.push(curr.right);
		        else if (curr.left==null && curr.right==null)
		            s2.push(curr);
		    }
		    while (!s2.empty())
		    {
		        str+=(s2.peek().key);
		        s2.pop();
		    }
		    return str;
	}

	static void PrintKthLevel(Node root, int k) {
		if(root==null) return;

		if(k==0) {
			System.out.print(root.key+" ");
		}
		PrintKthLevel(root.left, k-1);
		PrintKthLevel(root.right, k-1);
	}


	static void levelTraversal(Node root) {
		int h = getHeight(root);

		for(int i=0;i<=h;i++) {
			PrintKthLevel(root, i);
			System.out.println();
		}
	}
    static void average_levels(Node root) {
    	Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			int sum =0;
			int total =0;
			Queue<Node> temp = new LinkedList<>();
			while(!q.isEmpty()){
				Node curr = q.poll();
				sum+=curr.key;
				total++;
				if(curr.left!=null) {
					temp.add(curr.left);
				}
				if(curr.right!=null) {
					temp.add(curr.right);
				}
			}
			double avg = (double)sum/(double)total;
			System.out.format("%.1f  ",avg);

			q=temp;
		}
		System.out.println();
    }
    static boolean hasPathSum(Node root,int n) {
    	Stack<Node> nodes = new Stack<Node>();
    	Stack<Integer> sums = new Stack<>();
    	Node curr = root;
    	int pathsum=0;
    	nodes.add(null);
    	sums.add(0);
    	while(!nodes.empty()) {
    		while(curr!=null) {
    			nodes.push(curr.right);
    			pathsum+=curr.key;
    			sums.push(pathsum);
    			curr = curr.left;
    		}
    		pathsum = sums.pop();
    		curr= nodes.pop();
    		if(curr == null && pathsum ==n)
    			return true;
    	}
    	return false;
    }
	static void LevelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while(!q.isEmpty()){
			int k = q.size();
			while(k>0){
				Node front = q.poll();
				if(front.left!=null){
					q.add(front.left);
				}
				if(front.right!=null){
					q.add(front.right);
				}
				System.out.print(front.key+" ");
				k--;
			}
			System.out.println();
		}
	}
	static void RightViewOfTree(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Node curr = null;

		while(!q.isEmpty()){
			int size=q.size();
			int i=0;
			while(i++<size) {
				curr=q.poll();
				if(i==size) {
					System.out.println(curr.key);
				}
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.right = new Node(6);
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		root2.left.right = new Node(5);
		root2.right.right = new Node(6);
		 levelTraversal(root1);
		 PrintKthLevel(root1, 2);
		 System.out.println();
		 LevelOrderTraversal(root1);
	     RightViewOfTree(root1);
	   String s1 =  print_leafNodes(root1);
       String s2 = print_leafNodes(root2);
       if(s1.equals(s2)) {
    	   System.out.println("Same");
       }
       else
    	   System.out.println("Not Same");

       average_levels(root1);
       System.out.println(hasPathSum(root1,11));
		
	}

}
