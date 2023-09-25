import java.util.Scanner;
public class lab6_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,i,sum=0;
        i=1;
        System.out.println("Enter the range=");
        a = sc.nextInt();
        while(i<=a){
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("sum of Odd="+sum);
    }
}