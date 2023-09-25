import java.util.Scanner;
public class lab6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter the range=");
        n = sc.nextInt();
        while(n>0){
            n=n/10;
            count=count+1;
        }
        System.out.println(count);
    }
}