package Array;

import javax.xml.stream.events.EndDocument;

public class subarrays {
    public static void main(String args[]) 
    {
     int arr[]={1,-2,6,-1,3};
     pair(arr);
     prefix(arr);
    }
    public static void pair(int arr[])
    {
        int p=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++)
     {
        System.out.println("["+arr[i]+"]");

         for(int j=i+1;j<arr.length;j++)
         { int m=i+1;
            int sum=arr[i];
            System.out.print("["+arr[i]);
            while(m<=j)
            {
             System.out.print(","+arr[m]);
             sum=sum+arr[m];
             m++;
            }System.out.print("]");

            System.out.println("Sum of the given array"+ sum);
            if(sum>p)
            {
                p=sum;
            }
            System.out.println();
         }System.out.println();
         System.out.println("Hightest of the given sum"+ p);
     } 



    }
    public static void prefix(int arr[])
    {    
        int pre[]=new int [arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {   
            pre[i]=pre[i-1]+arr[i];
            


        }
        for(int i=0;i<arr.length;i++)
     {
        System.out.print("["+pre[i]+"]   ");
     }


     int maxsum=Integer.MIN_VALUE;
     int cum=0;
     int end;
     for(int i=0;i<pre.length;i++)
     {
        int start=i;
        for(int j=i;j<pre.length;j++)
        {
           end=j;
            if(start==0)
            {
                cum=pre[end];
            }
            else
            {
                cum=pre[end]-pre[start];
            }
        }
        if(cum>maxsum)
     {
        maxsum=cum;
     }
     }
    
     System.out.println("The max sum if the array"+maxsum);


    }

}
