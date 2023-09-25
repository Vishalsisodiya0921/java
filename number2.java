//WAP To Print numbers from 1 to n..
import java.util.Scanner;
public class number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        i=1;
        System.out.println("Enter the upto which you want to print =");
        n = sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i=i+1;
        }
    }
}
