package Array;

public class pairs {
   public static void main(String args[]) 
   {
    int arr[]={22,33,34,55,66,778,999,6640};
    pair(arr);
   }
   public static void pair(int arr[])
   {
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            System.out.print("("+arr[i]+","+arr[j]+")"+" ");
        }System.out.println();
    } 
   }


}
