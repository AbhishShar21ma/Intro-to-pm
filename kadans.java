package Array;
import java.lang.Math;
public class kadans{
    public static void main(String args[])
    {
        int arr[]={-4,-3,-2,-45,-5};
        kad(arr);

    }
    public static void kad(int arr[])
    {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currsum=currsum+arr[i];
        
        if(currsum<0)
        {
            currsum=0;
        }
    
        maxsum=Math.max(currsum,maxsum);
    }
    System.out.println("The maximum sum of the subarrays of given arrays "+maxsum);
    }
}