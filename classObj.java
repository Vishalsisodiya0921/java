import java.util.Scanner;
public class classObj {
    int a,b; //class variable
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number=");
        a = sc.nextInt();
        System.out.println("Enter the second number=");
        b = sc.nextInt();
    }
    void putdata(){
        System.out.println("Addition id="+(a+b));
    }
    public static void main(String[] args) {
        classObj aa = new classObj();
        aa.getdata();
        aa.putdata();
    }
}