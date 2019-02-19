package main;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
       /* for (int i = 0; i < 10; i++) {
            list.add(i,i+1);
        }
        list.remove(0);*/
        list.add(42);

        //for (Integer i:list) {
            System.out.println(list);

        //}
    }
}
