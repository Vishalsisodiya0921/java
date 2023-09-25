import java.util.Scanner;
public class lab5_1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a,b;
            System.out.println("Enter the 1st number=");
            a= sc.nextInt();
            System.out.println("Enter the 2nd number=");
            b = sc.nextInt();
            if(a>b){
                System.out.println("The greater number is"+a);
            }
            else
            System.out.println("The greater nnumber is"+b);
    }
}
