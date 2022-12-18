package Array;

public class swapreverse {
    public static void main(String args [])
    {
        int arr[]={22,33,34,55,66,778,999,6640};
        for(int i=0;i<arr.length;i++)
        {
                System.out.print(arr[i]+"   ");
        }
        swap(arr);
    }
    public static void swap(int arr[])
    {   

        int start=0;
        int temp;
        int end=arr.length-1;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start=start+1;
            end=end-1;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
                System.out.print(arr[i]+"   ");
        }
    }
}
