package oop.enum_statas;

enum Status{
     Running,Feiled,Peding,Success;
}

enum Leptop{
    thinpad(7000),macbook(49999),XPF(40000);
    private int price;

    private Leptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}

public class enum_satas {
    public static void main(String[] args) {
        Status s= Status.Feiled; 
        System.out.println(s);

        s=Status.Peding;
        System.out.println(s);

        System.out.println(s.ordinal()); //return the postion on "peding"

        //print all method 
        Status[] ss=Status.values(); 
        for(Status a:ss){
            System.out.println(a+" : "+a.ordinal());
        }


        for(Leptop leb:Leptop.values()){
            System.out.println(leb+" :"+leb.getPrice());
        }
    }
}
