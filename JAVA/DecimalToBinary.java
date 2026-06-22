package JAVA;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        //Decimal to binary
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
        int pow=1;
        while(num>0){
            int rem=num%2;
            ans+=rem*pow;
            pow*=10;
            num/=2;
        }
        System.out.println(ans);
    }
}
