package Besic.String;

import java.util.StringTokenizer;
public class StringTocans{
    public static void main(String[] args) {
        String s="hello im a swapnil supker";
        StringTokenizer st=new StringTokenizer(s);

        while (st.hasMoreElements()) {
           System.out.println( st.nextToken());
        }
    }
}