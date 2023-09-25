import java.util.Scanner;
public class mulOfmatrix {
    int i,j;
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements for matrix A");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.print("Enter the number:");
            a[i][j] = sc.nextInt();
        }
        System.out.println("Enter the Element of Matrix B");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.print("Enter the number:");
            b[i][j] = sc.nextInt();
        }
    }
    void putdata()
    {
        System.out.println("Thr first Matrix is:");
        for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"    ");
            }
        System.out.println();
        }
        System.out.println("The Second Matrix is:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(b[i][j]+"    ");
            }
            System.out.println();
        }
    }
    void multiply()
    {
        int k;
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            c[i][j] = 0;
            for(i=0;i<3;i++)
            for(k=0;k<3;k++)
            {
                c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
            System.out.println("Multiplication is:");
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
}
class xyz_3 {
    public static void main(String[] args) {
        mulOfmatrix az = new mulOfmatrix();
        az.getdata();
        az.putdata();
        az.multiply();
    }
}
