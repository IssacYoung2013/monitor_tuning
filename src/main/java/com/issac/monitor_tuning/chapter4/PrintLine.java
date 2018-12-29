package com.issac.monitor_tuning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

//import com.issac.monitor_tuning.chapter2.User;

@BTrace
public class PrintLine {


    @OnMethod(
            clazz = "com.issac.monitor_tuning.chapter4.Ch4Controller",
            location = @Location(value = Kind.LINE, line = 40)
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, int line) {

        BTraceUtils.println(pcn + "," + pmn + "," + line);
        BTraceUtils.println();
    }
}
