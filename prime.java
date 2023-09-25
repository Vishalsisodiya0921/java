//WAP To check whether the Number is Prime or not...
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n,count=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check=");
        n = sc.nextInt();
        i=1;
        while(i<=n){
            if(n%i==0){
                count=count+1;
            }i=i+1;
        }
        if(count==2){
            System.out.println("The number is Prime");
        }
        else{
            System.out.println("The number is not Prime");
        }
    }
}
