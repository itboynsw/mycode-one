package cn.calling.day0410.demo01.System;

public class demo03 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = str.append("abc");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str==str2);
        str.append(true);
        System.out.println(str);
        System.out.println("Abc".toUpperCase().toLowerCase());

        int i = Integer.parseInt("5465a");
        System.out.println(i);
    }
}
