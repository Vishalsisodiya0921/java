//WAP To print the product of the given digits of a number..
import java.util.Scanner;
public class proOfDigit {
    public static void main(String[] args) {
        int n,pro=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the product of a given number=");
        n = sc.nextInt();
        while(n>0){
            pro = pro* (n%10);
            n = n/10;
        }
        System.out.println("The product of digits of given number is="+pro);
    }
}
