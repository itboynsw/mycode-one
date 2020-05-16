package cn.calling.day0410.demo01;
/*
* 冒泡
* */
public class MaoPao {
    public static void main(String[] args) {
        int [] arr={1,6,9,7,8,2,5};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j  = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
