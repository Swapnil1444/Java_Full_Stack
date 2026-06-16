import java.util.*;
public class Sum_array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();

        int []arr=new int[n];
        System.out.println("Enter array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("array Element:");
        for(int i:arr){
            System.out.println(i);
        }

        int sum=0;
        System.out.println("sum:");
        for(int i=0;i<n;i++){
          sum=sum+arr[i];  
        }
        System.out.println(sum);
    }
}