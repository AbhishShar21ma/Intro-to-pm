package Array;

import java.util.*;
public class passbyargu {
    public static void main(String args[])
    {   int arraylength;
        System.out.println("Enter the lenth of array=");
        Scanner sc=new Scanner(System.in);
        arraylength =sc.nextInt();
        int arr[]= new int[arraylength];
        for(int i=0;i<arraylength;i++)
        {
          arr[i]=sc.nextInt();
        }
        update(arr,arraylength);
        System.out.println("After updation of arrray");
        for(int i=0;i<arraylength;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void update(int arr[],int  arraylength)
    {
        for(int i=0;i<arraylength;i++)
        {
          arr[i]=arr[i]+600;
        }
    }
    
}
