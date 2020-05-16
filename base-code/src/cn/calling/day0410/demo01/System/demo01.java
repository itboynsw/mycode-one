package cn.calling.day0410.demo01.System;

public class demo01 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for (int i = 0; i <9999 ; i++) {
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
