//retate 2d array chockwise 90'
public class rotate_array {

    public static void main(String[] args) {
        int arr[][]={{11,12,13,14},
                     {21,22,23,24},
                     {31,32,33,34},
                     {41,42,43,44}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }             
        transpse(arr);

    }
    public static void transpse(int [][]arr){
        //transpose the lowest part of trangle to swop upper part mens [i][j]=[j][i]
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;

            }
        }
         
        

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+" ");

        //     }
        //     System.out.println();
        // }

        System.out.println();
        for(int i=0;i<arr.length;i++){
           reverse_arr(arr[i]);
        }

        

    }
    public static void reverse_arr(int []arr){
    //    for(int a=0;a<arr.length;a++){
    //             System.out.print(arr[a]+" ");
    //     }
      
        System.out.println();
      int i=0;
        int j=arr.length-1;
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