import java.util.ArrayList;

public class Arraylist_opertion {
    public static void main(String[] args) {
        

        ArrayList<Integer> list=new ArrayList<>();
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);


        // add in index
        list.add(1,40);
        System.out.println(list);

        //get
        System.out.println(list.get(2));

        //set
        list.set(2, 50);
        System.out.println(list.get(2));

        //remove
        list.remove(2);
        System.out.println(list);

        //size
        System.out.println(list.size());

    }
}
