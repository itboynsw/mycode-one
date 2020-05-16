package cn.calling.day0410.demo01.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式：yyyy-MM-dd");
        String str=sc.next();
        long lo=getDay(str);
        System.out.println(lo);
    }
    /*
    判读时间差距，两个时间相差多少天，时，分，秒
     */
    public static Long getDay(String date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Long days = null;
        try {
            Date currentTime = dateFormat.parse(dateFormat.format(new Date()));//现在系统当前时间
            Date pastTime = dateFormat.parse(date);//过去时间
            long diff = currentTime.getTime() - pastTime.getTime();
            days = diff / (1000 * 60 * 60 * 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }
}
