import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_operation{
    public static void main(String []args){
         //pattern- this class  is use in the compiles regex string into pattern
         // methods 1).compile(String regex);  
         Pattern p=Pattern.compile("swapnil"); //crate the class obj in pattern to acces the metheds in pattern class

         Matcher m=p.matcher("swapnilsupekarswapnil"); //this class to check the patter matcha 

         System.out.println(m.find()); //true check the match pattern 

         while (m.find()) {//this .find() - search form pattern occer
            System.out.println("pattern foud fome"+m.start()+" to "+(m.end()-1));
            // .start()- this is used to start the index to the patter frist letar mach eg.swapnilsupekar//return 0
            //.end()- it is same at but last index to the retuen in maching index
         }
         System.out.println(Pattern.matches("swapnil.*", "swapnilsupekar")); //use patter with the regex.* 

         System.out.println(Pattern.matches("swapnil[0-9]+", "swapnil9309")); // true 

         // regex charectar classes
         //[xyz] - match xy or z
         System.out.println(Pattern.matches("[xyz]","xyz"));
         //[^xyz] - match eny char in xyz
         System.out.println(Pattern.matches("[^xyz]", "xyz")); 
         //[a-zA-Z] - metch the any char of a-z and A-Z
         System.out.println(Pattern.matches("[a-zA-Z]", "A")); //-check the single char in match to retun true
         //[a-f[m-p]]- union of renges a-f and m-p
         System.out.println(Pattern.matches("[a-f[m-p]]","p"));
         //[a-f&&[m-p]]
         System.out.println(Pattern.matches("[a-f&&[^m-p]]", "b")); // return only true is the a-f char

         //Regex Quantifiers
         //X? - Appears check the o or 1
         System.out.println(Pattern.matches("a?", "a")); //"" ,"a" true or more aa fales
         //X+ - appears in 1 or more
         System.out.println(Pattern.matches("a+", "aaaaaa"));
         //X* appears one or more
         System.out.println(Pattern.matches("a*", "aaaaaaaaa"));
         //X{3} check the only 3 char in same
          System.out.println(Pattern.matches("a{3}", "aaa"));
          //X{2,} check 2 or more match
          System.out.println(Pattern.matches("a{2,}", "aaaaaaaaa"));
        //X{2,4} check the 2 or 4 between mathes 
         System.out.println(Pattern.matches("a{2,4}", "aaa"));

        //  Common Regex Patterns in Java
        //. any single charcher 
        System.out.println(Pattern.matches(".", "b"));
        // \d : 0-9 digit
        System.out.println(Pattern.matches("\\d{4}", "1234"));
        System.out.println(Pattern.matches("\\d+", "12345"));
        // \D : no digit
        System.out.println(Pattern.matches("\\D", "1")); 
        System.out.println(Pattern.matches("\\D+", "1234"));
       // \s : Whitespace
       System.out.println(Pattern.matches("\\s", "abc"));
        // \S : Non-whitespace
        System.out.println(Pattern.matches("\\S+", "abc"));
        // \w : Word character [a-zA-Z0-9_]
        System.out.println(Pattern.matches("\\w", "S"));
        // \W : Non-word character
        System.out.println(Pattern.matches("\\W", " "));
        // \b : Word boundary check the spesific wold to match
        System.out.println(Pattern.matches("\\bthe", "the"));
        // \B : Non-word boundary 
        System.out.println(Pattern.matches("\\Bthe", "the"));






    }
}