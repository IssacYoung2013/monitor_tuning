package com.issac.monitor_tuning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

//import com.issac.monitor_tuning.chapter2.User;

@BTrace
public class PrintOnThrow {

    /**
     * store current exception in a thread local
     * variable @TLS annotation Note that we can't store
     * store it in a global variable
     */
    @TLS
    static Throwable currentException;

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow(@Self Throwable self) { // new Throwable()
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow1(@Self Throwable self,String s) {
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow1(@Self Throwable self,String s,Throwable cause) {
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow2(@Self Throwable self,Throwable cause) {
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>",
            location = @Location(Kind.RETURN)
    )
    public static void onthrowreturn() {
        if(currentException != null) {
            BTraceUtils.Threads.jstack(currentException);
            BTraceUtils.println("=============");
            currentException = null;
        }
    }
}
