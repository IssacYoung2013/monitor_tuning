package com.issac.monitor_tuning.chapter4;

import java.lang.reflect.Field;

//import com.issac.monitor_tuning.chapter2.User;
import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;

@BTrace
public class PrintArgSimple {


    @OnMethod(
            clazz = "com.issac.monitor_tuning.chapter4.Ch4Controller",
            method = "arg1",
            location = @Location(Kind.ENTRY)
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, AnyType[] args) {

        BTraceUtils.printArray(args);
        BTraceUtils.println(pcn + "," + pmn);
        BTraceUtils.println();

//		//print all fields
//		BTraceUtils.printFields(user);
//		//print one field
//		Field filed2 = BTraceUtils.field("com.issac.monitor_tuning.chapter2.User", "name");
//		BTraceUtils.println(BTraceUtils.get(filed2, user));
//		BTraceUtils.println(pcn+","+pmn);
//		BTraceUtils.println();
    }
}
