package com.issac.monitor_tuning.chapter8;

/**
 * author:  ywy
 * date:    2018-12-28
 * desc:
 */
public class Test2 {
    public static void main(String[] args) {
        f3();
        f4();
    }

    /**
     public static void f1();
     descriptor: ()V
     flags: ACC_PUBLIC, ACC_STATIC
     Code:
     stack=2, locals=1, args_size=0
     0: iconst_0
     1: istore_0
     2: iload_0
     3: bipush        10
     5: if_icmpge     21
     8: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
     11: iload_0
     12: invokevirtual #5                  // Method java/io/PrintStream.println:(I)V
     15: iinc          0, 1
     18: goto          2
     21: return
     LineNumberTable:
     line 15: 0
     line 16: 8
     line 15: 15
     line 18: 21
     LocalVariableTable:
     Start  Length  Slot  Name   Signature
     2      19     0     i   I
     StackMapTable: number_of_entries = 2
     frame_type = 252 /* append *
    offset_delta = 2
    locals = [ int ]
    frame_type = 250 /* chop *
    offset_delta = 18
     **/
    public static void f1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    /**
    public static void f2();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
    stack=2, locals=1, args_size=0
            0: iconst_0
         1: istore_0
         2: iload_0
         3: bipush        10
            5: if_icmpge     14
            8: iinc          0, 1
            11: goto          2
            14: return
    LineNumberTable:
    line 21: 0
    line 24: 14
    LocalVariableTable:
    Start  Length  Slot  Name   Signature
            2      12     0     i   I
    StackMapTable: number_of_entries = 2
    frame_type = 252 /* append *
    offset_delta = 2
    locals = [ int ]
    frame_type = 250 /* chop *
    offset_delta = 11
    **/
    public static void f2() {
        for (int i = 0; i < 10; ++i) {

        }
    }

    public static void f3() {
        int i = 0;
        int j = i++;
        System.out.println(j);
    }

    public static void f4() {
        int i = 0;
        int j = ++i;
        System.out.println(j);
    }
}
