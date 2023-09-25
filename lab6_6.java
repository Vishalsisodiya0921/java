import java.util.Scanner;
public class lab6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter the range=");
        n = sc.nextInt();
        i=0;
        while(i<=n){

            sum=sum+i;
            i++;
        }
        System.out.println("sum="+sum);
    }
}