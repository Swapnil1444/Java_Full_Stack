package Besic;
public class string_class {
    public static void main(String[] args) {
        //String Buffer classes
        StringBuffer sb=new StringBuffer();
        sb.append("hello");
        sb.append(" Swapnil");

        String str=sb.toString();
        System.out.println(str);

        //set size 
        StringBuffer sb1=new StringBuffer(50);
        sb.append(str);
        System.out.println(sb);

        // insert a string in givin position 
        sb.insert(0, " supekar ");
        System.out.println(sb);

        //riplace the string
        sb.replace(0, 6,"java");
        System.out.println(sb);

        //delete string with postion
        sb.delete(0,10);
        System.out.println(sb);

        sb.reverse(); //conver reverse
        System.out.println(sb);

        System.out.println(sb.capacity());//check capacity

        //print the in lenght of string
        System.out.println(sb.length());



        //String Builder clases
        StringBuilder sbi=new StringBuilder("swapnil supekar");
        System.out.println("Initial: " + sbi);

        sbi.append(" is awesome!");
        System.out.println("After append: " + sbi);

        sbi.insert(13, " Java");
        System.out.println("After insert: " + sbi);

        sbi.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sbi);

        sbi.delete(8, 14);
        System.out.println("After delete: " + sbi);

        sbi.reverse();
        System.out.println("After reverse: " + sbi);

        System.out.println("Capacity: " + sbi.capacity());
        System.out.println("Length: " + sbi.length());

        char c = sbi.charAt(5);
        System.out.println("Character at index 5: " + c);

        sbi.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sbi);

        String sub = sbi.substring(5, 10);
        System.out.println("Substring (5–10): " + sub);

        sb.reverse(); // Revert for search
        System.out.println("Index of 'Geeks': " + sbi.indexOf("Geeks"));

        sbi.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sbi);

        String result = sbi.toString();
        System.out.println("Final String: " + result);







    }
}
