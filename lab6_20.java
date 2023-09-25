import java.util.Scanner;
public class lab6_20 {
    public static void main(String[] args) {
        System.out.println("Enter the character:");
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        int asciiVal = chr;
        System.out.println("ASCII value of "+chr+"is:"+asciiVal);
    }
}
