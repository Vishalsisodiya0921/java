import java.util.Scanner;
public class binarysearch {
    int a[] = new int[10];
    int key;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<10;i++){
        System.out.println("Enter the number:");
        a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search:");
        key = sc.nextInt();
    }
    void search()
    {
        int i=0,j=9,mid,flag=0,pos=0;
        while(i<=j && flag==0)
        {
            mid = (i+j)/2;
            if(a[mid]==key)
            {
                flag=1;
                pos=mid+1;
            }
            if(a[mid]>key)
            j = mid-1;
            if(a[mid]<key)
            j = mid+1;
        }
        if(flag==0)
        System.out.println("Number not found");
        else
        System.out.println("Number found at:"+pos);
    }
}
class demo1
{
    public static void main(String[] args) {
        binarysearch aa = new binarysearch();
        aa.getdata();
        aa.search();
    }
}

