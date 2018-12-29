package com.issac.monitor_tuning.chapter4;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;

/**
 *
 * author:  ywy
 * date:    2018-12-27
 * desc:
 */
@BTrace
public class PrintJinfo {
    static {
        BTraceUtils.println("System.Properties");
        BTraceUtils.printProperties();
        BTraceUtils.println("VM Flags");
        BTraceUtils.printVmArguments();
        BTraceUtils.println("OS Environment");
        BTraceUtils.printEnv();
        BTraceUtils.exit();
    }
}
