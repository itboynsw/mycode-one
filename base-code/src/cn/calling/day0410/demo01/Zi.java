package cn.calling.day0410.demo01;

public class Zi extends Fu {
    boolean sex;
    String name="李四";
 
    public  void  getName()
    {
        String name="王五";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
