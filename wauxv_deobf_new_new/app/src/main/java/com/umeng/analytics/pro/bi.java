package com.umeng.analytics.pro;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class bi {
    @SuppressLint({"SuspiciousIndentation"})
    public static bf a() {
        String str = Build.BRAND;
        bu.a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (bt.d()) {
            return new bk();
        }
        if (bt.e()) {
            return new bl();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new bs();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new br();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new bp();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk") || str.equalsIgnoreCase("motorola")) {
            return new bm();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new bo();
        }
        if (str.equalsIgnoreCase("samsung")) {
            return new bq();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu") || bt.a()) {
            return new bn();
        }
        if (bt.f()) {
            return new bh();
        }
        if (bt.g()) {
            return new bj();
        }
        return null;
    }
}
