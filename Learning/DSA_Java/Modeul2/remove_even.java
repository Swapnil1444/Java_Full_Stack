import java.util.*;
public class remove_even {
    public static void main(String []arge){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //remove even number in list

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }

        System.out.println(list);



        
        
    }
}
