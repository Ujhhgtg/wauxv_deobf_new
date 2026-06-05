package com.umeng.analytics.pro;

import p000.AbstractC1225feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dy {
    public final String a;
    public final byte b;
    public final short c;

    public dy() {
        this("", (byte) 0, (short) 0);
    }

    public boolean a(dy dyVar) {
        return this.b == dyVar.b && this.c == dyVar.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TField name:'");
        sb.append(this.a);
        sb.append("' type:");
        sb.append((int) this.b);
        sb.append(" field-id:");
        return AbstractC1225feyxiexzfUjhhgtg.m2705Ujhhgtgfeyxiexzf(sb, this.c, ">");
    }

    public dy(String str, byte b, short s) {
        this.a = str;
        this.b = b;
        this.c = s;
    }
}
