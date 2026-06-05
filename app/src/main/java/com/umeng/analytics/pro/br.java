package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.vivo.identifier.IdentifierManager;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class br implements bf {
    @Override // com.umeng.analytics.pro.bf
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zA = IdentifierManager.a(context);
        bu.a("getOAID", "isSupported", Boolean.valueOf(zA));
        if (zA) {
            return IdentifierManager.b(context);
        }
        return null;
    }
}
