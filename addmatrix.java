import java.util.Scanner;
public class addmatrix {
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    void getdata()
    {
        Scanner sc =  new Scanner(System.in);
        int i,j;
        i=j=0;
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.print("Enter the number for matrix A:");
            a[i][j] = sc.nextInt();
        }
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.print("Enter the number for matrix B:");
            b[i][j] = sc.nextInt();
        }
    }
    void add()
    {
        int i,j;
        i=j=0;
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            c[i][j] =a[i][j] + b[i][j];//for Subtraction c[i][j]=a[i][j] - b[i][j];
        }
    }
    void putdata()
    {
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"    ");
            }
        System.out.println();
        }
    }
}
class xyz2 {
    public static void main(String[] args) {
        addmatrix ab = new addmatrix();
        ab.getdata();
        ab.add();
        ab.putdata();
        
    }
}
