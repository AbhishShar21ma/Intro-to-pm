package Array;

public class binarysearch {
    public static void main(String args[])
    {
        int arr[]={22,33,34,55,66,778,999,6640};
        int mrr[] =new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int j=(arr.length-1)-i;
            {
               mrr[i]=arr[j]; 
            }

        }
        for(int i=0;i<arr.length;i++)
        {
                System.out.println(mrr[i]+"   ");
        }


        binsearch(arr,66);
        binsearch(arr,69);
        binsearch(arr,6640);
        binsearch(arr,669);
        swap(arr);

    }
    public static void binsearch(int arr[],int n)
    {   
        int beg=0;
        int last=arr.length;

        int mid;int m=0;
        for(int i=1;i<=arr.length;i++)
        {     mid=(last+beg)/2;
            if(arr[mid]==n)
            {   
                m++;
                System.out.println("Entered number is present at the position "+ (mid+1));
                break;
            }
          
          else if(arr[mid]<n)
            {   
                beg=mid+1;
                continue;
                
            }
            else if(arr[mid]>n)
            {
                last=mid-1;
                continue;
            }

        }

        if(m==0)
        {
            System.out.println("Entered number is not present ");
        }

       
       
    }




    
}
