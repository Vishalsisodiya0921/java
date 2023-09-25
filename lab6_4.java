import java.util.Scanner;
public class lab6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,i;
        i=1;
        System.out.println("Enter the range=");
        a = sc.nextInt();
        while(i<=a){
            if(i%2!=0)
            System.out.println("odd="+i);
            else
            System.out.println("even="+i);
            i++;
        }
    }
}
