class StudentInfo{
    private String name; //hide the data mebers

    //access the name  using getName method
    public String getName() {
        return name; 
    }
    public void setName(String name){
       this.name=name;
    }

}


public class Encapsulation {
    public static void main(String arg[]){

        StudentInfo s=new StudentInfo();
        s.setName("swapnil");
        System.out.println(s.getName());

        s.setName("om");
        System.out.println(s.getName());
    }
}
