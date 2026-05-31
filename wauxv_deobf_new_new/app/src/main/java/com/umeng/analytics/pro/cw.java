package com.umeng.analytics.pro;

import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cw implements cp {
    private Set<Integer> a;

    public cw(Set<Integer> set) {
        this.a = set;
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean a() {
        try {
            Set<Integer> set = this.a;
            if (set != null && !set.isEmpty()) {
                return !this.a.contains(Integer.valueOf(da.a()));
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
