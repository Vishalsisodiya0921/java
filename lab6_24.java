import java.util.Scanner;
public class lab6_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,i,hcf=0;
        System.out.println("Enter the 1st number to check=");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number to check=");
        b = sc.nextInt();
        for(i=1 ;i<=a || i<=b ;i++){
            if(a%i ==0 && b%i==0)
            hcf = i;
        }

        System.out.println("The HCF of given number is="+hcf);
    }
}