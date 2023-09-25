import java.util.Scanner;
public class class_8 {
    public static void main(String[] args) {
        int count=0,count1=0,count2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>=65 && a.charAt(i)<=90 || a.charAt(i)>=97 && a.charAt(i)<=122)
            count = count +1;
            else if(a.charAt(i)>='0' && a.charAt(i)<='9')
            count1 = count1+1 ;
            else
            count2 = count2+1;
        }
        System.out.println("The number of alphabets are:"+count);
        System.out.println("The number of digits are:"+count1);
        System.out.println("The number of special characters are:"+count2);
    }
}
