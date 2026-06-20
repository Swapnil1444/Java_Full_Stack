import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_Class {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("java");
        Matcher m=p.matcher("java is java");

        

        //match method
        System.out.println(m.find());
        System.out.println(m.matches());// 
        System.out.println(m.lookingAt()); //full string are check 

        


    }
}
