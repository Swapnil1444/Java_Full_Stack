package Besic;
public class wrapperclass_q {

    public static void main(String[] args) {
           

        String value="100";
        //canvart String value is in int 
        int a1=Integer.parseInt(value);
        System.out.println(a1);

        // canvart String into Integar object 
        Integer a2=Integer.valueOf(value);
        System.out.println(a2);
        Integer a3=100;
        
        //canvart Integar object into String 
        String s=Integer.toString(a2);
        System.out.println(s);

        // comppare the to integar to string is equale or not 
        System.out.println( a2.equals(a3));

        int a=10,b=30;
        // return min value
        System.out.println(Integer.min(a,b));

        //retuen max 
        System.out.println(Integer.max(a, b));
         //return sum 
        System.out.println(Integer.sum(a, b));






    }
}
