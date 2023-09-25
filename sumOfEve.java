// WAP To Print the sum of even numbers and Products of Odd numbers...
import java.util.Scanner;
public class sumOfEve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0,pro=1,digit;
        System.out.println("Enter the number for which you find sum and product=");
        n = sc.nextInt();
        while(n>0){
            digit=n%10;
            if(digit%2==0){
                sum = sum + digit;
            }
            else{
                pro = pro*digit;
            }
            n=n/10;
        }
        System.out.println("Sum of even digits="+sum+"Product of odd Digits="+pro);
    }
}
