import java.util.Scanner;
class bubblesort{
    int a[] = new int[10];
    void getdata()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++){
        System.out.println("Enter the number=");
        a[i] = sc.nextInt();
        }
    }
    void putdata()
    {
        int i=0;
        for(i=0;i<10;i++)
        System.out.println(a[i]);
    }
    void sort()
    {
        int i,j,t;
        for(i=0;i<10;i++)
        for(j=0;j<9-i;j++)
        {
            if(a[i]>a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
}
class demo {
    public static void main(String[] args) {
        bubblesort aa = new bubblesort();
        aa.getdata();
        System.out.println("Unsorted Arrays=");
        aa.putdata();
        System.out.println("Sorted data=");
        aa.sort();
        aa.putdata();
    }
}