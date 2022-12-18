package Array;

public class prfixcode {
    public static void main(String args[])
    {
        int arr[]={4,-3,2,1,-5};
        sum(arr);
    }
    public static void sum(int arr[])
    {
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            pre[i]=pre[i-1]+arr[i];
        }
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
    
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                if(start==0)
                {
                    currsum=pre[end];
                }
                else{
                    currsum=pre[end]-pre[start-1];
                }
                
                if(maxsum<currsum)
                {
                    maxsum=currsum;
                }
                   

            }
           
           
        }
        
        System.out.println("This is the maximum sum of subarrays "+maxsum);
    }
}
