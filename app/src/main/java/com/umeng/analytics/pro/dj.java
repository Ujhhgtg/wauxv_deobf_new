package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dj {
    public static di a(Class<? extends di> cls, int i) {
        try {
            return (di) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
