import java.util.*;
package Trees;


public class Basics{
    static class Node{
    int data;
    Node left;
    Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    private static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
    }
}
