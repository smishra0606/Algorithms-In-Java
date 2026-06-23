package ProgrammingFundamentals;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int ans1=0;
        int pow1=1;
        while(num1>0){
            int rem=num1%10;
            ans1+=rem*pow1;
            pow1*=2;
            num1/=10;
        }
        System.out.println(ans1);
    }
}
