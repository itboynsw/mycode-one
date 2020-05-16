package cn.calling.day0410.demo01.DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 1、准备牌
 * 2、洗牌
 * 3、发牌
 * 4、排序
 * 5、看牌
 */

public class demo04 {
    public static void main(String[] args) {
        //1、准备牌
        //创建一个map集合，存储牌的索引和组装好的牌
        HashMap<Integer,String> poker=new HashMap<>();
        //创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex=new ArrayList<>();
        //定义两个集合，存放花色和牌的序号
        String[] huaSe = {"♠", "♥", "♣", "♦"};
        String[] xuHao = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String xh : xuHao) {
            for (String hs : huaSe) {
                poker.put(index,hs+xh);
                pokerIndex.add(index);
                index++;
            }
        }
        Collections.shuffle(pokerIndex);
        ArrayList<Integer> firstList=new ArrayList<>();
        ArrayList<Integer> secondList=new ArrayList<>();
        ArrayList<Integer> thirdList=new ArrayList<>();
        ArrayList<Integer> diPaiList=new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer ls = pokerIndex.get(i);
            if (i >= 51)
                diPaiList.add(ls);
            else if (i % 3 == 0)
                firstList.add(ls);
            else if (i % 3 == 1)
                secondList.add(ls);
            else if (i % 3 == 2)
                thirdList.add(ls);
        }
        Collections.sort(firstList);
        Collections.sort(secondList);
        Collections.sort(thirdList);
        Collections.sort(diPaiList);
        //4.看牌
        lookPai("赌侠",poker,firstList);
        lookPai("赌神",poker,secondList);
        lookPai("赌圣",poker,thirdList);
        lookPai("底牌",poker,diPaiList);
    }

    //看牌
    private static void lookPai(String name,HashMap<Integer,String> poke,ArrayList<Integer> list)
    {
        System.out.print(name+": ");
        for (Integer key : list) {
            String s = poke.get(key);
            System.out.print(s+" ");
        }
        System.out.println();
    }
    private  static  void  Test()
    {
        System.out.println("测试Git");
    }
}
