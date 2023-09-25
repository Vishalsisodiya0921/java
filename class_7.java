import java.util.*;
public class class_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = sc.nextLine();
        String k= "";
        for(int i =0;i<a.length();i++)
        {
            if(a.charAt(i)>=65 && a.charAt(i)<=90)
            k=k+(char)(a.charAt(i)+32);
            else
            k=k+(char)(a.charAt(i)-32);
        }
        System.out.println(k);
    }
}
