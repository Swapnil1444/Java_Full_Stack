package Besic;
public class Conditional_Statements {

    public static void main(String[] args) {
        
        // if(a>=15){
        //  System.out.println("value is similler to 15 "+a);
        // }

        Integer a=null;

       // if-else write a code to check even or odd number.
       int num=1444;
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        //tarnary opereter to convart if -else
            String result=(num%2==0)?"even":"odd";
             System.out.println(result);

        //if-else-if
        if(true) {

        }
        else  {

        }   
         if (true) {
            
         }   

       // nested if-else  
         if(true){
            if(true){

            }
            else{

            }
         }else{

         }

         //if -else-if ladder
         if(true){

         }else if(true){

         }else if(true){

         }else{

         }

         //switch - write a program to check the day on week 
         num=4;
         switch(num){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                 break;
            case 3:
                 System.out.println("Wednesday");
                  break;
            case 4:
                 System.out.println("Thursday");
                  break;
            case 5:
                 System.out.println("Friday");
                  break;
            case 6:
                 System.out.println("Saturday");
                  break;
            case 7:    
                 System.out.println("Sunday");
                  break;
            default:
                System.out.println("Invalid number");
         }



    }
}