package oop;

// class - to crate class to calculetar to sum of to two numbers
 class  calculator {
     int add(int n1,int n2){
        return (n1+n2);
     }
}
public class oop_consept {
    public static void main(String[] args) {

        int num1=10;
        int num2=20;
        calculator cal=new calculator();
        int result=cal.add(num1,num2);
        System.out.println("sum:"+result);
    }
}
