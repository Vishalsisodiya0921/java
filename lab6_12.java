import java.util.Scanner;
public class lab6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,last,first;
        System.out.println("Enter the number to check=");
        n = sc.nextInt();
        last = n%10;
        first = n;
        while(first>=10){
            first = first/10;
        }
        System.out.println("The sum of first and last digit is="+(first+last));
    }
}

