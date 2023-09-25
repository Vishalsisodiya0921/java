import java.util.Scanner;
public class array_1 {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the number=");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        System.out.println(a[i]);

    }
}
