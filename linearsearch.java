import java.util.Scanner;
public class linearsearch {
    int a[] = new int[10];
    int key;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the value:");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search");
        key = sc.nextInt();
    }
    void search()
    {
        int i,flag=0,pos=0;
        for(i=0;i<10 && flag==0;i++)
        {
            if(a[i]==key)
            {
                flag=1;
                pos = i+1;
            }
        }
        if(flag==1)
        System.out.println("Number found at :"+pos);
        else
        System.out.println("Number not found");
    }
}
class demo
{
    public static void main(String[] args) {
        linearsearch aa = new linearsearch();
        aa.getdata();
        aa.search();
    }
}
