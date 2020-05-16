package cn.calling.day0410.demo01.System;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo02 {
    public static void main(String[] args) {
        int [] s={1,2,3,4,5};
        int [] e={6,7,8,9,10};
        System.arraycopy(s,0,e,0,3);
        System.out.println(Arrays.toString(e));
    }
}
