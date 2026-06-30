package ProgrammingFundamentals;
import java.util.*;
class recursion{
    public static int number(int n){
        if(n==10) return 1;
        System.out.println(n);
        return number(n+1);

    }
    public static void main(String[] args){
        int n = 5;
        number(n);
    }
}