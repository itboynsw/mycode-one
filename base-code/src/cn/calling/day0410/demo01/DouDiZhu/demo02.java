package cn.calling.day0410.demo01.DouDiZhu;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;

public class demo02 {
    public static void main(String[] args) {
        ArrayList<String> al01 = new ArrayList<>();//第一个人
        ArrayList<String> al02 = new ArrayList<>();//第二个人
        ArrayList<String> al03 = new ArrayList<>();//第三个人
        ArrayList<String> al04 = new ArrayList<>();//底牌
        demo01 de = new demo01();
        ArrayList<String> allList = de.zhunBei();
        Collections.shuffle(allList);
        for (int i = 0; i < allList.size(); i++) {
            if (i >= 51) {
                al04.add(allList.get(i));
                continue;
            }
            if (i % 3 == 0)
                al01.add(allList.get(i));
            if (i % 3 == 1)
                al02.add(allList.get(i));
            if (i % 3 == 2)
                al03.add(allList.get(i));
        }
        System.out.println("=============================");
        if (al01.contains("大王"))
            al01.addAll(al04);
        if (al02.contains("大王"))
            al02.addAll(al04);
        if (al03.contains("大王"))
            al03.addAll(al04);
        System.out.print(al01);
        System.out.println();
        System.out.print(al02);
        System.out.println();
        System.out.println(al03);
        System.out.println("=============================");
    }
}
