import java.util.Scanner;
public class lab2hw {
    double per;
    String name;
    String classs;
    int roll_no;
    String email;
    float marks;
    int contact_no;

    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name=");
        name = sc.nextLine();
        System.out.println("Enter your class=");
        classs = sc.next();
        System.out.println("Enter your Roll no.=");
        roll_no = sc.nextInt();
        System.out.println("Enter your email id=");
        email = sc.next();
        System.out.println("Enter your marks=");
        marks = sc.nextFloat();
        System.out.println("Enter your contact number=");
        contact_no = sc.nextInt();

    }
    void display(){
        System.out.println(name);
        System.out.println(classs);
        System.out.println(roll_no);
        System.out.println(email);
        System.out.println(marks);
        System.out.println(contact_no);
        
    }
    void result(){
        float per = (marks/500)*100;
    }
    public static void main(String args[]){
        lab2hw sc =new lab2hw();
        sc.get();
        sc.display();
        sc.result();

    }
    
}
