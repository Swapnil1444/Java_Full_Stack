package Besic;
public class type_casting_and_Opereters {
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

        //increment/decriment
        int num=2;
        //num++; //3
        // ++num;  //3

        // --num; // 1
         num--; //1

        System.out.println(num);

        //Opereters
        //Arithmatic 
        int num1=2,num2=3;
        System.out.println(num1+num2); //5
        System.out.println(num1-num2); //-1
        System.out.println(num1*num2); //6
        System.out.println(num1/num2); //0

        //Relation
        System.out.println(num1==num2); //false
        System.out.println(num1!=num2); //true
        System.out.println(num1<num2); //true
        System.out.println(num1>num2); //false
        System.out.println(num1<=num2); //true
        System.out.println(num1>=num2); //false

        //locgical - &&,||,!

        //Assigment
        System.out.println(num1+=num2); //5
        System.out.println(num1-=num2); //2
        System.out.println(num1*=num2); //6
        System.out.println(num1/=num2); //2

        //unary 
        num1=2;
        System.out.println(num1++);//2
        System.out.println(++num1);//4
        System.out.println(num1--);//2
        System.out.println(--num1);//2

        num1=2;
        num2=3;
        //Bitwise
        System.out.println(num1&num2); //2
        System.out.println(num1^num2); //1
        System.out.println(~num1); //-3
        System.out.println(num1<<num2);//16
        System.out.println(num1>>num2); //0

        //ternary
        num1=8;
        String re=(num<=5)?"greater":"smaller";
        System.out.println(re);





    }
}
