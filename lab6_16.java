import java.util.Scanner;
public class lab6_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,rev=0;
        System.out.println("Enter the number to find the reverse=");
        n = sc.nextInt();
        while(n>0){
            rev = (rev*10) + n%10;
            n = n/10;
        }
        System.out.println("The reverse of given number is="+rev);
    }
}
