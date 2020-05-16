package cn.calling.day0410.demo01.RedPackage;

import java.util.ArrayList;

public class MainRedPackage {
    public static void main(String[] args) {
        Manage manage=new Manage("群主",100);
        Member one=new Member("成员A",0);
        Member two=new Member("成员B",0);
        Member three=new Member("成员C",0);
        manage.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=============");
        ArrayList<Integer> redList=manage.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        manage.show();
        one.show();
        two.show();
        three.show();
    }
}
