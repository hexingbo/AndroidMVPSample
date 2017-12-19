package com.wuxiaolong.androidmvpsample.utils;

import android.util.Log;

/**
 * 日志输出控制类 (Description),可以自定义输出的日志级别
 *
 * @author xp
 */
public class LogUtils {

    public static final int LEVEL_NONE = 100;// 日志输出级别NONE
    public static final int LEVEL_VERBOSE = 1;
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_WARN = 4;
    public static final int LEVEL_ERROR = 5;

    private static String mTag = "kunxupay===hxb===>";
    private static int mDebuggable = LEVEL_VERBOSE;// 允许输出日志的级别

    public static void v(String msg) {
        if (LEVEL_VERBOSE >= mDebuggable) {
            Log.v(mTag, msg);
        }
    }

    public static void d(String msg) {
        if (LEVEL_DEBUG >= mDebuggable) {
            Log.d(mTag, msg);
        }
    }

    public static void i(String msg) {
        if (LEVEL_INFO >= mDebuggable) {
            Log.i(mTag, msg);
        }
    }

    public static void w(String msg) {
        if (LEVEL_WARN >= mDebuggable) {
            Log.w(mTag, msg);
        }
    }

    public static void w(Throwable tr) {
        if (LEVEL_WARN >= mDebuggable) {
            Log.w(mTag, "", tr);
        }
    }

    public static void w(String msg, Throwable tr) {
        if (LEVEL_WARN >= mDebuggable && null != msg) {
            Log.w(mTag, msg, tr);
        }
    }

    public static void e(String msg) {
        if (LEVEL_ERROR >= mDebuggable) {
            Log.e(mTag, msg);
        }
    }

    public static void e(Throwable tr) {
        if (LEVEL_ERROR >= mDebuggable) {
            Log.e(mTag, "", tr);
        }
    }

    public static void e(String msg, Throwable tr) {
        if (LEVEL_ERROR >= mDebuggable && null != msg) {
            Log.e(mTag, msg, tr);
        }
    }
}
