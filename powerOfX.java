import java.util.Scanner;
public class powerOfX {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x,y,pro=1;
        System.out.println("Enter base value=");
        x = sc.nextInt();
        System.out.println("Enter the power=");
        y = sc.nextInt();
        while(y>0){
            pro = pro*x;
            y--;
        }
        System.out.println("Value is="+pro);
    }
}
