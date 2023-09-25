import java.util.Scanner;
public class lab6_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,pro=1;
        System.out.println("Enter the number to find the product of digits =");
        n = sc.nextInt();
        while(n>0){
            pro = pro * (n%10);
            n = n/10;
        }
        System.out.println("The product of given digit is="+pro);
    }
}