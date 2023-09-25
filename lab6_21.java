import java.util.Scanner;
public class lab6_21 {
    public static void main(String[] args) {
        int base,x,pro=1;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the base=");
        base= sc.nextInt();
        System.out.println("Enter the exponent=");
        x= sc.nextInt();
        while(x>0){
            pro = pro*base;
            x--;
        }
        System.out.println("The power of the number is="+pro);
    }
}
