import java.util.ArrayList;

public class wrapperclass {

    public static void main(String[] args) {

        int a=10;
        Integer b=null; //wrapper class to storde null value
        System.out.println(a+" "+b);

        //conavart primitiv to object
        //Autoboxing :primitiv int -> weapper Integer

        Integer obj=a; // autoboxing
        System.out.println(obj);

        char ch='A'; 
        Character Chobj=ch; //wrapper Character
        System.out.println(Chobj);

        ArrayList<Integer> list =new ArrayList<>(); //collection to used the wrapper classes
        list.add(10); //autoboxing 
        System.out.println(list);

        int n=list.get(0); //unboxing
        System.out.println(n);

        //unboxing - conavar wrapper object to primitiv 
        Integer a1=10;
        int num=a1; //unboxing 
        System.out.println(num);

         byte b1 = 1;
        Byte byteObj = Byte.valueOf(b1);

        int i = 10;
        Integer intObj = Integer.valueOf(i);

        float f = 18.6f;
        Float floatObj = Float.valueOf(f);

        double d = 250.5;
        Double doubleObj = Double.valueOf(d);

        char c = 'a';
        Character charObj = c; // autoboxing

        System.out.println("Wrapper Objects:");
        System.out.println(byteObj);
        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);
        System.out.println(charObj);

        // Unboxing
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        System.out.println("\nUnwrapped values:");
        System.out.println(bv);
        System.out.println(iv);
        System.out.println(fv);
        System.out.println(dv);
        System.out.println(cv);





        
        
    }
}