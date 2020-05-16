package cn.calling.day0410.demo01.RedPackage;

import java.util.ArrayList;
/**
 * 群主类
 */

public class Manage extends User {
    public Manage() {
    }

    public Manage(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList=new ArrayList<Integer>();
        //群主有多少钱
        int leftMoney=super.getMoney();
        if(totalMoney>leftMoney) {
            System.out.println("余额不足");
            return  redList;
        }
        //扣钱，重新设置余额
        super.setMoney(leftMoney-totalMoney);
        //发红包，平均拆分count份；
        int avg=totalMoney/count;
        int mod=totalMoney%count;
        for (int i = 0; i < count-1; i++) {
            //前几个平均分，最后一个多剩余的金额
            redList.add(avg);
        }
        int last=avg+mod;
        redList.add(last);
        return  redList;
    }
}
