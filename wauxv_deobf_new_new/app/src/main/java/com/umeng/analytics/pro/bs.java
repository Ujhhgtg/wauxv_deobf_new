package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.miui.deviceid.IdentifierManager;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class bs implements bf {
    @Override // com.umeng.analytics.pro.bf
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zA = IdentifierManager.a();
        bu.a("getOAID", "isSupported", Boolean.valueOf(zA));
        if (zA) {
            return IdentifierManager.b(context);
        }
        return null;
    }
}
