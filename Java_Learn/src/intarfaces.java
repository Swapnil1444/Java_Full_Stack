 interface A1 {
 
    public void dispaly();
    public int sum(int a,int b);
    
}
class demo1 implements A1 {
  
   public void dispaly(){
        System.out.println(sum(10, 20));
    }

   public int sum(int a,int b){
        return a+b;
    }
    
}



public class intarfaces {
 public static void main(String[] args) {
    A1 obj=new demo1();
    obj.sum(10, 20);
    obj.dispaly();
 }
}
