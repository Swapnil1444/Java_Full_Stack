package Besic.String;

import java.util.StringTokenizer;
public class StringTocans{
    public static void main(String[] args) {
        String s="hello im a swapnil supker";
        StringTokenizer st=new StringTokenizer(s);

        while (st.hasMoreElements()) {
           System.out.println( st.nextToken());
        }
       String s1="hello : swapnil : keshav : supekar";
        StringTokenizer st1=new StringTokenizer(s1," : ");
       
       System.out.println( st1.countTokens());
        while (st1.hasMoreElements()) {
            
           System.out.println(st1.nextToken());
        }
          
          
    }
}