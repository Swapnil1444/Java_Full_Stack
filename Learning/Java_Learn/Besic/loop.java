package Besic;
public class loop {
    
    public static void main(String[] args) {
     
        //while loop -print the 4 table 
        int num=4;
        int i=1;

        while (i<=10) {
            System.out.println(i*num);
            i++;
        } 

       // do while loop - print the hello in one time without condition true.
       i=20;
        do{
            System.out.println("hello");
            i++;
        }while(i<=10);

        //for loop - create a calendar to day and hours on 9-16 on 5 day and show the dayly work

        for(i=1;i<=5;i++){
            System.out.println("DAY :"+i);
            for(int j=1;j<9;j++){
               System.out.println("     "+(j+8)+" - "+(j+9));
            }
        }
        // work on while loop using the for loop
        i=1;
        for(;i<=10;){
           System.out.println(i);
           i++;
        }

        // for each loop - print the array value .
        int arr[]={10,20,30,40,50};
        for(int value:arr){
            System.out.print(" "+value);
        }

        System.out.println(" \\jame statment:");

        //jamp statement
        //brack; - brack the 40 element in array
        for(i=0;i<=arr.length;i++){
            if(arr[i]==40){
                break;
            }else{
            System.out.println(arr[i]);
            }
        }

        // continue; - skip the 40 in array and print all element
        for(i=0;i<=arr.length;i++){
            if (arr[i]==40) {
                continue;
            }
            System.out.println(arr[i]);
        }
    }
    
}
