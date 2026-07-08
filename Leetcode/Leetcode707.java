class MyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public Node head;
    public int size;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index>=size) return -1;
        Node curr=head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        size++;
        head=newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(head==null) head=newNode;
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        size++;        
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size) return;
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
        head = dummy.next;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size) return;
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node curr=head;
        for(int i=0;i<index-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */