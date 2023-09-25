import java.util.Scanner;
public class lab5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter the character to check");
        ch= sc.next().charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z')){//((ch>=97 && ch<=122)||(ch>=65 && ch<=90))
            System.out.println(ch+" is alphabet ");
        }
        else if(ch>=48 && ch<=57)
        System.out.println(ch+" is digit");
        else
        System.out.println(ch+" is special character");
    }
}