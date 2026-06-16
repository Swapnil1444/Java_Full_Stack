public class solution {
    
    public static void main(String[] args) {
         int arr[]={6,3,4,5};
         
        System.out.println(" B= "+linearSearch(arr,4));
    }

    public static int linearSearch(int[] A, int B) {
        for(int i=0;i<A.length;i++){
            if(A[i]==B){
                B=1;
                break;
            }else{
                B=0;
                break;
            }
        }
          return B;
    }


}
