import java.util.Scanner;

public class Reverse_array{
    public static void main(String []areg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Eneter the Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    
        System.out.print("Array:");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println(" \n reverse array:");
        // for(int i=0;i<arr.length;i++){
        //     for(int j=arr.length;j>=0;j--){
        //         System.out.print(j+" ");
        //     }
        // }

        int i=0;
        int j=n-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }


    }
}