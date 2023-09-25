import java.util.Scanner;
public class lab7_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Value :");
        for(int i=0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        
    }
}
