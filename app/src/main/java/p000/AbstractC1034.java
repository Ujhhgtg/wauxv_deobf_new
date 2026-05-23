package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1034 {

    public static AbstractC2205 f3778 = new C1919(0);

    public static final String[] f3779;

    public static final int f3780;

    public static final boolean f3781;

    public static int f3782 = 1;

    public static int f3783 = 1;

    static {
        float f = Resources.getSystem().getDisplayMetrics().density;
        f3779 = new String[]{"com.bytedance.sdk.openadsdk.stub.activity", "com.mobile.auth.gatewayauth", "com.google.android.gms.ads"};
        f3780 = -1;
        f3781 = true;
    }
}
