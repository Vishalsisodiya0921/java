import java.util.Scanner;
public class selSort {
    int a[]= new int[10];
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the number:");
            a[i] = sc.nextInt();
        }
    }
    void putdata()
    {
        int i;
        for(i=0;i<10;i++) 
        {
            System.out.println(a[i]);
        }       
    }
    void sort()
    {
        int i,j,t;
        for(i=0;i<9;i++)
        for(j=i+1;j<10;j++)
        {
            if (a[i]>a[j])
            {
                t= a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
    }
}
class demo3
{
    public static void main(String[] args) {
        selSort aa = new selSort();
        aa.getdata();
        System.out.println("Unsorted array ");
        aa.putdata();
        System.out.println("Sorted array ");
        aa.sort();
        aa.putdata();
    }
}
