package cn.calling.day0410.demo01.DouDiZhu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
 * 斗地主测试01
 * 1、组装牌
 * */
public class demo01 {
    public ArrayList<String> zhunBei() {
        ArrayList<String> huaSe = huaSe();//花色集合
        ArrayList<String> xuHao = xuHao();//序号集合
        ArrayList<String> allList = new ArrayList<>();
        allList.add("大王");
        allList.add("小王");
        Iterator<String> itHuaSe = huaSe.iterator();
        while (itHuaSe.hasNext()) {
            String nextHuaSe = itHuaSe.next();//具体花色
            Iterator<String> itXuHao = xuHao.iterator();
            while (itXuHao.hasNext()) {
                String nextXuHao = itXuHao.next();//具体序号
                String str = nextHuaSe + nextXuHao;
                allList.add(str);
            }
        }
        return allList;
    }

    private static ArrayList<String> xuHao() {
        ArrayList<String> xuHao = new ArrayList<>();
        xuHao.add("2");
        xuHao.add("A");
        xuHao.add("K");
        xuHao.add("Q");
        xuHao.add("J");
        xuHao.add("10");
        xuHao.add("9");
        xuHao.add("8");
        xuHao.add("7");
        xuHao.add("6");
        xuHao.add("5");
        xuHao.add("4");
        xuHao.add("3");
        return xuHao;
    }

    private static ArrayList<String> huaSe() {
        ArrayList<String> huaSe = new ArrayList<>();
        huaSe.add("♠");
        huaSe.add("♥");
        huaSe.add("♣");
        huaSe.add("♦");
        return huaSe;
    }
}
