public class Transpose_matrix{
    public static void main(String[] args) {
        int arr[][]={{11,12,13,14,15},
                     {21,22,23,24,25},
                     {31,32,33,34,35},
                     {41,42,43,44,45}};
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
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}