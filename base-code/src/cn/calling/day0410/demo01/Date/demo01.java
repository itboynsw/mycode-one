package cn.calling.day0410.demo01.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
        demo01_3();
    }

    private static void demo01_3() {
        SimpleDateFormat format=new SimpleDateFormat();
        Date date=new Date();
        String format1 = format.format(date);
        System.out.println(format1);
    }

    public static void  demo01_1()
    {
        Date date=new Date(1000);
        System.out.println(date);
    }

    public  static  void  demo01_2()
    {
        Date date=new Date();
        long time = date.getTime();
        System.out.println(time);
        System.out.println("============");
        System.out.println(System.currentTimeMillis());
    }
}
