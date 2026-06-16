import java.util.*;
public class Max_value_array{
    public static void main(String []arge){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Eneter the Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }


        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println((min+max));

        System.out.println("max Element: "+max);
        System.out.println(" min ="+min);

    }
}