import java.util.Scanner;
public class lab7_2 {
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
        if(a[i]<0){
            System.out.println(a[i]);
        }
    }
}
