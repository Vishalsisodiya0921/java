//WAP To find the sum od given digits..
import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the number for you want to find the sum of digit=");
        n= sc.nextInt();
        while(n>0){
            sum = sum + n%10;
            n= n/10;
        }
        System.out.println("The sum of given Digits is="+sum);
    }
}
