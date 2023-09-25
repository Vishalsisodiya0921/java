import java.util.Scanner;
public class lab5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter the character to check");
        ch= sc.next().charAt(0);
        if((ch>='a' && ch<='z')){//((ch>=97 && ch<=122)||(ch>=65 && ch<=90))
            System.out.println(ch+" is lower case ");
        }
        else if(ch>='A'&& ch<='Z')
        System.out.println(ch+" is Upper case");
    }
}