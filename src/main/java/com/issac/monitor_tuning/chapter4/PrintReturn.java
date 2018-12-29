package com.issac.monitor_tuning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

@BTrace
public class PrintReturn {


    @OnMethod(
            clazz = "com.issac.monitor_tuning.chapter4.Ch4Controller",
            method = "arg1",
            location = @Location(Kind.RETURN)
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, @Return AnyType args) {

        BTraceUtils.println(args);
        BTraceUtils.println(pcn + "," + pmn);
        BTraceUtils.println();

    }
}
