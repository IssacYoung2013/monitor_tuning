package com.issac.monitor_tuning.chapter8;

/**
 *
 * author:  ywy
 * date:    2018-12-28
 * desc:
 */
public class Test1 {
    public static void main(String[] args) {
        int a = 2;
        int b =3;
        int c = a + b;
        System.out.println(c);
    }

    /***
    public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
     # 操作数栈的深度2
     # 本地变量表最大长度（slot为单位），64位的是2，其他是1，索引是从0开始，如果是非static方法索引0代表this，后面是入参
     # 1个参数，实例方法多一个this参数
    stack=2, locals=4, args_size=1
         0: iconst_2 #常量2入栈
         1: istore_1 #出栈存本地变量1
         2: iconst_3 #常量3入栈
         3: istore_2 #出栈存本地变量2
         4: iload_1 #本地变量1压栈
         5: iload_2 #本地变量2压栈
         6: iadd    #栈顶两个元素计算结果
         7: istore_3 #结果存本地变量3
         8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
            11: iload_3 #本地变量3入栈
        12: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
            15: return
    LineNumberTable: #行号表
    line 11: 0
    line 12: 2
    line 13: 4
    line 14: 8
    line 15: 15
    LocalVariableTable: #本地变量表
    Start  Length  Slot  Name   Signature
            0      16     0  args   [Ljava/lang/String;
            2      14     1     a   I
            4      12     2     b   I
            8       8     3     c   I
     **/
}
