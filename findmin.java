package Array;
public class findmin{
    public static void main(String args[])
    {
        int arr[]={7,1,5,3,6,4};
        int minprice=Integer.MAX_VALUE;
        int maxprice=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(minprice<arr[i])
            {
                continue;
            }
            else{
                minprice=arr[i];
            }
            if(maxprice>arr[i])
            {
            continue;
            }else{
                maxprice=arr[i];
            }
        }
        System.out.println("Minimum price of the stocks "+minprice);
        System.out.println("Maximum price of the stocks "+maxprice);
        System.out.println("profit price of the stocks "+(maxprice-minprice));
    }
}