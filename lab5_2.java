import java.util.Scanner;
public class lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the 1st number=");
        a= sc.nextInt();
        System.out.println("Enter the 2nd number=");
        b = sc.nextInt();
        System.out.println("Enter the 3rd number=");
        c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("The greater number is"+a);
        }
        else if(b>c && b>a)
        System.out.println("The greater nnumber is"+b);
        else 
        System.out.println("The greater number is "+c);
    }
}
