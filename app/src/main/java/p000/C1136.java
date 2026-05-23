package p000;

import android.content.Context;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1136 {

    public static final int f4225 = (int) Math.round(5.1000000000000005d);

    public final boolean f4226;

    public final int f4227;

    public final int f4228;

    public final int f4229;

    public final float f4230;

    public C1136(Context context) {
        boolean zM4110 = AbstractC2207.m4110(context, R.attr.elevationOverlayEnabled, false);
        int iM4130 = AbstractC2209.m4130(context, R.attr.elevationOverlayColor, 0);
        int iM4131 = AbstractC2209.m4130(context, R.attr.elevationOverlayAccentColor, 0);
        int iM4132 = AbstractC2209.m4130(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4226 = zM4110;
        this.f4227 = iM4130;
        this.f4228 = iM4131;
        this.f4229 = iM4132;
        this.f4230 = f;
    }
}
