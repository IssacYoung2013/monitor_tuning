package com.issac.monitor_tuning.chapter8;

/**
 *
 * author:  ywy
 * date:    2018-12-28
 * desc:
 */
public class Test5 {
    
    public static void f1() {
        final String x = "hello";
        final String y = x + "world";
        String z = x+y;
        System.out.println(z);
    }
    
    public void f2() {
        final String x = "hello";
        String y = x + "world";
        String z = x+y;
        System.out.println(z);
    }
}
