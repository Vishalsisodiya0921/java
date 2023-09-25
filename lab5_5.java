import java.util.Scanner;
public class lab5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
         System.out.println("Enter the number=");
        a= sc.nextInt();
        if(a%2==0){
            System.out.println("The number is Even");
        }
        else
        System.out.println("The number is Odd");
    }
}