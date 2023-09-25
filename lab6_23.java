import java.util.Scanner;
public class lab6_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,fac=1;
        System.out.println("Enter the number to check=");
        n = sc.nextInt();
        while(n>0){
            fac = fac*n;
            n=n-1;
        }
        System.out.println("The factorial of a given number is="+fac);
    }
}