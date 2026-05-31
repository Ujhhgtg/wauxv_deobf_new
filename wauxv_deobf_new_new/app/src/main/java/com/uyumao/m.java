package com.uyumao;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class m {
    public static volatile m a;
    public final SharedPreferences b = e.a().getSharedPreferences("um_social_azx", 0);

    public static m a() {
        if (a == null) {
            synchronized (m.class) {
                try {
                    if (a == null) {
                        a = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }
}
