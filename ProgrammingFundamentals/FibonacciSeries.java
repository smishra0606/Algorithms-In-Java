package ProgrammingFundamentals;
import java.util.Scanner;
public class FibonacciSeries {
    public static int series(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        int result=series(n-1)+series(n-2);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Fib_Number: "+series(n));
    }
    
}
