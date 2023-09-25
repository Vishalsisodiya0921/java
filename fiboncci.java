import java.util.Scanner;
public class fiboncci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x=0,y=1,z=0,term=0;
        System.out.println("Enter the max value");
        n= sc.nextInt();
        while(z<=n){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
            term = term +1;
        }
        System.out.println("The Count of the given series is="+term);
    }
}
