// WAP To print whether the number is palindrome or not...
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,orig,rev=0;
        System.out.println("Enter the number to check the number=");
        n= sc.nextInt();
        orig=n;
        while(n>0){
            rev = (rev*10) + n%10;
            n = n/10; 
        }
        if(rev==orig){
            System.out.println("The number is Pallindrome");
        }
        else{
            System.out.println("The number is not Palindrome");
        }
    }
}
