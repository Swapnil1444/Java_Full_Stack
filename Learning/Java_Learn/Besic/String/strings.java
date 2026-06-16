package Besic.String;
public class strings {
    public static void main(String[] args) {
        String fname="Swapnil";
        String lname="Supekar";

        System.out.println(fname);
        System.out.println(fname.hashCode());//print hash code
        System.out.println(fname.charAt(0)); //return the index number of string 
        System.out.println(fname.concat(" Supekar")); //this is join two string 
        
        //combin 2 String using concat method 
        fname=fname.concat(lname);
        System.out.println(fname);

        //print string in revers ordar
        char ch;
        String rev=" ";
        for(int i=fname.length()-1;i>=0;i--){
            ch=fname.charAt(i);
            String str=Character.toString(ch);
            rev=rev.concat(str);
        }
        System.out.println(" revers:"+rev);



        String n1="Swapnil";
        String n2="Swapnil";
        System.out.println(n1==n2); //true

        StringBuffer sb=new StringBuffer("Swapnil");
        System.out.println(sb.capacity());// check string buffer size 
        System.out.println(sb.length());//return normal langht in string 

        //add string 
        sb.append(" Suprkar");
        System.out.println(sb);

        //type change to string buffer to string 
        String str=sb.toString(); //type casting to string 
        System.out.println(str);

        //delete charctr in string 
        sb.deleteCharAt(3);
        System.out.println(sb);

        //insert value in index 
        sb.insert(0, " java ");
        System.out.println(sb);

        //set length
        sb.setLength(30);
        System.out.println(sb.capacity());

        //convert string to upper case
        //fname.toUpperCase();
        System.out.println(fname.toUpperCase());

        //return the 2-5 index number of char
        System.out.println(fname.substring(2,5));

        //retuen the 4 index number of char
        System.out.println(fname.charAt(4));

        System.out.println(fname.substring(4)); //return the string in index to end of string

        //add the string in end of "!"
        System.out.println(fname.concat(" !"));

        //return the index number of "supekar"
        System.out.println(fname.indexOf(lname));//7

        System.out.println(fname.indexOf("s",10));

        // return last to indext of postion "l" to return index number
        System.out.println(fname.lastIndexOf("l"));

        System.out.println(fname.equals(lname)); //check to string is equals

        fname="Swapnil"; //check equels but not a matter a case to upper or lower 
        System.out.println(fname.equalsIgnoreCase("swapnil"));//true

        System.out.println(fname.compareTo("swapnil supekar"));

        System.out.println(fname.compareToIgnoreCase(str));

        //convart all string is lower case
        System.out.println(fname.toLowerCase());

        // remove the stating and ending spase of the string 
        String str1="     hello im swapnil supekar i lern java programing !         ";
        System.out.println(str1.trim());

        // chenge the "swapnil" name to new name is "uday" this name is reples
        System.out.println(fname.replace(fname,"Uday"));

        System.out.println(fname.contains("swapnil"));

        char[] ch1=fname.toCharArray();
        for (char c : ch1) {
            System.out.print(c+" ");
        }

        System.out.println();
       System.out.println( str1.startsWith("hello"));

       System.out.println(fname.intern());

       
       String s1="swapnil";
       String s2=null;
       String s3="";

      // s1=s1.concat(s2); // NullPointgerExption  uing the null value are the pass in the this method . 
       System.out.println(s1);

       System.out.println("revers a string :");
       for(int i=s1.length()-1;i>=0;i--){
          char ch11=s1.charAt(i);
          String ch111=Character.toString(ch11);
          s3=s3.concat(ch111);
       }
       System.out.println(s3);







    }
}
