import java.util.Scanner;
public class lab6_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number to check=");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
