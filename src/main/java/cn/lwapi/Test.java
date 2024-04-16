package cn.lwapi;


import java.util.Random;

public class Test {

    public static void main(String[] args) {

        //大小写字母进入数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //使用ASCII值 A-Z a-z
            if (i <= 25){  //a->97
                chs[i] = (char) (97 + i);
            } else{ //A->65
                chs[i] = (char) (65 + i - 26);
            }
        }

       String result = "";
        //随机抽取4次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
           result =  result + chs[randomIndex];
        }

        //添加数字，拼接
        int muber = r.nextInt(10);
        result = result + muber;

        //打印 验证码
         System.out.println(result);
        }

}
