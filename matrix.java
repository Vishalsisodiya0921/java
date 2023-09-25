import java.util.Scanner;
public class matrix {
    int a[][] = new int[3][3];
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.println("Enter the number:");
            a[i][j] = sc.nextInt();
        }
    }
    void putdata()
    {
        int i,j;
        for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
        {
            System.out.print(" "+a[i][j]+"    ");
        }
        System.out.println();
        }
    }
}
class xyz {
    public static void main(String[] args) {
        matrix aa = new matrix();
        aa.getdata();
        aa.putdata();
    }
}
