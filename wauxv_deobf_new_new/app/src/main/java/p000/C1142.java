package p000;

import android.content.Context;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲀᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1142 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final int f4237 = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean f4238;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f4239;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f4240;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f4241;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f4242;

    public C1142(Context context) {
        boolean zM3346 = AbstractC1469.m3346(context, R.attr.elevationOverlayEnabled, false);
        int iM3362 = AbstractC1470.m3362(context, R.attr.elevationOverlayColor, 0);
        int iM3363 = AbstractC1470.m3362(context, R.attr.elevationOverlayAccentColor, 0);
        int iM3364 = AbstractC1470.m3362(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4238 = zM3346;
        this.f4239 = iM3362;
        this.f4240 = iM3363;
        this.f4241 = iM3364;
        this.f4242 = f;
    }
}
