import java.util.Scanner;
public class lab6_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,num=0;
        System.out.println("Enter the numebr to print in words=");
        n = sc.nextInt();
        while(n!=0){
            num = (num*10) + (n%10);
            n = n/10;
        }
        // print digits in number..
        while(n>0){
            switch(n%10){
                case 0:
                System.out.println(" Zero ");
                break;
                case 1:
                System.out.println(" One ");
                break;
                case 2:
                System.out.println(" Two ");
                break;
                case 3:
                System.out.println(" Three ");
                break;
                case 4:
                System.out.println(" Four ");
                break;
                case 5:
                System.out.println(" Five ");
                break;
                case 6:
                System.out.println(" Six ");
                break;
                case 7:
                System.out.println(" Seven ");
                break;
                case 8:
                System.out.println(" Eight ");
                break;
                case 9:
                System.out.println(" Nine ");
                break;
            }
            num = num / 10;
        }
        
    }
}
