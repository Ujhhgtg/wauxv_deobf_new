package com.umeng.commonsdk.vchannel;

import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String a = "https://pslog.umeng.com";
    public static String b = "https://pslog.umeng.com/";
    public static String c = "explog";
    public static final String d = "analytics";
    public static final String e = "ekv";
    public static final String f = "id";
    public static final String g = "ts";
    public static final String h = "ds";
    public static final String i = "pn";
    public static String j = "";

    static {
        String strM4746 = AbstractC2784.m4746(System.currentTimeMillis(), "SUB");
        StringBuilder sbM4753 = AbstractC2784.m4753(strM4746);
        sbM4753.append(String.format("%0" + (32 - strM4746.length()) + "d", 0));
        j = sbM4753.toString();
    }
}
