package com.issac.monitor_tuning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;

/**
 *
 * author:  ywy
 * date:    2018-12-27
 * desc:
 */
@BTrace
public class PrintSame {

    @OnMethod(
            clazz = "com.issac.monitor_tuning.chapter4.Ch4Controller",
            method = "same"
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, String name){
        BTraceUtils.println(pcn + "," + pmn + "," + name );
        BTraceUtils.println();
    }
}
