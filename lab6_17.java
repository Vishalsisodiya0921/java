import java.util.Scanner;
public class lab6_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,rev=0,orig;
        System.out.println("Enter the numebr to check=");
        n = sc.nextInt();
        orig = n;
        while(n>0){
            rev = (rev*10) + n%10;
            n = n/10;
        }
        if(rev==orig)
        System.out.println("The number is palindrome");
        else
        System.out.println("The number is not Palindrome");
    }
}
