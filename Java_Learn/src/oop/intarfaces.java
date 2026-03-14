package oop;
 interface A1 {
 
    public void dispaly();
    public int sum(int a,int b);
    
}
class demo1 implements A1 {
  
    int sum1;
   public void dispaly(){
        System.out.println(sum(10, 20));
    }

   public int sum(int a,int b){
        return sum1=a+b;
    }
    public void sizeOfInt(){
        System.out.println(sum1);
    }
    
}

 interface Shape1  {
    double calculateArea();  
}
class Circle1 implements Shape1{
    private double r;
    public Circle1(double r){
        this.r=r;
    }
    public double calculateArea(){
        return Math.PI*r*r;
    }
}
 class Rectangle1 implements Shape1  {

    double width;
    double lenght;
    public Rectangle1(double width,double lenght){
        this.lenght=lenght;
        this.width=width;
    }
    public double calculateArea(){
        return width*lenght;
    }
    
}


public class intarfaces {
 public static void main(String[] args) {
    // A1 obj=new demo1();
    // obj.sum(10, 20);
    // obj.dispaly();

    // obj.sizeOfInt();

    Shape1 c=new Circle1(10.5);
    System.out.println(c.calculateArea());
    Shape1 r=new Rectangle1(77, 55);
    System.out.println(r.calculateArea());
 }
}
