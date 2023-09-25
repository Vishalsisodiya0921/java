import java.util.Scanner;
public class class_10 {
    public static void main(String[] args) {
        int count=0,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>=65 && a.charAt(i)<=90 || a.charAt(i)>=97 && a.charAt(i)<=122 )
            count = count +1;
            else
            j++;
        }
        System.out.println("The number of spaces are:"+j);
        System.out.println("The number of alphabets are:"+count);
    }
}

