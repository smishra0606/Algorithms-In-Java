public class pascal {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(factorial(i)/(factorial(j)*factorial(i-j))+" ");
            }
            System.out.println();
        }
    }
    private static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    
}
