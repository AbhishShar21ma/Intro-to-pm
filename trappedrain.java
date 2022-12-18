package Array;
import java.lang.Math;
public class trappedrain {
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        trappedwater(height);


    }
    public static void trappedwater(int height[])
    {
        int n=height.length;
        int maxleft[]=new int[n];
        int maxright[]=new int[n];
        maxleft[0]=height[0];

        for(int i=1;i<n;i++)
        {
            maxleft[i]=Math.max(maxleft[i-1],height[i]);
        }
        maxright[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            maxright[i]=Math.max(height[i],maxright[i+1]);
        }
        int tw=0;
        int min=0;
        for(int i=0;i<n;i++)
        {
            min=Math.min(maxleft[i],maxright[i]);
            tw= tw+ (min-height[i]);

        }
        System.out.println("Trapped water inside the given building is = "+tw);
    }
}
