package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.HashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class b {
    private static HashMap<String, PackageInfo> a = new HashMap<>();
    private static Object b = new Object();

    /* JADX INFO: compiled from: obf */
    public static class a {
        private static final b a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.a;
    }

    private b() {
    }

    public PackageInfo a(Context context, String str, int i) {
        PackageInfo packageInfo;
        synchronized (b) {
            try {
                if (a.containsKey(str)) {
                    UMRTLog.e("MobclickRT", "--->>> pkg： " + str + ", pkgInfo缓存命中，直接返回");
                    packageInfo = a.get(str);
                } else {
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(str, i);
                        UMRTLog.e("MobclickRT", "--->>> pkg： " + str + ", 获取pkgInfo并缓存");
                        a.put(str, packageInfo);
                    } catch (PackageManager.NameNotFoundException unused) {
                        a.put(str, null);
                        UMRTLog.e("MobclickRT", "--->>> pkg: " + str + "，目标包未安装。");
                        packageInfo = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return packageInfo;
    }
}
