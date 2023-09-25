import java.util.Scanner;
public class lab6_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,t;
        System.out.println("Enter the table number=");
        n = sc.nextInt();
        i=1;
        while(i<=10){
            t= n*i;
            System.out.println(t);
            i++;
        }
    }
}