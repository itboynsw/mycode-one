package cn.calling.day0410.demo01;

public class FuZiReletion {
    public static void main(String[] args) {
        Zi zi=new Zi();
        System.out.println(zi.sex);
        System.out.println("========");
        System.out.println("孩子的名字叫："+zi.name);
        Fu fu=new Fu();
        fu.name="李四";
        System.out.println("新孩子的名字叫："+zi.name);
        System.out.println("***************");
        System.out.println("新孩子的名字叫："+fu.name);
        zi.getName();
    }
}
