public class BitwiseOperation {

    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println("Original String:");
        System.out.println(str);

        System.out.println("\nAND Operation with 127:");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int andResult = ch & 127;

            System.out.println(ch + " -> " + andResult);
        }

        System.out.println("\nXOR Operation with 127:");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int xorResult = ch ^ 127;

            System.out.println(ch + " -> " + xorResult);
        }
    }
}