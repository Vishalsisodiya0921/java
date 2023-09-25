//WAP To Print sum of N natural Numbers....
import java.util.Scanner;
public class sumOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,add=0;
        System.out.println("Enter the Value to Print the sum of N numbers=");
        n = sc.nextInt();
        i=1;
        while(i<=n){
            add= add+i;
            i=i+1;
        }
        System.out.println("Addition of given numbers="+add);

    }
}
