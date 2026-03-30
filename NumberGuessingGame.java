import java.util.Scanner;

public class NumberGuessingGame {

    static Scanner sc= new Scanner(System.in);
    static void numberGame(){

        int gessNum=(int)(100*Math.random());
        System.out.println("Gussing number is the 1-100 and only 5 atepmt to game:");
        int max=5;
         
        for(int i=0;i<5;i++){
            System.out.print("Enetr the number:");
            int inputNum=sc.nextInt();
                if(inputNum==gessNum){
                    System.out.println("Congratulations! You guessed the correct number. "+inputNum);
                    break;               
                }else if(inputNum<gessNum){
                    System.out.println("Number is grathar than");
                }else{
                    System.out.println("Numebr is less than");
                }
        }



        

    }
     public static void main(String[] args) {
        numberGame();
     }
}
