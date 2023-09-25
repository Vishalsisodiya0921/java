import java.util.Scanner;
public class lab6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Enter the range=");
        n = sc.nextInt();
        i=n;
        while(i>0){
            System.out.println(i);
            i=i-1;
        }
    }
}
