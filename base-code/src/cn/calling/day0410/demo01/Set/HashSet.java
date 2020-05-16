package cn.calling.day0410.demo01.Set;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> set=new java.util.HashSet<>();
        set.add(22);
        set.add(33);
        set.add(55);
        set.add(33);
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("==============");
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
