package com.umeng.analytics.pro;

import java.io.Serializable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dr implements Serializable {
    private final boolean a;
    public final byte b;
    private final String c;
    private final boolean d;

    public dr(byte b, boolean z) {
        this.b = b;
        this.a = false;
        this.c = null;
        this.d = z;
    }

    public boolean a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.b == 12;
    }

    public boolean d() {
        byte b = this.b;
        return b == 15 || b == 13 || b == 14;
    }

    public boolean e() {
        return this.d;
    }

    public dr(byte b) {
        this(b, false);
    }

    public dr(byte b, String str) {
        this.b = b;
        this.a = true;
        this.c = str;
        this.d = false;
    }
}
