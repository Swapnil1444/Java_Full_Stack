abstract class TV1{
    abstract void tvOn();
    abstract void tvOff();
}
 class TV_remort extends TV1 {

    void tvOn(){
        System.out.println("tv is On");
    }
    void tvOff(){
        System.out.println("tv is off");
    }
}

abstract class Shape{
    String color;
    public Shape(String color){
        this.color=color;
    }
    abstract double area();
   public abstract String toString();

    String getColor(){
        return color;
    }


}
class Circle extends Shape {
   double redius;

   public Circle(String color,double redius){
    super(color);
    this.redius=redius;
   }
   double area(){
    return Math.PI* Math.pow(redius, 2);
   }
   public String toString(){
    return "Circle color is "+super.getColor()+" and area is "+area();
   }

}
 class Rectangle extends Shape {
   double lenght;
   double width;
   public Rectangle(String color,Double lenght,double width){
    super(color);
    this.lenght=lenght;
    this.width=width;
   }
   double area(){
    return width*lenght;
   }
   public String toString(){
    return "Rectangle color is "+super.getColor()+" and area is "+area();
   }
   
}

public class abreact_class {
    public static void main(String[] args) {

       // TV_remort t=new TV_remort();
        TV1 tv=new TV_remort();
        tv.tvOn();
        tv.tvOff();

        Shape c=new Circle("pink", 3.5);
        System.out.println(c);

        Shape r1=new Rectangle("red", 30.7, 21.8);
        System.out.println(r1);



        
        
    }
}
