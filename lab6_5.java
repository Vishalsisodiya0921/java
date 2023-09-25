import java.util.Scanner;
public class lab6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,i;
        i=1;
        System.out.println("Enter the number under 100 =");
        a = sc.nextInt();
        while(i<=a){
            if(i%2!=0)
            System.out.println("odd="+i);
            i++;
        }
    }
}
