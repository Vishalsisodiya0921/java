import java.util.Scanner;
public class sumRow {
    int i,j;
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        int i=j=0;
        System.out.println("Enter the Elements for Matrix A");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.print("Enter the number:");
            a[i][j] = sc.nextInt();
        }
        System.out.println("Enter the Elements for matrix B:");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.println("Enter the number:");
            b[i][j] = sc.nextInt();
        }
    }
    void putdata()
    {
        System.out.println("The first matrix is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(a[i][j]+"    ");
            }
        }
        System.out.println("The Second matrix is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(b[i][j]+"    ");
            }
        }
    }
    void sum()
    {

    }
}
class sumofRow {
    public static void main(String[] args) {
            sumRow ab = new sumRow();
            ab.getdata();
            ab.putdata();
            ab.sum();    
    }
}






