package LinkedList;

class basic{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void insertAtEnd(Node head,int data){
        Node newNode=new Node(data);
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }   

    public static void insertAtBeginning(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

    public static void insertAtPosition(Node head,int data,int pos){
        Node newNode=new Node(data);
        Node curr=head;
        for(int i=1;i<pos-1;i++){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }

    public static void main(String[] args){
        Node head=new Node(0); 
        insertAtEnd(head,1);
        insertAtEnd(head,2);
        insertAtEnd(head,3);
        insertAtEnd(head,4);
        insertAtBeginning(head,5);
        printList(head);
    }
}