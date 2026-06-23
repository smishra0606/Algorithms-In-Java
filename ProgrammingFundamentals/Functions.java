package ProgrammingFundamentals;

public class Functions {
    
    //function with no return type
    public static void func1(int num){
        System.out.println("The value of num is: " + num);
    }

    //function with return type
    public static int func2(int num){
        return num*2;
    }
    
    //main function
    public static void main(String[] args) {
        int num=20;
        func1(10);
        System.out.println(func2(num));
        System.out.println(num);
    }    
}
