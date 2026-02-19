 class calculator1 {

    String name="Swapnil"; // instans varible to storde the heap memeory
    
    //simple method 
    public void getname(){
        System.out.println("name:"+name);
    }
    // method overloding - crate a program to the pass the deferant type of value uin a
    //  method and add to the same method 
    public int add(int n1,int n2){
        return (n1+n2);
    }
    public int add(int n1,int n2,int n3){
        return (n1+n2+n3);
    }
    public double add(double n1,int n2){
        return (n1+n2);
    }

}
  class A {

   private String name;

   public String getName1(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

public class methods {

   public static void getmsg(){
        System.out.println("this is satic metheod!");
    }
    public static void main(String[] args) {
        calculator1 obj=new calculator1();

        obj.getname(); //simple method call

        //method overloding 
        int r1=obj.add(10, 20); //local varible to storde the satck memory
        System.out.println(r1);
        
        double r2=obj.add(10.8, 20);
        System.out.println(r2);

       System.out.println("add:"+obj.add(10,30,89));
       

    //    A objA=new A();  
    //    objA.setName("swapnil");
    //    System.out.println(objA.getName1());




    }
}
