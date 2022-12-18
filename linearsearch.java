package Array;

public class linearsearch {
    public static void main(String args[])
    {
        int marks[]={1,2,3,4,5,6,7,89,12};
        
        check(marks,10);
        check(marks,0);
        check(marks,12);
        check(marks,4);
        largest(marks);
    
    }
    public static void check(int marks[],int n)
    {int p=0;
        for(int i=0;i<marks.length;i++)
        {
            if(n==marks[i])
            {   
                p=1;
                System.out.println("The number is present at the position " + (i+1));
                break;
            }
            else
            {
                continue;
            }
           
        }
        if(p==0)
        {
            System.out.println("The number is not present in the list");
        }
    }
    public static void largest(int marks[])
    {
        int p=0;int m=0;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>p)
            {
                p=marks[i];
                m=i;
            }
        }
        System.out.println("The largest number in the given list= " +p + " Present at the position " + (m+1));
    }
}
