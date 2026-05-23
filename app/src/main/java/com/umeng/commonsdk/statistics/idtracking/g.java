package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class g extends a {
    private static final String a = "imei";
    private Context b;

    public g(Context context) {
        super("imei");
        this.b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getImeiNew(this.b);
    }
}
