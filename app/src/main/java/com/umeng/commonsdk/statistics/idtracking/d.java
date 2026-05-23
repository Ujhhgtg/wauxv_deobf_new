package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class d extends a {
    private static final String a = "idfa";
    private Context b;

    public d(Context context) {
        super("idfa");
        this.b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getIdfa(this.b);
    }
}
