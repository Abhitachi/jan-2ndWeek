package DSA.LinkedList;
class SearchingElementInLL{
     Node head;
    static class Node{
        private int data;
        private Node next;
        Node(int d){
            this.data=data;
            next=null;
        }
    }

    public  void insert(SearchingElementInLL list,int data){
        // Node newnode=new Node(data);
        // newnode.next=head;
        // head=newnode;
        Node new_node=new Node(data);
        if(list.head==null){
            list.head = new_node;
        }else{
            Node current = list.head;
            while(current.next != null){
                current=current.next;
            }
            current.next=new_node;
        }

        System.out.println(list);
    }

    public int search(Node head,int key){
        int count=-1;
        Node current=head;
        while(current != null){
            if(current.data==key){
                return count;
            }
            ++count;
        }
        return count;
    }
    public static void main(String[] args){
       SearchingElementInLL List =new SearchingElementInLL();
        List.insert(List,1);
        List.insert(List,2);
        List.insert(List,5);
        List.insert(List,6);
        List.insert(List,8);
        System.out.println(List);
        System.out.println(List.search(List.head,5));
    }
}
