public class type_casting {
    public static void main(String[] args) {
        
        //type casting 
        byte b=127;
        int a=b; //convrstion
        System.out.println(a);

        int c=122;
        byte b1=(byte)c;
        System.out.println(b1);

        float f=2.3f;
        int t=(int)f;
        System.out.println(t);

        //type promastion
        byte b2=10;
        byte b3=30;
        int r=b1*b2;
        System.out.println(r);


    }
}
