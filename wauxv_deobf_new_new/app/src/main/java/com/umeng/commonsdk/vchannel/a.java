package com.umeng.commonsdk.vchannel;

import p000.AbstractC2844;

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
        String strM4780 = AbstractC2844.m4780(System.currentTimeMillis(), "SUB");
        StringBuilder sbM4787 = AbstractC2844.m4787(strM4780);
        sbM4787.append(String.format("%0" + (32 - strM4780.length()) + "d", 0));
        j = sbM4787.toString();
    }
}
