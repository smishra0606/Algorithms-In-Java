package LinkedList;

public class DeleteHeadInCircularLinkedList {
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

    //deleting the head
    public static void deleteHead(Node head){
        if(head==null) return;
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=head.next;
        head.next=null;
    }

     //printing the list
    public static void printList(Node head){
        Node curr=head;
        do{
            System.out.println(curr.data);
            curr=curr.next;
        }while(curr!=head);
    }

    public static void main(String[] args) {
        Node head=new Node(0);
        head.next=head;
        insertAtEnd(head,1);
        insertAtEnd(head,2);
        insertAtEnd(head,3);
        insertAtEnd(head,4);
        deleteHead(head);
        printList(head);
    }
    
}
