package cn.calling.day0410.demo01.DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;

public class demo03 {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> poke = new ArrayList<>();
        poke.add("大王");
        poke.add("小王");
        String[] huaSe = {"♠", "♥", "♣", "♦"};
        String[] xuHao = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        for (String hs : huaSe) {
            for (String xh : xuHao) {
                poke.add(hs + xh);
            }
        }
        //2.洗牌
        Collections.shuffle(poke);
        //3.发牌
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        ArrayList<String> three = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < poke.size(); i++) {
            if (i >= 51)
                diPai.add(poke.get(i));
            else if (i % 3 == 0)
                one.add(poke.get(i));
            else if (i % 3 == 1)
                two.add(poke.get(i));
            else if (i % 3 == 2)
                three.add(poke.get(i));
        }
        //4.看牌
        System.out.println("张三：" + one);
        System.out.println("李四：" + two);
        System.out.println("王五：" + three);
        System.out.println("底牌：" + diPai);
    }
}
