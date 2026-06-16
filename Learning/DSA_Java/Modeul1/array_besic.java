public class array_besic{
   public static void main(String []args){
      int[] arr={1,2,3,4,5,6};

      //get array value
      System.out.println(arr[1]);

      //set 
      arr[1]=20;
      System.out.println(arr[1]);

      //length
      System.out.println(arr.length);

      //traverse of array
      for(int i=0;i<arr.length;i++){
        System.out.println(i+" index value: "+arr[i]);  
      }
   }
}
