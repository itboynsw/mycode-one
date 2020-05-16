package cn.calling.day0410.demo01.RedPackage;

import java.util.ArrayList;
import java.util.Random;
//普通成员
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        int index = new Random().nextInt(list.size());//随机数
        //根据索引，从集合当中删除，并且得到删除的红包，给自己
        int delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money + delta);
    }
}
