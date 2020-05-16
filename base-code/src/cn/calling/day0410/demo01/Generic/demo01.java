package cn.calling.day0410.demo01.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class demo01 {
    public static void main(String[] args) {
        GenericClass gc=new GenericClass();
        gc.setName("33");
        Object name = gc.getName();
        System.out.println();

        GenericClass<Integer> gc1=new GenericClass<>();
        gc.setName(1);
        Integer name1 = gc1.getName();

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        ArrayList<String> list2=new ArrayList<>();
        list2.add("222");
        list2.add("333");
        method01(list);
        method01(list2);
    }

    private static void method01(ArrayList<?> list) {
        Iterator<?> it=list.iterator();
        while (it.hasNext())
        {
            Object next = it.next();
            System.out.println(next);
        }
    }


}
