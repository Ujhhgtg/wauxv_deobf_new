package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.heytap.openid.sdk.OpenIDSDK;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class bp implements bf {
    private boolean a = false;

    @Override // com.umeng.analytics.pro.bf
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.a) {
            OpenIDSDK.a(context);
            this.a = true;
        }
        boolean zA = OpenIDSDK.a();
        bu.a("getOAID", "isSupported", Boolean.valueOf(zA));
        if (zA) {
            return OpenIDSDK.c(context);
        }
        return null;
    }
}
