import java.util.Scanner;

public class subArray {
    public static void main(String[] args) {
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

        //logic 

        System.out.println("\n subArray:");
        for(int si=0;si<n;si++){
            for(int ei=0;ei<n;ei++){
                for(int k=si;k<=ei;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }

    }
}
