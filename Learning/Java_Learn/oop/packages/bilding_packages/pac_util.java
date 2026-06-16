package oop.packages.bilding_packages;

import java.util.Random;
import java.util.Vector;

public class pac_util {
    
    public static void main(String[] args) {
        Random r=new Random();

        int num=r.nextInt(100);
        System.out.println(num);

        Vector v=new Vector<>();
        v.add(10);
        v.add(20);


        v.remove(1);

        
        for (Object object : v) {
            System.out.println(object);
        }


    }
}
