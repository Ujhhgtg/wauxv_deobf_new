package com.umeng.analytics.pro;

import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class eb {
    public final String a;
    public final byte b;
    public final int c;

    public eb() {
        this("", (byte) 0, 0);
    }

    public boolean a(eb ebVar) {
        return this.a.equals(ebVar.a) && this.b == ebVar.b && this.c == ebVar.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof eb) {
            return a((eb) obj);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TMessage name:'");
        sb.append(this.a);
        sb.append("' type: ");
        sb.append((int) this.b);
        sb.append(" seqid:");
        return AbstractC2784.m4751(sb, this.c, ">");
    }

    public eb(String str, byte b, int i) {
        this.a = str;
        this.b = b;
        this.c = i;
    }
}
