package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dq implements Serializable {
    private static Map<Class<? extends de>, Map<? extends dl, dq>> d = new HashMap();
    public final String a;
    public final byte b;
    public final dr c;

    public dq(String str, byte b, dr drVar) {
        this.a = str;
        this.b = b;
        this.c = drVar;
    }

    public static void a(Class<? extends de> cls, Map<? extends dl, dq> map) {
        d.put(cls, map);
    }

    public static Map<? extends dl, dq> a(Class<? extends de> cls) {
        if (!d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e.getMessage());
            } catch (InstantiationException e2) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            }
        }
        return d.get(cls);
    }
}
