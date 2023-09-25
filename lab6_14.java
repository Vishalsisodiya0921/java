import java.util.Scanner;
public class lab6_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the number to check=");
        n = sc.nextInt();
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println("The sum of digits of a number is ="+sum);
    }
}

