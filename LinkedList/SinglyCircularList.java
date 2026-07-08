package LinkedList;

public class SinglyCircularList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //inserting at the end of the list
    public static void insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.next=head;
    }

    public static Node insertAtBeginning(Node head, int data){
        Node newNode=new Node(data);
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.next=head;
        return newNode;
    }

    //printing the list
    public static void printList(Node head){
        Node curr=head;
        do{
            System.out.println(curr.data);
            curr=curr.next;
        }while(curr!=head);
    }

    public static void main(String[] args){
        Node head=new Node(0);
        head.next=head;
        insertAtEnd(head,1);
        insertAtEnd(head,2);
        insertAtEnd(head,3);
        insertAtEnd(head,4);
        head=insertAtBeginning(head, 9);
        printList(head);
    }
}