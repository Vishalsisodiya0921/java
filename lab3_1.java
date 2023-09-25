// WAP To find the area of circle...
import java.util.Scanner;
public class lab3_1 {
    double area;
    int r;
    public static void main(String[] args) {
        double r,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        r = sc.nextDouble();
        area = ((22/7.0)*r*r);
        System.out.println("The Area of circle is"+area);
    }
}
