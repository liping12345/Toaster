package com.hjq.toast;

import android.app.Application;

import com.hjq.toast.config.IToastStyle;

/**
 * Created by LiPing at 2023/10/25 18:08
 * ================================================
 * Toaster代理类
 * ================================================
 */
public class ToastUtils {

    public static void init(Application application) {
        Toaster.init(application);
    }

    public static void init(Application application, IToastStyle<?> style) {
        Toaster.init(application, style);
    }


    public static boolean isInit() {
        return Toaster.isInit();
    }

    public static void show(int id) {
        Toaster.show(id);
    }

    public static void show(CharSequence text) {
        Toaster.show(text);
    }

    public static void show(Object object) {
        Toaster.show(object);
    }

    public static void showShort(int id) {

        Toaster.showShort(id);
    }

    public static void showShort(CharSequence text) {
        Toaster.showShort(text);
    }

    public static void showShort(Object object) {
        Toaster.showShort(object);
    }

    public static void showLong(int id) {
        Toaster.showLong(id);
    }

    public static void showLong(CharSequence text) {
        Toaster.showLong(text);
    }

    public static void showLong(Object object) {
        Toaster.showLong(object);
    }

    public static void setView(int id) {
        Toaster.setView(id);
    }

    public static void setStyle(IToastStyle<?> style) {
        Toaster.setStyle(style);
    }

    public static void delayedShow(CharSequence text, long delayMillis) {
        Toaster.delayedShow(text, delayMillis);
    }

    public static void setDebugMode(boolean debug) {
        Toaster.setDebugMode(debug);
    }
}

