import java.util.Scanner;
public class class_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var = sc.nextLine();
        String ch = sc.nextLine();
        int str = var.compareTo(ch);
        System.out.println(str);
    }
}
