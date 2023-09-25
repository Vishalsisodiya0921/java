// WAP To find out the reverse of given number...
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n,rev=0;
        System.out.println("Enter the number you want to find the reverse=");
        n=sc.nextInt();
        while(n>0){
            rev= (rev*10) + n%10;
            n=n/10;
        }
        System.out.println("The reverse of number is="+rev);
    }
   
}
