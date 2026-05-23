package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C0020;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᲈᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1100 implements InterfaceC3427 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC3427 f4126;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f4127;

    public C1100(InterfaceC3427 interfaceC3427, boolean z) {
        this.f4126 = interfaceC3427;
        this.f4127 = z;
    }

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        if (obj instanceof C1100) {
            return this.f4126.equals(((C1100) obj).f4126);
        }
        return false;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        return this.f4126.hashCode();
    }

    @Override // p000.InterfaceC3427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2568 mo1630(Context context, InterfaceC2568 interfaceC2568, int i, int i2) {
        InterfaceC0424 interfaceC0424 = ComponentCallbacks2C0020.m614(context).f537;
        Drawable drawable = (Drawable) interfaceC2568.get();
        C0425 c0425M4051 = AbstractC2205.m4051(interfaceC0424, drawable, i, i2);
        if (c0425M4051 != null) {
            InterfaceC2568 interfaceC2568Mo1630 = this.f4126.mo1630(context, c0425M4051, i, i2);
            if (!interfaceC2568Mo1630.equals(c0425M4051)) {
                return new C0425(context.getResources(), interfaceC2568Mo1630);
            }
            interfaceC2568Mo1630.mo1206();
            return interfaceC2568;
        }
        if (!this.f4127) {
            return interfaceC2568;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p000.InterfaceC1749
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2001(MessageDigest messageDigest) {
        this.f4126.mo2001(messageDigest);
    }
}
