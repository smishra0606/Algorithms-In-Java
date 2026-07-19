import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseString(String str){
        Stack<String> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            String ans="";
            while(str[i]!=' '){
                ans+=str[i];
                i++;
            }
            stack.push(ans);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args){
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
    
}
