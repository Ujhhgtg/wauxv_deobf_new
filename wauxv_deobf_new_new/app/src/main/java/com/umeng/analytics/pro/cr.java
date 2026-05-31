package com.umeng.analytics.pro;

import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cr implements cp {
    private Set<Integer> a;

    public cr(Set<Integer> set) {
        this.a = set;
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean a() {
        Set<Integer> set = this.a;
        if (set == null || set.isEmpty()) {
            return true;
        }
        return !this.a.contains(Integer.valueOf(da.b()));
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
