import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tic_Tac_ToeGame {

   static String [] boarda;
   static String turn;
        static void printBoard(){
            System.out.println("|---|---|---|");
            System.out.println("| "+boarda[0]+" | "+boarda[1]+" | "+boarda[2]+" |");
            System.out.println("|---|---|---|");
            System.out.println("| "+boarda[3]+" | "+boarda[4]+" | "+boarda[5]+" |");
            System.out.println("|---|---|---|");
            System.out.println("| "+boarda[6]+" | "+boarda[7]+" | "+boarda[8]+" |");
            System.out.println("|---|---|---|");
        }

       public static String checkWin(){
            for(int i=0;i<8;i++){
                String line=null;
                switch(i){
                    case 0:
                        line=boarda[0]+boarda[1]+boarda[2];
                        break;
                    case 1:
                        line=boarda[3]+boarda[4]+boarda[5];
                        break;
                    case 2:
                        line=boarda[6]+boarda[7]+boarda[8];
                        break;
                    case 3:
                        line=boarda[0]+boarda[3]+boarda[6];
                        break;
                    case 4:
                        line=boarda[1]+boarda[4]+boarda[7];
                        break;
                    case 5:
                        line=boarda[2]+boarda[5]+boarda[8];
                        break;
                    case 6:
                        line=boarda[0]+boarda[4]+boarda[8];
                        break;
                    case 7:
                        line=boarda[2]+boarda[4]+boarda[6];
                        break;    
                }
                if(line.equals("XXX")){
                    turn="X";
                    return turn;
                    
                }
                if (line.equals("OOO")) {
                    turn="O";
                    return turn;
                }
            }
            for(int i=0;i<9;i++){
                if(boarda[i].equals(String.valueOf(i+1))){
                    System.out.println(turn+" Enter the slot number to place "+turn+" in :");
                    return null;
                }
            }
            return "draw";
        }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numInput;
        turn="X";
        boarda =new String[9];
        String win=null;
        for(int i=0;i<9;i++){
            boarda[i]=String.valueOf(i+1);
        }
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
         printBoard();

        System.out.println(" X will play frist. Enter the slot number to place X in :");
        while (win==null) {
            try{
                numInput=sc.nextInt();
                if(!(numInput>0&&numInput<=9)){
                    System.out.println("Invalid Input.! re- Enter slot number ");
                    continue;
                }
                if(boarda[numInput-1].equals(String.valueOf(numInput))){
                    boarda[numInput-1]=turn;
                   // boarda[numInput-1]="X";
                   turn=turn.equals("X")?"O":"X";
                    printBoard(); 
                    win=checkWin();
                }
                else{
                    System.out.println("Slot already taken; re- Enter slot number ");
                }
            }catch(InputMismatchException e){
              System.out.println("Invalid Input.! re- Enter slot number ");
              sc.nextInt();
            }      
                
        }
        if(win.equalsIgnoreCase("draw")){
         System.out.println("It's a draw! Thanks for playing");
        }else{
            System.out.println("Congratulation "+win+" s have win thanks for playing!" );
        }


    }
}
