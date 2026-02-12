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


    }
}
