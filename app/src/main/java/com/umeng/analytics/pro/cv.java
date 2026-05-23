package com.umeng.analytics.pro;

import android.text.TextUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cv implements cp {
    private String a;
    private String b;

    public cv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean a() {
        try {
            if (!TextUtils.isEmpty(this.a) && !TextUtils.isEmpty(this.b)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                return jCurrentTimeMillis >= da.a(this.a) && jCurrentTimeMillis <= da.a(this.b);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.cp
    public long c() {
        return 0L;
    }
}
