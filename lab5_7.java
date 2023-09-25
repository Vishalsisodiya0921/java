import java.util.Scanner;
public class lab5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;
        System.out.println("Enter the year=");
        a= sc.next().charAt(0);
        if((a>='a' && a<='z')||(a>='A'&&a<='Z')){
            System.out.println("The Given characters are alphabet");
        }
        else
        System.out.println("The given characters are not alphabets");
    }
}