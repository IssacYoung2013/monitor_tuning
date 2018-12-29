package com.issac.monitor_tuning.chapter8;

/**
 *
 * author:  ywy
 * date:    2018-12-28
 * desc:
 */
public class Test4 {
    public static void main(String[] args) {

    }

    public static String f1() {
        String str = "hello";
        try {
            return str;
        }
        finally {
            str = "issac";
        }
    }
}
