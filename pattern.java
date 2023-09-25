import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int a,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        a = sc.nextInt();
        for(i=0;i<a;i++)
         for(j=0;j<=i;j++){
            System.out.println("*");
        }
    }
}

