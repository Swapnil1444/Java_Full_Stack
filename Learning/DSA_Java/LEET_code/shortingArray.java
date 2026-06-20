public class shortingArray{
    public static void main(String[] args) {
        int []num={5,3,2,1,0};
        for (int i : sortArray(num)) {
            System.out.println(i+" ");
        }
        //System.out.println(sortArray(num));
    }
     public static int[] sortArray(int[] nums) {
    
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println(" ");
       return nums;
    }
}    
