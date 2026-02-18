import java.lang.reflect.Array;
import java.util.*;


class Student {
   int roll_no;
   String name;
   public Student(int roll_no,String name){
       this.name=name;
       this.roll_no=roll_no;
   }

  void sum_of_arr(int arr[]){
    int sum=0;

    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    System.out.println("sum of array: "+sum);
  }
    
}

public class arrays {
    public static void main(String[] args) {
        
        System.out.println("sipmal array:");
        int arr[]=new int[2]; // singal array 

        // Traversing and printing array
        for(int i:arr){
            System.out.print(i+" ");
        }

        System.out.println("\n Array of object:");

        Student Stu[]={
            new Student(1,"Swapnil"),
            new Student(2,"Om"),
            new Student(3, "rohit")
        };

        for(int i=0;i<Stu.length;i++){
            System.out.println(" Student roll No: "+Stu[i].roll_no+" name: "+Stu[i].name);
        }

        for(Student stu:Stu){
            System.out.println("name :"+stu.name+" roll no:"+stu.roll_no+" ");
        }
        System.out.println(" ");
         //pashing array to method
          int arr2[] = { 3, 1, 2, 5, 4 };

          // passing array to method m1
          Student obj=new Student(0, null);
          obj.sum_of_arr(arr2);

        System.out.println("\n multi dimensional array: \n");

        // multi dimensional array
        int arr1[][]=new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nadd rendam values:");

        // add the rendam value in array 
        int[][] arr3= new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr3[i][j]= (int)(Math.random()*100); //use the random method in Math class
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[]:arr3){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        System.out.println("\n Jagged array:");
        // jagged array

         int arr4[][]=new int[4][];
         arr4[0]=new int[3];
         arr4[1]=new int[4];
         arr4[2]=new int[5];
         arr4[3]=new int[2];

         for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                arr4[i][j]=(int)(Math.random()*100);
            }
         }

         for(int n[]:arr4){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
         }

          System.out.println("\n 3dimation array:");
         // 3dimention array 
         int arr5[][][]=new int[3][4][5];

         for(int i=0;i<arr5.length;i++){
            for(int j=0;j<arr5[i].length;j++){
               for(int k=0;k<arr5[i].length;k++){

                    arr5[i][j][k]=(int)(Math.random()*100);
                  
                }
                
            }
          
         }

         for(int i=0;i<arr5.length;i++){
            for(int j=0;j<arr5[i].length;j++){
               for(int k=0;k<arr5[i].length;k++){

                   
                    System.out.print("("+arr5[i][j][k]+"), ");
                }
                System.out.println(" ");
            }
            System.out.println();
         }
 
         
         // array class in java 
         //method in java array classes


         int intArr[]={10,30,22,11,60};
         for (int i : intArr) {
            System.out.print(i+" ");
         }
         System.out.println();

       //   int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr); // sort array

        int intKey = 22;

        System.out.println(intKey +" find at key in "+Arrays.binarySearch(intArr, intKey)+" element"); //binary search

        //find the element in 1 indext to 3 indext reng to array 
        System.out.println(intKey +" find at index "+Arrays.binarySearch(intArr,1,5, intKey));

        //compears to array 
        int intArr1[]={10,30,22,11};
        System.out.println("compear array:"+Arrays.compare(intArr,intArr1));

       int cop[]= Arrays.copyOf(intArr1, 4);
       
        for (int i : intArr1) {
            System.out.println(i);
        }

        //check array is equal or not
        if(Arrays.equals(intArr1, intArr)){
            System.out.println("equals");
        }
        else{
            System.out.println("not equals");
        }


        //assign the value 
         Arrays.fill(intArr1, intKey);// add all elemet to fill value in 22 
         for (int i : intArr1) {
            System.out.println(i);
         }

         System.out.println("hash code: "+Arrays.hashCode(intArr1)); //return the hashcode 

         //retun the frist unmach element index
           Arrays.mismatch(intArr1, intArr1);

           //spliterator
           Arrays.spliterator(intArr,2,5);
           
           for (int i : intArr) {
            System.out.println(i);
           }

           // convart array to string
            System.out.println(Arrays.toString(intArr));



         

        // System.out.println("to convart array as list: "+Arrays.asList(intArr)); //return the object addres 
         


        //final array 
         final int[] arrfinal={10,20,30};

        // arrfinal=new int[2]; //comple time error not crate new object in final array
        for (int i : arrfinal) {
            System.out.println(i);
        }

        arrfinal[2]=40; //modifay array
        for (int i : arrfinal) {
            System.out.println(i);
        }

        //find the large element in array
        int[] arrE={10,22,11,23,45,66};

        Arrays.sort(arrE);
        for(int i=0;i<arrE.length;i++){
           // System.out.println(arrE[i]);
        }
        int maxE=arrE[arrE.length-1]; //find max element 
        System.out.println(" max Element:"+maxE); 

        System.out.println("revars:");
        // print revars in array
        for(int i=arrE.length-1;i>=0;i--){
            System.out.println(arrE[i]);
        }
        
        

         



    }
}
