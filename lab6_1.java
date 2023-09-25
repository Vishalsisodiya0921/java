import java.util.Scanner;
public class lab6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        i=1;
        System.out.println("Enter the range=");
        n = sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i=i+1;
        }
    }
}
