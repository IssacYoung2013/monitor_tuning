package com.issac.monitor_tuning.chapter4;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import com.issac.monitor_tuning.chapter2.User;

import java.lang.reflect.Field;

@BTrace
public class PrintArgComplex {


    @OnMethod(
            clazz = "com.issac.monitor_tuning.chapter4.Ch4Controller",
            method = "construct",
            location = @Location(Kind.ENTRY)
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, User user) {

		//print all fields
		BTraceUtils.printFields(user);
		//print one field
		Field filed2 = BTraceUtils.field("com.issac.monitor_tuning.chapter2.User", "name");
		BTraceUtils.println(BTraceUtils.get(filed2, user));
		BTraceUtils.println(pcn+","+pmn);
		BTraceUtils.println();
    }
}
