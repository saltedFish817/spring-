package com.qf.springBoot.test;

import org.junit.Test;

/**
 * Created by ZhangDian on 2019/7/8.
 */
public class serviceTest {


    @Test
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        int sum=0;
        for (int i = 0; i < 3; i++) {
            num1=num1++;
            num2=++num2;
            sum+=num1*num2;
        }
        System.out.println(sum);

    }

}
