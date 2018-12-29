package com.issac.monitor_tuning.chapter4;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import java.lang.reflect.Field;

@BTrace
public class PrintRegex {


    @OnMethod(
            clazz = "com.issac.monitor_tuning.chapter4.Ch4Controller",
            method = "/.*/"
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn) {

		BTraceUtils.println(pcn+","+pmn);
		BTraceUtils.println();
    }
}
