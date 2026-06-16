
public class Array_2D {
    public static void main(String[] args) {
       int arr[][]=new int[4][5];

       //set
       arr[2][3]=30;

       //get
       System.out.println(arr[2][3]);
       System.out.println(arr[3][3]);

       //row length count
       System.out.println(arr.length);

       //colome length count
       System.out.println(arr[0].length);

       //traversal
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
       
    }
}
