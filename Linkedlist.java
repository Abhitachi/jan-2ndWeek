package DSA.LinkedList;

import java.util.LinkedList;

public class Linkedlist {
    Node head;                          //its a global variable so that linkedlst can access it.
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data=d;
            next=null;
        }
    }

    public static Linkedlist insert(Linkedlist list,int data){
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
        return list;
    }

    public static void printlist(Linkedlist list){
        Node currentNode = list.head;
        System.out.println("Linkedlist:");

        while(currentNode != null){
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }         
    }

    public static Linkedlist deletebykey(Linkedlist list,int key){
        Node currentNode = list.head;
        Node previous=null;


        if(currentNode != null && currentNode.data == key){
            list.head=currentNode.next;
            System.out.println(key+" found and deleted");
            return list;
        }


        while(currentNode != null && currentNode.data != key){
            previous = currentNode;
            currentNode=currentNode.next;
        }

        if(currentNode != null){
            previous.next=currentNode.next;
            System.out.println(key+" found and deleted");
        }


        if(currentNode==null){
            System.out.println(key+" found and deleted");
        }

        return list;
    }

    public static Linkedlist deletebyposition(Linkedlist list,int index){
        Node currentNode = list.head;
        Node previous=null;

        if(index==0 && currentNode!=null){
            list.head=currentNode.next;
            System.out.println(index+" found and deleted");
            return list;
        }

        int count=0;
        while(currentNode !=null){
            if(count==index){
                previous.next=currentNode.next;
                System.out.println(index+" found and deleted");
                break;
            }else{
                previous=currentNode;
                currentNode=currentNode.next;
                count++;
            }
        }


        if(currentNode==null){
            System.out.println(index+" found and deleted");
        }
        return list;
    }

   

    public static void main(String[] args){
        Linkedlist ll=new Linkedlist();
        ll=insert(ll,1);
        ll=insert(ll,2);
        ll=insert(ll,3);
        ll=insert(ll,5);
        ll=insert(ll,4);

        deletebykey(ll, 1);
        deletebykey(ll, 3);
        deletebykey(ll, 4);

        deletebyposition(ll, 1);
        deletebyposition(ll, 5);
        // deletebyposition(ll, 4);

        printlist(ll);
       
        System.out.println(ll);
    }
}
