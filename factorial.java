//WAP To find out the Factorial of the given number...
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int fac=1,n;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number to find factorial=");
        n= sc.nextInt();
        while(n>0){
            fac = fac*n;
            n=n-1;
        }
        System.out.println("The Factorial of the number is="+fac);
    }
}
