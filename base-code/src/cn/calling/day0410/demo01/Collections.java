package cn.calling.day0410.demo01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);
        coll.add("abc");
        coll.add("def");
        coll.add("ghi");
        coll.add("jkl");
        System.out.println(coll);
        String[] arr = {"abc", "bcd"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        System.out.println("==============");
        boolean b1 = coll.contains("abc");
        boolean b2 = coll.contains("abd");
        System.out.println("b1:" + b1 + ",b2:" + b2);
        boolean b3 = coll.isEmpty();
        System.out.println("b3:" + b3+",size:"+coll.size());
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        //coll.clear();
        System.out.println("***************");
        Iterator<String> its = coll.iterator();
        while (its.hasNext())
        {
            System.out.println(its.next());
        }
        int [] ints={1,3,5,8,7};
        for (int i:ints)
        {
            System.out.println(i);
        }
    }
}
