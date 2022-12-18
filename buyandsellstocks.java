package Array;

public class buyandsellstocks {
    public static void main(String args[])
    {
        int price[]={7,1,5,3,6,4};
        profit(price);

    }
    public static void profit(int price[])
    {   int pro=0;
        int sellprice;
        int buyprice;
       
       int s=0;
       int r=0;
       int n=price.length;
        for(int i=0;i<n-1;i++)
        {
           
            buyprice=price[i];
            for(int j=i+1;j<n;j++)
            {
                sellprice=price[j];
                int prof=sellprice-buyprice;
                if(prof>pro)
                {
                    pro=prof;
                   
                   
                    s=i+1;
                    r=j+1;
                }
            }


        }
            System.out.println("This is the maximum profit "+ pro+ ". If you buy the stocks on day "+s+" and sell the stocks at day "+r);
    }
}
