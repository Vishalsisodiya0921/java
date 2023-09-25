import java.util.Scanner;
public class lab7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the value ");
        for(int i=0;i< a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n ;i++)
        //System.out.println(a[i]);
        System.out.printf("a[%d]=%d \n",i,a[i]);
    }
}
